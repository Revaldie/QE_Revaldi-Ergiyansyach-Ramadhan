Feature: As user I want to order “pepaya”

  Scenario: order pepaya
    Given User on Home page
    When As a user click beli pepaya
    Then as user click basket
    And User Pay pepaya