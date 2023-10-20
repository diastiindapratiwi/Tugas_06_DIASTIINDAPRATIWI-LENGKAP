Feature: LoginSouceDemo
  Scenario: User login with empty user and password field
    Given user launch the website
    Then user leave username fields blank
    And user leave  password fields blank
    Then user click login button.

