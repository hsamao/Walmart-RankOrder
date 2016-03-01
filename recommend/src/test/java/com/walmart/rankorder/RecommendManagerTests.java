package com.walmart.rankorder;

import com.walmart.rankorder.service.RecommendManager;
import com.walmart.rankorder.service.RecommendResponse;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RecommendApplication.class)
@WebAppConfiguration
public class RecommendManagerTests {

    @Autowired
    RecommendResponse recommendResponse;

    @Autowired
    RecommendManager recommendManager;

    @Test
    public void testRecommendProduct() {
        recommendResponse = recommendManager.getRecommendProduct(42608121L);
        Assert.assertNotNull(recommendResponse);
    }

}
