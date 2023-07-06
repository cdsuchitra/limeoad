
Feature: Order a product for Men in LimeRoad website
 
Scenario: Login into LimeRoad.com
    Given User has opened the url "https://www.limeroad.com/"
    When User clicks the Men 
    Then User can view the Men Shopping page
    
    Scenario: Browse Jeans
    Given User is in Men Shopping Page
    When User clicks Jeans 
    Then User can view the Jeans list in the current page
    
    Scenario: Select Funk it up a notch category
    Given User is in the Jeans displayed page
    When User clicks Funk it up a notch
    Then User goes to a page with all jeans in the category
    
    Scenario: Select the product
    Given User is the the Funk it up a notch category page
    When User selects the second displayed product
    Then User goes to the selected product description page
    
    Scenario: Select the size
    Given User in the product page
    When Selects the size
    Then The size will be changed
    
    Scenario: Add to cart
    Given User has selected the size
    When User click Add to Cart Button
    Then The product is added to the cart
   
