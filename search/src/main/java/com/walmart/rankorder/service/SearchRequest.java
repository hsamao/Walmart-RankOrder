package com.walmart.rankorder.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by samao on 2/28/16.
 */
@Component
public class SearchRequest {

    @Value("${url}")
    private String url;
    @Value("${query}")
    private String query;
    @Value("${format}")
    private String format;
    @Value("${apiKey}")
    private String apiKey;

    private String product;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRequest() {
        return url + query + product + "&" + format + "&" + apiKey;
    }


}
