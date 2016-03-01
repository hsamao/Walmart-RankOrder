# Walmart-RankOrder

  ## RankOrder App ##
  
  # About:
    1. RankOrder App is Walmart Api Client App to consume Search, Recommend and Review APIs.
    2. RankOrder App searches for products based upon a user-provided search string and it retrieves reviews of the first 10 products, then it sorts the recommended products based upon the review sentiments

  # Design:
    RankOrder App is separated in four modules Search, Recommend, Review and Gateway. Each module has its own source cods and unit tests.
    
      A. Search Module
          Purpose: to search for products based upon a user-provided search string.
          Search Module contains Domain and Service layers as well as JUnit Test
            a. Domain Layer contains Plain Java Objects that match JSON objects returned as a result of search
            b. Service Layer contains SearchRequest, SearchResponse, and SearchManager classes
              1. SearchRequest prepares request to search for a particular product
              2. SearchResponse returns a SearchProduct object which includes 10 different products of one category.
              3. SearchManager uses SearchRequest and SearchResponse classes to handle the actual search mechanism.
            c. SearchManagerTests used to check the validation of search mechanism.

      B. Recommend Module
          Purpose: product recommendation search
          Search Module is designed similar to Search Module that means it contains domain, service and JUnit Test.
          RecommendManager is used to get recommended item and RecommendManagerTests is used to check the validation of results.

      C. Review Module
          Purpose: find reviews of a particular item
          Review Module is also designed similar to Search Module.
          ReviewManager is used to get reviews per item and ReviewManagerTests is used to check the validation of results.

      D. Gateway Module can do four functions
          Purpose:
            1. Search for products based upon a user-provided search string
            2. Use the first item in the search response as input for a product recommendation search
            3. Retrieve reviews of the first 10 product recommendations
            4. Rank order the recommended products based upon number of stars and number of reviewers.
            4. Gateway Module uses a specific calculation to order reviews from higher to lower, the formaula below shows the calculation
               formula: numberOfStars * numberOfReviewers / totalOfReviewers * 5

  # Technologies Involved:
      IDE:        IntelliJ IDEA
      Language:   Java
      Framework:  Spring Boot
      UnitTest:   JUnitTest
