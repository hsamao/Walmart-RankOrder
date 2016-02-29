package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.Item;
import com.walmart.rankorder.domain.RecommendClient;
import com.walmart.rankorder.domain.ReviewClient;
import com.walmart.rankorder.domain.SearchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.TreeSet;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class GatewayManager {

    @Autowired
    GatewayRequest gatewayRequest;

    @Autowired
    GatewayResponse gatewayResponse;

    @Autowired
    SearchRequest searchRequest;

    @Autowired
    RecommendRequest recommendRequest;

    @Autowired
    ReviewRequest reviewRequest;

    RestTemplate restTemplate = new RestTemplate();


    public GatewayResponse searchProductName(String productName) {
        searchRequest.setProduct(productName);
        gatewayRequest.setSearchRequest(searchRequest);
        gatewayResponse.setSearchClient(restTemplate.getForObject(gatewayRequest.getSearchRequest().getRequest(), SearchClient.class));
        return gatewayResponse;
    }

    public GatewayResponse recommendProduct(Long itemId) {
        recommendRequest.setItemId(itemId);
        gatewayRequest.setRecommendRequest(recommendRequest);
        gatewayResponse.setRecommendClient(restTemplate.getForObject(gatewayRequest.getRecommendRequest().getRequest(), RecommendClient.class));
        return gatewayResponse;
    }

    public GatewayResponse reviewProduct(Long itemId) {
        reviewRequest.setItemId(itemId);
        gatewayRequest.setReviewRequest(reviewRequest);
        gatewayResponse.setReviewClient(restTemplate.getForObject(gatewayRequest.getReviewRequest().getRequest(), ReviewClient.class));
        return gatewayResponse;
    }

    public TreeSet<ReviewClient> rankOrder(String productName) {
        gatewayResponse = searchProductName(productName);

        TreeSet<ReviewClient> orderedItems = new TreeSet<ReviewClient>(gatewayResponse);
        int size = gatewayResponse.getSearchClient().getItems().size();
        for (int i = 0; i < size; i++) {
            Long itemId = Long.valueOf(gatewayResponse.getSearchClient().getItems().get(i).getItemId());
            GatewayResponse newGatewayResponse = reviewProduct(itemId);
            orderedItems.add(newGatewayResponse.getReviewClient());
        }
        return orderedItems;
    }
}
