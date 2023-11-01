@param_feature @regression
Feature: search_feature
  Scenario: TC01_iphone_search
    Given user navigates to "https://www.google.com"
    And user search for "iPhone" on google
    Then user verifies page title contains "iPhone"
    Then close the application

  Scenario: TC02_apple_search
    And user search for "apple" on google
    Then user verifies page title contains "apple"
    Then close the application

  Scenario: TC03_tesla_search
    And user search for "tesla" on google
    Then user verifies page title contains "tesla"
    Then close the application

  Scenario: TC04_teapot_search
    And user search for "tea pot" on google
    Then user verifies page title contains "tea pot"
    Then close the application

  Scenario: TC05_toyota_search
    And user search for "toyota" on google
    Then user verifies page title contains "toyota"
    Then close the application