Feature: User Add Post

  In order to perform sucessfull submit post
  I should able to fill all option of add post process
  If user cancel post, user will direct to current menu

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

  #FDBRMA-54
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario: Add post image only camera - Add post with tag product
    Given User clicks add post from homescreen menu
    When User take picture to add post
    Then User enters caption of post
    And User clicks submit post and choose not to skip tagging product
    Then User will direct to product list screen to tag product

  #FDBRMA-55
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario: Add post image from gallery - Add post without tag product
    Given User clicks add post from homescreen menu
    When User pick picture from gallery add post
    Then User enters caption of post
    And User clicks submit post and choose yes to skip tagging product
    Then User will direct to feed where last post is at most top

  #FDBRMA-57 #FDBRMA-65 #FDBRMA-317
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario: Add post cancel tag post and cancel post
    Given User clicks add post from homescreen menu
    When User take picture to add post
    Then User enters caption of post
    And User cancel to tag product
    When User click back to cancel add post
    Then User will see confirm modal to cancel add post

  #FDBRMA-58 #FDBRMA-59
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario: Add post with tag product - Review product
    Given User clicks add post from homescreen menu
    When User take picture to add post
    Then User enters caption of post
    And User tag product and select from popular product
    And User add review product in tag
    And User clicks submit post with tag product
    Then User will direct to feed where last post is at most top

  #FDBRMA-56 #FDBRMA-60
  @Android @AddPost @Staging @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post - Tag reviewed product by search product
    Given User clicks add post from homescreen menu
    When User take picture to add post
    Then User enters caption of post
    And User tag product and select by search product "<search>"
    And User will see tagged product has reviewed already
    And User clicks submit post with tag product
    Then User will direct to feed where last post is at most top

    Examples:
      |                 search               |
      |	    nature republic aloe vera 92	 |
