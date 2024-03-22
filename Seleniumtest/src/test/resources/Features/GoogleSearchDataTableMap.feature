Feature: Google Search
  Scenario: Searching on Google with DataTable as Map
    Given I am on the Google search page
    When I search for the following terms and language
      | Java        | EN       |
      | Cucumber    | EN       |
      | Selenium    | EN       |
    Then I should see search results for each term in each language