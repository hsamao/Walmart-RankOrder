package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewClient;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class ReviewResponse {

    private ReviewClient reviewClient;

    public ReviewClient getReviewClient() {
        return reviewClient;
    }

    public void setReviewClient(ReviewClient reviewClient) {
        this.reviewClient = reviewClient;
    }
}
