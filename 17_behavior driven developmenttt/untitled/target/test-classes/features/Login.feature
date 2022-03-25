Feature: As User, i want to login, So that i can see my home page

  Scenario: As User, i want to login, So that i can see my home page
    Given user on login page
    When user input valid ussername
    And user input valid password
    And user click login button
    Then user succes login
    And user see home page

Scenario: As user, i want to login, but failed so i can't see my home page
  Given user on login page
  When user input valid ussername
  And user input valid password
  And user click login button
  Then the user fails to enter the home page
  And user can't see my home page