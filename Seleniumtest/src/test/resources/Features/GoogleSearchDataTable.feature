Feature: Google Search
  Scenario: Searching on Google with DataTable as List
    Given I am on the Google search page
    When I search for the following terms
      | Search Term |
      | Java        |
      | Cucumber    |
      | Selenium    |
    Then I should see search results for each term