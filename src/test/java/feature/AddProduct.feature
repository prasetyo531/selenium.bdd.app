Feature: User Add Product

  In order to perform sucessfull submit new product
  I should able to fill all option of add product process

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

  @Android @AddProduct @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario: Add post image only camera - Add post without tag product