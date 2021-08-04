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

  #RPA-15
  @Android @filter @Staging @OkrDone @RPA-15
  Scenario Outline: Choose filter but click close icon
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User apply filter on category lipstick
    And User choose filter brand and shade then close filter
    Then User will see product list not changed

    Examples:
      |   username    |   password      |
      |	  putwid	  |   123tester       |

  #RPA-21 #RPA-23
  @Android @filter @Staging @OkrDone @RPA-21
  Scenario Outline: Check state new set of sort not change filter option - Check when user use sort option
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User apply filter on category lipstick
    And User choose filter shade
    When User apply sort newest
    Then User will see list product sort from newest

    Examples:
      |   username    |   password      |
      |	  putwid	  |   123tester       |

  #RPA-22
  @Android @filter @Staging @OkrDone @RPA-22
  Scenario Outline: Check state set sort after load next data product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User apply filter on category lipstick
    And User scroll list product then apply sort
    Then User will see list product sort from newest

    Examples:
      |   username    |   password      |
      |	  putwid	  |   123tester       |