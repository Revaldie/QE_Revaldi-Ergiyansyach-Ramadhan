Feature: As  User I Want To Get The Result Of Sum

  @sum
  Scenario: pengurangan
    Given user on calculator page
    When User choose first number 4
    And User tap "minus"
    And User choose second number 3
    And User tap "equal"
    Then user see the result of sum
