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

  #FDBRMA-267 #FDBRMA-274
  @Android @AddProduct @Smoke @Staging @IntegrationTest
  Scenario Outline: Add product by capture photo - Add Review
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    And User take picture to add product
    When User clicks submit add product
    Then User will see drawer have same detail
    When User clicks add review button after add product submitted
    And Fill all field then submit add review
    Then User will see congrats screen and direct to review detail from feed

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-423
  @Android @AddProduct @Smoke @Staging
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
  @Android @AddProduct1
  Scenario Outline: Add product without attach image
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    When User clicks submit add product
    Then User will see error popup for not using image to add product

    Examples:
      |       productname                 |       productshade               |
      |	    product capture photo	      |   product capture photo shade	 |

  #FDBRMA-371
  @Android @AddProduct
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
  @Android @AddProduct
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
  @Android @AddProduct
  Scenario Outline: Add product without fill product name
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productshade>" except product name
    And User take picture to add product
    When User clicks submit add product
    Then User will see toast msg to fill product name

    Examples:
      |       productshade               |
      |   product capture photo shade	 |

  #FDBRMA-384
  @Android @AddProduct
  Scenario Outline: Add product input product name less than 3 - more than 100
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>"
    And User take picture to add product
    When User clicks submit add product
    Then User will see toast msg to fill product name in format

    Examples:
      |       productname                |
      |           tr                	 |
      |     100charjkjsankdhasdhaksdhakshdkahsdkjahsdkjhasdkjhaksdjhakjsdhkajhsdkjahsdkjahsdkjashdkjhkjsahdkjasha    |

  #FDBRMA-376
  @Android @AddProduct @Bug
  Scenario Outline: Add product - search brand
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen and select brand by search "<brand>"
    And User take picture to add product
    When User clicks submit add product
    Then User will see drawer have same detail

    Examples:
      |       brand               |
      |      Nature Republic	  |

  #FDBRMA-272 #FDBRMA-271 #FDBRMA-424
  @Android @AddProduct
  Scenario Outline: Add product - edit brand name - edit product root category - edit product name
    Given User clicks add product from homescreen menu
    When User fill all field on add product screen "<productname>" and "<productshade>"
    When User change brand name
    And User change product category
    And User input to change product name "<changeproductname>"
    And User take picture to add product
    When User clicks submit edit add product
    Then User will see drawer have updated detail

    Examples:
      |       productname                 |       productshade               |      changeproductname               |
      |	    product capture photo	      |   product capture photo shade	 |    changed product capture photo     |


