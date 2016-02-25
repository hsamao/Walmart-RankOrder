package com.walmart.rankorder;

import com.walmart.rankorder.recommendation.RcmdApi;
import com.walmart.rankorder.recommendation.RmdApi;
import com.walmart.rankorder.review.ReviewApi;
import com.walmart.rankorder.searchapi.SearchApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RankOrderApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(RankOrderApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(RankOrderApplication.class);
    }


    @Override
    public void run(String... strings) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        SearchApi searchApi = restTemplate.getForObject("http://api.walmartlabs.com/v1/search?query=ipod&format=json&apiKey=4std6f27cb9g4p4h8yhpmatr", SearchApi.class);
        log.info(searchApi.toString());

        RmdApi rmdApi = restTemplate.getForObject("http://api.walmartlabs.com/v1/items/42608121?format=json&apiKey=4std6f27cb9g4p4h8yhpmatr", RmdApi.class);

        log.info(rmdApi.toString());

        RcmdApi rcmdApi = restTemplate.getForObject("http://api.walmartlabs.com/v1/items/42608121?format=json&apiKey=4std6f27cb9g4p4h8yhpmatr", RcmdApi.class);

        log.info(rmdApi.toString());

        ReviewApi reviewApi = restTemplate.getForObject("http://api.walmartlabs.com/v1/reviews/42608121?format=json&apiKey=4std6f27cb9g4p4h8yhpmatr", ReviewApi.class);

        log.info(rmdApi.toString());
    }

}
