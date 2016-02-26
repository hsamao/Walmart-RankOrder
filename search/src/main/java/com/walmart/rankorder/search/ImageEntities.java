package com.walmart.rankorder.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/24/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageEntities {

    private String thumbnailImage;
    private String mediumImage;
    private String largeImage;
    private String entityType;

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}
