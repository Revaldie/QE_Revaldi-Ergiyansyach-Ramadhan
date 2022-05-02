Feature: As a admin i want to check all my products so that i can manage

  Scenario: GET - As admin i have be able to get detail products
    Given admin on postman app
    When admin added url
    And input get as a methoded
    And admin click send
    Then response shows = 200 OK
    And Response shows all products