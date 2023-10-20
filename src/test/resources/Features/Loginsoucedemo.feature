Feature: LoginSouceDemo
  Scenario: User can login with valid credential
    Given user launch the website
    Then user input a registered user
    And user input registered password
    Then user click login button
