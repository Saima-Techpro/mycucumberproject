@failed
Feature: data_tables
#  this scenario fails on purpose
  Scenario: TC01_admin_login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user enters the admin email and password
      | admin_email     | admin_password |
      | wrong@gmail.com | 12345          |
    And user clicks on the login button
    Then verify login is successful
    And close the application