Feature:as a User Login succses user

  Scenario: succsess login
    Given as user on loading screen home
    When as a user input register account
    And user input paswword
    And android user tap login button
    Then android user see message is displayed