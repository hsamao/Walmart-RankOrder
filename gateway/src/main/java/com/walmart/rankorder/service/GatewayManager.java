package com.walmart.rankorder.service;

import com.walmart.rankorder.domain.ReviewProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by samao on 2/28/16.
 */

@Service
public class GatewayManager {

    @Autowired
    SearchManager searchManager;

    @Autowired
    RecommendManager recommendManager;

    @Autowired
    ReviewManager reviewManager;

    @Autowired
    GatewayResponse gatewayResponse;


    public GatewayResponse searchProductByName(String productName) {
        gatewayResponse.setSearchResponse(searchManager.searchForProduct(productName));
        return gatewayResponse;
    }

    public GatewayResponse recommendProductByItemId(Long itemId) {
        gatewayResponse.setRecommendResponse(recommendManager.getRecommendProduct(itemId));
        return gatewayResponse;
    }

    public GatewayResponse reviewProductByItemId(Long itemId) {
        gatewayResponse.setReviewResponse(reviewManager.getReviewProduct(itemId));
        return gatewayResponse;
    }


    public TreeSet<WeightedRank> orderProductByReview(String productName) {

        TreeSet<WeightedRank> orderedItems = new TreeSet<WeightedRank>(gatewayResponse);

        gatewayResponse.setSearchResponse(searchManager.searchForProduct(productName));

        List<ReviewProduct> reviewProducts = new ArrayList<ReviewProduct>();
        int size = gatewayResponse.getSearchResponse().getSearchProduct().getItems().size();
        for (int i = 0; i < size; i++) {
            Long itemId = Long.valueOf(gatewayResponse.getSearchResponse().getSearchProduct().getItems().get(i).getItemId());
            GatewayResponse newGatewayResponse = reviewProductByItemId(itemId);
            reviewProducts.add(newGatewayResponse.getReviewResponse().getReviewProduct());
        }

        double totalOfReviewers = 0;
        for (int i = 0; i < size; i++) {
            if (reviewProducts.get(i).getReviewStatistics() != null) {
                if (reviewProducts.get(i).getReviewStatistics().getAverageOverallRating() != null) {

                    totalOfReviewers += reviewProducts.get(i).getReviewStatistics().getTotalReviewCount();
                }
            }
        }

        for (int i = 0; i < size; i++) {
            WeightedRank weightedRank = new WeightedRank();
            double numberOfStars = 0;
            double numberOfReviewers = 0;
            if (reviewProducts.get(i).getReviewStatistics() != null) {
                if (reviewProducts.get(i).getReviewStatistics().getAverageOverallRating() != null) {
                    numberOfStars = reviewProducts.get(i).getReviewStatistics().getAverageOverallRating();
                    numberOfReviewers = reviewProducts.get(i).getReviewStatistics().getTotalReviewCount();
                }
            }
            weightedRank.setRank(calculation(numberOfStars, numberOfReviewers, totalOfReviewers));
            weightedRank.setReviewProduct(reviewProducts.get(i));
            orderedItems.add(weightedRank);

        }
        return orderedItems;
    }

    public double calculation(double numberOfStars, double numberOfReviewers, double totalOfReviewers) {
        double power = numberOfStars * numberOfReviewers;
        double average = power / totalOfReviewers * 5;
        return average;
    }
}
