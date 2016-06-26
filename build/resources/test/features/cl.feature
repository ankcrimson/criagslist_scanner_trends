Feature: Scan CriagsList For Cars

  Scenario: Scan CriagsList for cars
    Given I am able to open criagslist rss
    When I go through all the pages of content
    And I am able to parse the data
    Then I should be able to save it into elasticsearch