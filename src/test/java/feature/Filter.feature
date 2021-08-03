Feature: Filter

  In order to acceptence criteria
  Filter have option filter by mybeautyId, Rating, skin type, skin concern, brand
  If filter active, display red dot on button filter
  If filter active, display red dot on button brand

  #RPA-8 #RPA-12 #RPA-17 #RPA-10
  @Android @filter @Staging @OkrDone @RPA-8
  Scenario Outline: Check when filter applied - Check result if user use filter BeautyId - Check state Beauty after complete beautyId
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User apply filter on category skincare
    And User choose filter mybeautyId, rating, skin type, skin concern, brand
    Then User will see product list changed
    When User clicks reset filter
    Then User will see default product list

    Examples:
      |   username    |   password      |
      |	  putwid	  |   123tester       |

  #RPA-7 #RPA-11 #RPA-4
  @Android @filter @Staging @OkrDone @RPA-7
  Scenario Outline: Check filter applied on category lipstick - Check state if do reset filter on filter brand screen - Check state when result is not found
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User apply filter on category lipstick
    And User choose filter brand and shade
    Then User will see not found result

    Examples:
      |   username    |   password      |
      |	  putwid	  |   123tester       |
