package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.SearchProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by samao on 2/29/16.
 */
@Service
public class SearchManager {

    @Autowired
    SearchRequest searchRequest;

    @Autowired
    SearchResponse searchResponse;

    RestTemplate restTemplate = new RestTemplate();

    /**
     *
     * @param itemName
     * @return
     */
    public SearchResponse searchForProduct(String itemName) {
        searchRequest.setProduct(itemName);
        String request = searchRequest.getRequest();
        searchResponse.setSearchProduct(restTemplate.getForObject(request, SearchProduct.class));
        return searchResponse;
    }
}
