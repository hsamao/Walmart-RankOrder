package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.RecommendClient;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class RecommendResponse {

    private RecommendClient recommendClient;

    public RecommendClient getRecommendClient() {
        return recommendClient;
    }

    public void setRecommendClient(RecommendClient recommendClient) {
        this.recommendClient = recommendClient;
    }
}
