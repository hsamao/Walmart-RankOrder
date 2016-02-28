package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.SearchClient;
import org.springframework.stereotype.Component;


/**
 * Created by samao on 2/28/16.
 */

@Component
public class SearchResponse {

    private SearchClient searchClient;

    public SearchClient getSearchClient() {
        return searchClient;
    }

    public void setSearchClient(SearchClient searchClient) {
        this.searchClient = searchClient;
    }
}
