@regression @smoke @SKYW-15 @E2E
Feature: Enhanced Navigation for Parks & Travel

  Scenario: Validate Parks & Travel Navigation Functionality
    Given I open the Disney.com homepage
    When I locate and click on the "Parks & Travel" section in the main navigation menu
    And I click on "Walt Disney World Resort" link
    Then I verify that the correct page loads with all relevant resort information

   Scenario: Validate Disneyland Resort Page Navigation
    Given I open the Disney.com homepage
    When I navigate to the "Parks & Travel" menu and click on "Disneyland Resort"
    Then I check that the Disneyland Resort page loads correctly with relevant travel details
    
     Scenario: Validate Disney Cruise Line Navigation
    Given I open the Disney.com homepage
    When I click on "Disney Cruise Line" under "Parks & Travel"
    Then I verify cruise details, images, and booking options load correctly
    
    Scenario: Validate Aulani - A Disney Resort and Spa Navigation
    Given I open the Disney.com homepage
    When I access the "Aulani - A Disney Resort and Spa" page from the same menu
    Then I confirm the destination’s images, offers, and descriptions are accurate
    
    Scenario: Validate Adventures by Disney Navigation
    Given I open the Disney.com homepage
    When I access the "Adventures by Disney" page from the same menu and click
    Then I confirm the destination’s images, trips, and plan a trip are accurate
    
    Scenario: Validate Disney Vacation Club Navigation
    Given I open the Disney.com homepage
    When I access the "Disney Vacation Club" page from the park and travel menu and click
    Then I confirm the Explore membership, offer and benefits are accurate
    
    
    