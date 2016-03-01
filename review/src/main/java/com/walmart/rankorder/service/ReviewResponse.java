package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class ReviewResponse {

    private ReviewProduct reviewProduct;

    public ReviewProduct getReviewProduct() {
        return reviewProduct;
    }

    public void setReviewProduct(ReviewProduct reviewProduct) {
        this.reviewProduct = reviewProduct;
    }
}
