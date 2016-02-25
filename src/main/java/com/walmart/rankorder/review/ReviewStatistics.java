package com.walmart.rankorder.review;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/25/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewStatistics {

    private Double averageOverallRating;
    private Long overallRatingRange;
    private RatingDistributions[] ratingDistributions;
    private Long totalReviewCount;

    public Double getAverageOverallRating() {
        return averageOverallRating;
    }

    public void setAverageOverallRating(Double averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    public Long getOverallRatingRange() {
        return overallRatingRange;
    }

    public void setOverallRatingRange(Long overallRatingRange) {
        this.overallRatingRange = overallRatingRange;
    }

    public RatingDistributions[] getRatingDistributions() {
        return ratingDistributions;
    }

    public void setRatingDistributions(RatingDistributions[] ratingDistributions) {
        this.ratingDistributions = ratingDistributions;
    }

    public Long getTotalReviewCount() {
        return totalReviewCount;
    }

    public void setTotalReviewCount(Long totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }
}
