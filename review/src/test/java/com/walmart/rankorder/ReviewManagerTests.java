package com.walmart.rankorder;

import com.walmart.rankorder.service.ReviewManager;
import com.walmart.rankorder.service.ReviewResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReviewApplication.class)
@WebAppConfiguration
public class ReviewManagerTests {

    @Autowired
    ReviewResponse reviewResponse;

    @Autowired
    ReviewManager reviewManager;

    @Test
   public void testGetReviewProduct(){
        reviewResponse = reviewManager.getReviewProduct(42608121L);
        Assert.assertNotNull(reviewResponse);
    }

}
