Feature: As a user, I want to login so that i can see my homepage

  Scenario: As a user, i able to login successfully
    Given user on login page
    When user input valid email
    And user input valid password
    And click login button
    Then user can see the profile page

