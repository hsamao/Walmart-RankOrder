package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;
import org.springframework.stereotype.Component;

import java.util.Comparator;

/**
 * Created by samao on 2/28/16.
 */
@Component
public class GatewayResponse implements Comparator<ReviewProduct> {

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

    public int compare(ReviewProduct reviewProduct1, ReviewProduct reviewProduct2) {
        int value = 1;
        if (reviewProduct1.getReviewStatistics() != null && reviewProduct2.getReviewStatistics() != null) {
            if (reviewProduct1.getReviewStatistics().getAverageOverallRating() != null
                    && reviewProduct2.getReviewStatistics().getAverageOverallRating() != null) {
                if (reviewProduct1.getReviewStatistics().getAverageOverallRating() > reviewProduct2.getReviewStatistics().getAverageOverallRating()) {
                    value = -1;
                }
            }
        }
        return value;
    }
}
