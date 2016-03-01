package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;

import java.util.Comparator;

/**
 * Created by samao on 2/29/16.
 */
public class WeightedRank {

    private Double rank;
    private ReviewProduct reviewProduct;

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public ReviewProduct getReviewProduct() {
        return reviewProduct;
    }

    public void setReviewProduct(ReviewProduct reviewProduct) {
        this.reviewProduct = reviewProduct;
    }
}
