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

  #FDBRMA-267
  @Android @AddProduct1 @Smoke @Staging @IntegrationTest
  Scenario Outline: Add product by capture photo
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    And User take picture to add product
    When User clicks submit add product
    Then User will see drawer have same detail

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-423
  @Android @AddProduct1 @Smoke @Staging
  Scenario Outline: Add product using upload image
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    And User select image to add product
    When User clicks submit add product
    Then User will see drawer have same detail

    Examples:
      |       productname                 |       productshade               |
      |	    product from gallery	      |   product from gallery shade	 |

  #FDBRMA-268
  @Android @AddProduct1 @WIP
  Scenario Outline: Add product without attach image
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    When User clicks submit add product
    Then User will see error popup for not using image to add product

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-371
  @Android @AddProduct1 @WIP
  Scenario Outline: Add product without specify brand name
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>" except brand name
    And User take picture to add product
    When User clicks submit add product
    Then User will see toast msg to select brand name

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-273
  @Android @AddProduct @WIP
  Scenario Outline: Add product without specify category
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>" except category
    And User take picture to add product
    When User clicks submit add product
    Then User will see toast msg to select category

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-372
  @Android @AddProduct @WIP
  Scenario Outline: Add product without fill product name
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productshade>" except product name
    And User take picture to add product
    When User clicks submit add product
    Then User will see toast msg to fill product name

    Examples:
      |       productshade               |
      |   product capture photo shade	 |