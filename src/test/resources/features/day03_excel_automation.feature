@excel
Feature: user_creation

  Scenario: user_creation_test
#    url : https://editor.datatables.net/
#    sheet : user_data
#    workbook : data_sheet.xlsx
#    Given user navigates to "https://editor.datatables.net/" page, and enters "user_data" from "data_sheet.xlsx" excel sheet and verify user creation

    Given user navigates to "https://editor.datatables.net/" page
    And user enters "user_data" from "data_sheet.xlsx" excel sheet and verify user creation
    And close the application