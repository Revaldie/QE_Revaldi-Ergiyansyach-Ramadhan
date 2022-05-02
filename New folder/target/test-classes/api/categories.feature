Feature: As a user i want to categories product so that i can search easily

  Scenario: GET- as user i want to see all categories with invalid url
    Given admin on postman app
    When admin add url
    And input GET as a method
    And admin click send
    Then response shows = 404 Not Found
    And I don't receive all categories