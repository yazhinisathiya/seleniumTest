Feature: Google Search
  As a user
  I want to be able to search on Google
  So that I can find relevant information

  Scenario: Searching on Google with Parameterization
    Given I am on the Google search page
    When I search for "Selenium"
    Then I should see search results for "Selenium - Google Search"
    
    Scenario: Searching on Google with Parameterization
    Given I am on the Google search page
    When I search for "TestNg"
    Then I should see search results for "TestNg - Google Search"