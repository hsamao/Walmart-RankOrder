package com.walmart.rankorder;

import com.walmart.rankorder.recommend.RecommendClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RecommendApplication.class)
@WebAppConfiguration
public class RecommendApplicationTests {


	private static final Logger log = LoggerFactory.getLogger(RecommendApplicationTests.class);

	private String url = "http://api.walmartlabs.com/v1/";
	private String item = "items/";
	private String format = "format=json";
	private String apiKey = "apiKey=4std6f27cb9g4p4h8yhpmatr";

	RestTemplate restTemplate = new RestTemplate();

	@Test
	public void testRecommendClient() {

		RecommendClient recommendClient;
		recommendClient = restTemplate.getForObject(url + item + "42608121" + "?" + format + "&" + apiKey, RecommendClient.class);
		log.info(recommendClient.toString());



	}

}
