@data_base
Feature: jdbc_feature
  @user_login
  Scenario: TC01_read_customer_login_info
    Given user connects to the application database
    And user gets the column "*" from the table "jhi_user"
    And read all the column "login" data
    Then close the connection

  @user_email
  Scenario: TC02_read_customer_email_info
    Given user connects to the application database
    And user gets the column "*" from the table "jhi_user"
    And read all the column "email" data
    Then close the connection


  @user_account_types
  Scenario: TC03_read_customer_account_type_info
    Given user connects to the application database
    And user gets the column "*" from the table "tp_account"
    And read all the column "account_type" data
    Then close the connection

  @user_account_status
  Scenario: TC04_read_customer_account_status_info
    Given user connects to the application database
    And user gets the column "*" from the table "tp_account"
    And read all the column "account_status_type" data
    Then close the connection

#    verify if account types contains all of the below items: CHECKING, CREDIT_CARD, SAVING, INVESTING
  @validate_account_type
  Scenario Outline: TC05_verify_account_types
    Given user connects to the application database
    And user gets the column "*" from the table "tp_account"
#    And read all the column "account_type" data  (OPTIONAL)
    Then verify table "<table_name>" and column "<column_name>" contains data "<data_name>"

    Examples: data
      | table_name | column_name  | data_name   |
      | tp_account | account_type | CHECKING    |
      | tp_account | account_type | CREDIT_CARD |
      | tp_account | account_type | SAVING      |
      | tp_account | account_type | INVESTING   |


  @validate_customer_city
  Scenario Outline: TC06_verify_customer_city
    Given user connects to the application database
    And user gets the column "*" from the table "tp_customer"
    #    And read all the column "city" data  (OPTIONAL)
    Then verify table "<table_name>" and column "<column_name>" contains data "<data_name>"

    Examples: data
      | table_name  | column_name | data_name |
      | tp_customer | city        | New York  |
      | tp_customer | city        | St Louis  |
      | tp_customer | city        | adana     |
      | tp_customer | city        | Fairfax   |
      | tp_customer | city        | NJ        |
