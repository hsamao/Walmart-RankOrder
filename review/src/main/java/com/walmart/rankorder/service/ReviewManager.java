package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by samao on 2/29/16.
 */
@Service
public class ReviewManager {

    @Autowired
    ReviewRequest reviewRequest;

    @Autowired
    ReviewResponse reviewResponse;

    RestTemplate restTemplate = new RestTemplate();

    public ReviewResponse getReviewProduct(Long itemId) {
        reviewRequest.setItemId(itemId);
        String request = reviewRequest.getRequest();
        reviewResponse.setReviewProduct(restTemplate.getForObject(request, ReviewProduct.class));
        return reviewResponse;
    }
}
