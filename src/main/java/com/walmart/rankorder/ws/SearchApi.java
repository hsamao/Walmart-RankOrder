package com.walmart.rankorder.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/23/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchApi {

    private String query;
    private String sort;
    private String totalResults;
    private String start;
    private String numItems;

    public SearchApi() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getNumItems() {
        return numItems;
    }

    public void setNumItems(String numItems) {
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "SearchApi{" +
                "query='" + query + '\'' +
                ", sort='" + sort + '\'' +
                ", totalResults='" + totalResults + '\'' +
                ", start='" + start + '\'' +
                ", numItems='" + numItems + '\'' +
                '}';
    }
}
