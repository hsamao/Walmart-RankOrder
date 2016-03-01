package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.TreeSet;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class GatewayManager {

    @Autowired
    SearchManager searchManager;

    @Autowired
    RecommendManager recommendManager;

    @Autowired
    ReviewManager reviewManager;

    @Autowired
    GatewayResponse gatewayResponse;


    public GatewayResponse searchProductByName(String name) {
        gatewayResponse.setSearchResponse(searchManager.searchForProduct(name));
        return gatewayResponse;
    }

    public GatewayResponse recommendProductByItemId(Long itemId) {
        gatewayResponse.setRecommendResponse(recommendManager.getRecommendProduct(itemId));
        return gatewayResponse;
    }

    public GatewayResponse reviewProductByItemId(Long itemId) {
        gatewayResponse.setReviewResponse(reviewManager.getReviewProduct(itemId));
        return gatewayResponse;
    }

    public TreeSet<ReviewProduct> orderProductByReview(String productName) {
        gatewayResponse = searchProductByName(productName);

        TreeSet<ReviewProduct> orderedItems = new TreeSet<ReviewProduct>(gatewayResponse);
        int size = gatewayResponse.getSearchResponse().getSearchProduct().getItems().size();
        for (int i = 0; i < size; i++) {
            Long itemId = Long.valueOf(gatewayResponse.getSearchResponse().getSearchProduct().getItems().get(i).getItemId());
            GatewayResponse newGatewayResponse = reviewProductByItemId(itemId);
            orderedItems.add(newGatewayResponse.getReviewResponse().getReviewProduct());
        }
        return orderedItems;
    }
}
