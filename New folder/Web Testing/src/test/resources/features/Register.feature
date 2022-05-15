Feature: As a user i want to register for my account so that i can go shop

  Scenario: As a user i want registered successfully
    Given user on register page
    When user input full name
    And user input email
    And user input password
    And click register button
    Then user redirected to login page