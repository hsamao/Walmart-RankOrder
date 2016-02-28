package com.walmart.rankorder;

import com.walmart.rankorder.domain.SearchClient;
import com.walmart.rankorder.service.SearchRequest;
import com.walmart.rankorder.service.SearchResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SearchApplication.class)
@WebAppConfiguration
public class SearchApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SearchApplicationTests.class);

	@Value("${url}")
	private String url;
	@Value("${query}")
	private String query;
	@Value("${format}")
	private String format;
	@Value("${apiKey}")
	private String apiKey;

	@Autowired
	SearchRequest searchRequest;

	@Autowired
	SearchResponse searchResponse;

	RestTemplate restTemplate = new RestTemplate();

	@Test
	public void testSearchClient() {

		SearchClient searchClient;
		searchClient = restTemplate.getForObject(url + query + "ipod" + "&" + format + "&" + apiKey, SearchClient.class);
		Assert.assertNotNull(searchClient);

	}

	@Test
	public void testRequestResponseSearch(){

		searchRequest.setProduct("iphone");
		String request = searchRequest.getRequest();

		searchResponse.setSearchClient(restTemplate.getForObject(request,SearchClient.class));

		Assert.assertNotNull(searchResponse.getSearchClient());
	}

}
