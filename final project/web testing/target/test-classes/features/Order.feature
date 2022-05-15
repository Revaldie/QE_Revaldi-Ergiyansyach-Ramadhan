Feature: As user I want to order “tensi darah elektrik”

  Scenario: order tensi darah elektrik
    Given User on Home page
    When As a user click beli tensi darah elektrik
    Then as user click basket
    And user pay tensi darah elektrik