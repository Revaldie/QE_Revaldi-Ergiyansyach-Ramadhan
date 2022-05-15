Feature:as a User Login succses user

  Scenario: succsess login
    Given as user on the home page
    When as a user click icon on the right product
    When user on the login page
    And user input "revaldi132@gmail.com" on email field
    And user input "aldi1312" on password field
    Then user click login and user succses login