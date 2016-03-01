package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.RecommendProduct;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class RecommendResponse {

    private RecommendProduct recommendProduct;

    public RecommendProduct getRecommendProduct() {
        return recommendProduct;
    }

    public void setRecommendProduct(RecommendProduct recommendProduct) {
        this.recommendProduct = recommendProduct;
    }
}
