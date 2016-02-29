package com.walmart.rankorder;

import com.walmart.rankorder.domain.RecommendClient;
import com.walmart.rankorder.service.RecommendRequest;
import com.walmart.rankorder.service.RecommendResponse;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RecommendApplication.class)
@WebAppConfiguration
public class RecommendApplicationTests {

    @Value("${url}")
    private String url;
    @Value("${item}")
    private String item;
    @Value("${format}")
    private String format;
    @Value("${apiKey}")
    private String apiKey;

    @Autowired
    RecommendRequest recommendRequest;

    @Autowired
    RecommendResponse recommendResponse;

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testRecommendClient() {

        RecommendClient recommendClient = restTemplate.getForObject(url + item + "42608121" + "?" + format + "&" + apiKey, RecommendClient.class);
        Assert.assertNotNull(recommendClient);
    }

    @Test
    public void testRequestResponseRecommend() {

        recommendRequest.setItemId(42608121L);
        String request = recommendRequest.getRequest();

        recommendResponse.setRecommendClient(restTemplate.getForObject(request, RecommendClient.class));
        Assert.assertNotNull(recommendResponse.getRecommendClient());
    }

}
