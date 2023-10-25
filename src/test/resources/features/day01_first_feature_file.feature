Feature: google_search_feature

#Background is used for repeated pre- conditions
#It is executed BEFORE EACH SCENARIO KEYWORD
  Background: navigating_google_homepage
    Given user is on the google home page
  @iphone
  Scenario: TC01_iphone_search
    And user search for iPhone
    Then verify the result contains iPhone
  @tea_pot
  Scenario: TC02_tea_pot_search
    And search for porcelain tea pot
    Then verify the result contains porcelain tea pot




#*************************************FEATURE FILE*****************************
#  All feature files have .feature extensions
#  Feature files are written in Gherkin language
#  Feature files are used to create test scenarios / test cases
#  All feature files must begin with Feature: keyword.
#  One feature file can not have more than one Feature: keyword
#  Scenario keyword is used to create test cases
#  One feature file can have more than one Scenario keyword
#  Each step must begin with a Gherkin keyword : Given, And, When, Then, But, *
#*************************************STEP DEFINITIONS**************************
#  After we create our test Scenarios, we need to generate step definitions to write our code
#  Use Runner to generate the missing step definitions
#  Use the templates and add them in your step definitions folder
#  Then complete your java code using page object model
#  @tags are used to run specific test scenarios. we can use multiple tags
# Background is used for repeated pre conditions. It runs before each Scenario keyword.