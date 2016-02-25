package com.walmart.rankorder.review;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/25/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OverallRating {

    private String label;
    private Long rating;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}
