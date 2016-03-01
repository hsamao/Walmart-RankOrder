package com.walmart.rankorder;

import com.walmart.rankorder.service.GatewayManager;
import com.walmart.rankorder.service.GatewayResponse;
import com.walmart.rankorder.service.WeightedRank;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Set;
import java.util.TreeSet;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GatewayApplication.class)
@WebAppConfiguration
public class GatewayManagerTests {

    @Autowired
    GatewayManager gatewayManager;

    @Autowired
    GatewayResponse gatewayResponse;

    Set<WeightedRank> weightedRanks = new TreeSet<WeightedRank>();

    @Test
    public void testSearchProductByName() {
        gatewayResponse = gatewayManager.searchProductByName("ipod");
        Assert.assertNotNull(gatewayResponse);
    }

    @Test
    public void testRecommendProductByItemId() {
        gatewayResponse = gatewayManager.recommendProductByItemId(42608121L);
        Assert.assertNotNull(gatewayResponse);
    }

    @Test
    public void testReviewProductByItemId() {
        gatewayResponse = gatewayManager.reviewProductByItemId(42608121L);
        Assert.assertNotNull(gatewayResponse);
    }

    @Test
    public void testOrderProductByReview() {
        weightedRanks = gatewayManager.orderProductByReview("ipod");
        Assert.assertNotNull(weightedRanks);
    }


}
