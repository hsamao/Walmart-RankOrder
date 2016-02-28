package com.walmart.rankorder.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/25/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Review {

    private String name;
    private OverallRating overallRating;
    private String reviewer;
    private String reviewText;
    private String submissionTime;
    private String title;
    private Long upVotes;
    private Long downVotes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OverallRating getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(OverallRating overallRating) {
        this.overallRating = overallRating;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(Long upVotes) {
        this.upVotes = upVotes;
    }

    public Long getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(Long downVotes) {
        this.downVotes = downVotes;
    }
}
