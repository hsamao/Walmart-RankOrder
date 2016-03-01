package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.SearchProduct;
import org.springframework.stereotype.Component;


/**
 * Created by samao on 2/28/16.
 */

@Component
public class SearchResponse {

    private SearchProduct searchProduct;

    public SearchProduct getSearchProduct() {
        return searchProduct;
    }

    public void setSearchProduct(SearchProduct searchProduct) {
        this.searchProduct = searchProduct;
    }
}
