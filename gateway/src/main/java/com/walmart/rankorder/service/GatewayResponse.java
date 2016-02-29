package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.RecommendClient;
import com.walmart.rankorder.domain.ReviewClient;
import com.walmart.rankorder.domain.SearchClient;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

/**
 * Created by samao on 2/28/16.
 */
@Component
public class GatewayResponse implements Comparator<ReviewClient> {

    List<ReviewClient> reviewClients;
    SearchClient searchClient;
    RecommendClient recommendClient;
    SearchResponse searchResponse;
    ReviewClient reviewClient;

    public List<ReviewClient> getReviewClients() {
        return reviewClients;
    }

    public void setReviewClients(List<ReviewClient> reviewClients) {
        this.reviewClients = reviewClients;
    }

    public SearchClient getSearchClient() {
        return searchClient;
    }

    public void setSearchClient(SearchClient searchClient) {
        this.searchClient = searchClient;
    }

    public SearchResponse getSearchResponse() {
        return searchResponse;
    }

    public void setSearchResponse(SearchResponse searchResponse) {
        this.searchResponse = searchResponse;
    }

    public RecommendClient getRecommendClient() {
        return recommendClient;
    }

    public void setRecommendClient(RecommendClient recommendClient) {
        this.recommendClient = recommendClient;
    }

    public ReviewClient getReviewClient() {
        return reviewClient;
    }

    public void setReviewClient(ReviewClient reviewClient) {
        this.reviewClient = reviewClient;
    }

    public int compare(ReviewClient reviewClient1, ReviewClient reviewClient2) {
        int value = 1;
        if (reviewClient1.getReviewStatistics() != null && reviewClient2.getReviewStatistics() != null) {
            if (reviewClient1.getReviewStatistics().getAverageOverallRating() != null
                    && reviewClient2.getReviewStatistics().getAverageOverallRating() != null) {
                if (reviewClient1.getReviewStatistics().getAverageOverallRating() > reviewClient2.getReviewStatistics().getAverageOverallRating()) {
                    value = -1;
                }
            }
        }
        return value;
    }
}
