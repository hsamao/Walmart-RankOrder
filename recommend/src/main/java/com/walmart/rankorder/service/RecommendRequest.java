package com.walmart.rankorder.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */

@Component
public class RecommendRequest {

    @Value("${url}")
    private String url;
    @Value("${item}")
    private String item;
    @Value("${format}")
    private String format;
    @Value("${apiKey}")
    private String apiKey;

    private Long itemId;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getRequest() {
        return url + item + itemId + "?" + format + "&" + apiKey;
    }
}
