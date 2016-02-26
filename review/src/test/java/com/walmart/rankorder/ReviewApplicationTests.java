package com.walmart.rankorder;

import com.walmart.rankorder.review.ReviewClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReviewApplication.class)
@WebAppConfiguration
public class ReviewApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ReviewApplicationTests.class);

	private String url = "http://api.walmartlabs.com/v1/";
	private String reviews = "reviews/";
	private String format = "format=json";
	private String apiKey = "apiKey=4std6f27cb9g4p4h8yhpmatr";

	RestTemplate restTemplate = new RestTemplate();

	@Test
	public void restReviewClient() {

		ReviewClient reviewClient;
		reviewClient = restTemplate.getForObject(url + reviews + "42608121" + "?" + format + "&" + apiKey, ReviewClient.class);

		log.info(reviewClient.toString());
	}

}
