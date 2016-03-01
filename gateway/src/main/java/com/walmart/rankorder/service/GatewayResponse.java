package com.walmart.rankorder.service;

import org.springframework.stereotype.Component;

import java.util.Comparator;

/**
 * Created by samao on 2/28/16.
 */
@Component
public class GatewayResponse implements Comparator<WeightedRank> {

    SearchResponse searchResponse;
    RecommendResponse recommendResponse;
    ReviewResponse reviewResponse;

    public SearchResponse getSearchResponse() {
        return searchResponse;
    }

    public void setSearchResponse(SearchResponse searchResponse) {
        this.searchResponse = searchResponse;
    }

    public RecommendResponse getRecommendResponse() {
        return recommendResponse;
    }

    public void setRecommendResponse(RecommendResponse recommendResponse) {
        this.recommendResponse = recommendResponse;
    }

    public ReviewResponse getReviewResponse() {
        return reviewResponse;
    }

    public void setReviewResponse(ReviewResponse reviewResponse) {
        this.reviewResponse = reviewResponse;
    }

    public int compare(WeightedRank weightedRank1, WeightedRank weightedRank2) {
        int value = 1;
        if (weightedRank1.getRank() != null && weightedRank2.getRank() != null) {
            if (weightedRank1.getRank() > weightedRank2.getRank()) {
                value = -1;
            }
        }
        return value;
    }
}
