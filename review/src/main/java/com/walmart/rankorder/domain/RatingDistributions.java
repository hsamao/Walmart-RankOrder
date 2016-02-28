package com.walmart.rankorder.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/25/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingDistributions {

    private Long count;
    private Long ratingValue;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(Long ratingValue) {
        this.ratingValue = ratingValue;
    }
}
