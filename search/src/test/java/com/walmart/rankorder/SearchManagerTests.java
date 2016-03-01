package com.walmart.rankorder;

import com.walmart.rankorder.service.SearchManager;
import com.walmart.rankorder.service.SearchResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SearchApplication.class)
@WebAppConfiguration
public class SearchManagerTests {

    @Autowired
    SearchResponse searchResponse;

    @Autowired
    SearchManager searchManager;


    @Test
    public void testSearchForProduct() {
        searchResponse = searchManager.searchForProduct("ipod");
        Assert.assertNotNull(searchResponse);
    }

}
