Feature: Usercancheckout
  Scenario: User can login with valid credentialUser can checkout products  using checkout button
    Given user add products to cart
    When user click the cart
    Then  user click checkout button
    And  user click continue button
    Then user click the finish button


