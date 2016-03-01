package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.RecommendProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by samao on 2/29/16.
 */
@Service
public class RecommendManager {

    @Autowired
    RecommendRequest recommendRequest;

    @Autowired
    RecommendResponse recommendResponse;

    RestTemplate restTemplate = new RestTemplate();


    public RecommendResponse getRecommendProduct(Long itemId) {
        recommendRequest.setItemId(itemId);
        String request = recommendRequest.getRequest();
        recommendResponse.setRecommendProduct(restTemplate.getForObject(request, RecommendProduct.class));
        return recommendResponse;
    }

}
