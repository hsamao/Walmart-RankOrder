package com.walmart.rankorder;

import com.walmart.rankorder.service.GatewayManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GatewayApplication.class)
@WebAppConfiguration
public class GatewayManagerTests {

    @Autowired
    GatewayManager gatewayManager;

    @Test
    public void testSearchProductByName() {
        gatewayManager.searchProductByName("ipod");
        Assert.assertNotNull(gatewayManager);
    }

    @Test
    public void testRecommendProductByItemId() {
        gatewayManager.recommendProductByItemId(42608121L);
        Assert.assertNotNull(gatewayManager);
    }

    @Test
    public void testReviewProductByItemId() {
        gatewayManager.reviewProductByItemId(42608121L);
        Assert.assertNotNull(gatewayManager);
    }

    @Test
    public void testOrderProductByReview() {
        gatewayManager.orderProductByReview("ipod");
        Assert.assertNotNull(gatewayManager);
    }


}
