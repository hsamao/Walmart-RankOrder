package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.SearchProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by samao on 2/29/16.
 */
@Component
public class SearchManager {

    @Autowired
    SearchRequest searchRequest;
    @Autowired
    SearchResponse searchResponse;

    RestTemplate restTemplate = new RestTemplate();


    public SearchResponse searchForProduct(String itemName){
        searchRequest.setProduct(itemName);
        String request = searchRequest.getRequest();
        searchResponse.setSearchProduct(restTemplate.getForObject(request,SearchProduct.class));
        return searchResponse;
    }
}
