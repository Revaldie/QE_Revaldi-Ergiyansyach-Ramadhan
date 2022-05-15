Feature: As user I want to order product so that i can have it

  Scenario: As user i want to order "tensi darah elektrik"
    Given User on Home page
    When User click tensi darah elektrik
    And User click cart
    And User click Bayar
    Then User see all the transaction