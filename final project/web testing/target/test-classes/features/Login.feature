
Feature: As a user, I want to see home page, So that i can buy books

  Scenario: As a user, i able to login successfully
    Given user on login page
    When user input valid email
    And user input valid password
    And click login button
    Then I am on the home pages


