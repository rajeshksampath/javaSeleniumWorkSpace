Feature: Search and place the order for products

  
  Scenario: Search experience for product search in both home and offers page.
    Given User is on Greenkart landing page
    When User searched with short name "Tom" and extract actual name of the product
    Then User searched for "Tom" in offers page
    And Validate product name in offers page matches with product name in landing page
 