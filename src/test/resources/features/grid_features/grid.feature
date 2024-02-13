@grid
Feature: grid_feature
  @grid_chrome
  Scenario: TC01_chrome_test
    Given user navigates to "https://github.com/" using "chrome" browser
    Then verify the title contains "GitHub"
    Then close the remote driver

  @grid_firefox
  Scenario: TC02_firefox_test
    Given user navigates to "https://github.com/" using "firefox" browser
    Then verify the title contains "GitHub"
    Then close the remote driver

  @grid_edge
  Scenario: TC03_edge_test
    Given user navigates to "https://github.com/" using "edge" browser
    Then verify the title contains "GitHub"
    Then close the remote driver

  @grid_safari
  Scenario: TC04_safari_test
    Given user navigates to "https://github.com/" using "safari" browser
    Then verify the title contains "GitHub"
    Then close the remote driver