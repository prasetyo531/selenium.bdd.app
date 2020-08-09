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

  #FDBRMA-27
  @Android @AddProduct @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add product by capture photo
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    And User take picture to add product
    When User clicks submit add product
    Then User will see drawer have same detail

    Examples:
      |                 productname               |    productshade               |
      |	    nature republic aloe vera 92	      | nature republic aloe vera 92	 |
