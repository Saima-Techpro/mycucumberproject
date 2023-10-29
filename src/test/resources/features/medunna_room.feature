@MedunnaRoom
Feature: Medunna Room Creation

  Background: Sign In Medunna
    Given user is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "mark_twain" in Username input
    And enter "Mark.123" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button


  Scenario Outline: Create Room
    And click on Items&Titles
    And click on Room option
    And click on Create a new room button
    And enter "<room_number>" room number input
    And select Suite option from Room Type dropdown
    And click on Status checkbox
    And enter "<price>" in Price input
    And enter "<description>" in Description input
    And click on Save button
    And click on Created Date
    Then assert that room is created via "<room_number>"
    And close the application
    Examples:
      | room_number | price | description |
      | 72234940    | 123   | Seaview     |
      | 91182998    | 432   | Double      |
      | 82922339    | 200   | Baby Cot    |
      | 16637190    | 234   | Airy        |

    # option +command + l  to format the code