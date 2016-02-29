package com.walmart.rankorder.service;

import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class GatewayRequest {

    private SearchRequest searchRequest;
    private RecommendRequest recommendRequest;
    private ReviewRequest reviewRequest;

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public RecommendRequest getRecommendRequest() {
        return recommendRequest;
    }

    public void setRecommendRequest(RecommendRequest recommendRquest) {
        this.recommendRequest = recommendRquest;
    }

    public ReviewRequest getReviewRequest() {
        return reviewRequest;
    }

    public void setReviewRequest(ReviewRequest reviewRequest) {
        this.reviewRequest = reviewRequest;
    }
}
