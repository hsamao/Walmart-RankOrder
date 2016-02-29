package com.walmart.rankorder;

import com.walmart.rankorder.domain.ReviewClient;
import com.walmart.rankorder.service.ReviewRequest;
import com.walmart.rankorder.service.ReviewResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReviewApplication.class)
@WebAppConfiguration
public class ReviewApplicationTests {

    @Value("${url}")
    private String url;
    @Value("${review}")
    private String review;
    @Value("${format}")
    private String format;
    @Value("${apiKey}")
    private String apiKey;

    @Autowired
    ReviewRequest reviewRequest;

    @Autowired
    ReviewResponse reviewResponse;

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void restReviewClient() {

        ReviewClient reviewClient;
        reviewClient = restTemplate.getForObject(url + review + "42608121" + "?" + format + "&" + apiKey, ReviewClient.class);

        Assert.assertNotNull(reviewClient);
    }

    @Test
    public void testRequestResponseReviewClient() {

        reviewRequest.setItemId(42608121L);
        String request = reviewRequest.getRequest();

        reviewResponse.setReviewClient(restTemplate.getForObject(request, ReviewClient.class));

        Assert.assertNotNull(reviewResponse);
    }

}
