Feature: As a user, I want to calculate devided number, So that i can see the result

  @divided
  Scenario: Pembagian
    Given user on calculator page
    When User choose first number 6
    And user tap "divided"
    And User choose second number 3
    And user tap "equal"
    Then user see the result

