package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class AddProductScreen extends ActionBase {

    public String getSelectedBrand;
    public String getSelectedProdName;
    public String getSelectedProdShade;

    public String getSubmittedBrand;
    public String getSubmittedProdName;
    public String getSubmittedProdShade;

    @AndroidFindBy(id="com.fdbr.android.main:id/layoutText")
    public MobileElement layoutTC;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonSure")
    public MobileElement yesBtnDrawer;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonCancel")
    public MobileElement noBtnDrawer;

    @AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public MobileElement backIcon;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputBrandName")
    public MobileElement brandField;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputProductCategory")
    public MobileElement productCatField;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputProductName")
    public MobileElement productNameField;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputProductShade")
    public MobileElement productShadeField;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputProductDescription")
    public MobileElement productDescField;

    @AndroidFindBy(id="com.fdbr.android.add:id/inputPrice")
    public MobileElement priceField;

    @AndroidFindBy(id="com.fdbr.android.add:id/flowLayout")
    public MobileElement tagsField;

    @AndroidFindBy(id="com.fdbr.android.add:id/buttonImagePicker")
    public MobileElement photoThumbnail;

    @AndroidFindBy(id="com.fdbr.android:id/buttonRightCustom")
    public MobileElement doneBtn;

    @AndroidFindBy(id="com.fdbr.android.add:id/layoutBtnAddProduct")
    public MobileElement addProductBtn;

    /* brand screen */
    @AndroidFindBy(id="com.fdbr.android.filter:id/listItems")
    public List<MobileElement> listBrand;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android:id/layoutParent') and @index='0']")
    public MobileElement firstResultBrand;

    @AndroidFindBy(id="com.fdbr.android:id/toolbarBottomSearch")
    public MobileElement searchBrand;

    /* product cat screen */
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.add:id/layoutParent') and @index='0']")
    public MobileElement firstResultProdCat;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.add:id/layoutParent') and @index='1']")
    public MobileElement secondResultProdCat;

    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id, 'com.fdbr.android.add:id/layoutParent')]")
    public List<MobileElement> listProdCat;

    /* capture photo btn */
    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonCapture")
    public MobileElement captureBtn;

    @AndroidFindBy(id="com.fdbr.android.photo:id/buttonPicker")
    public MobileElement galleryBtn;

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id, 'com.android.documentsui:id/icon_thumb') and @index='0']")
    public MobileElement firstIndexImg;

    @AndroidFindBy(id="com.fdbr.android:id/menu_crop")
    public MobileElement doneCropBtn;

    /* capture drawer layout */
    @AndroidFindBy(id="com.fdbr.android.main:id/bottomSheet")
    public MobileElement drawerLayout;

    @AndroidFindBy(id="com.fdbr.android.main:id/textBrand")
    public MobileElement brandText;

    @AndroidFindBy(id="com.fdbr.android.main:id/textProduct")
    public MobileElement productText;

    @AndroidFindBy(id="com.fdbr.android.main:id/textShade")
    public MobileElement shadeText;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonReview")
    public MobileElement reviewBtn;

    @AndroidFindBy(id="com.fdbr.android.main:id/buttonNext")
    public MobileElement skipBtn;

    /* error pop up modal */
    @AndroidFindBy(id="com.fdbr.android:id/textTitle")
    public MobileElement titlePopUp;

    @AndroidFindBy(id="com.fdbr.android:id/textDescription")
    public MobileElement descPopUp;

    @AndroidFindBy(id="com.fdbr.android:id/buttonPositive")
    public MobileElement okPopUp;

    // This is a constructor, as every page need a base driver to find android elements
    public AddProductScreen(AppiumDriver driver) throws IOException {

        this.driver = driver;
        //Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public AddProductScreen clickImSureDrawer() throws IOException {

        isElementPresent(layoutTC);
        this.verticalSwipeByPercentages(layoutTC,0.4,0.01,0.5,500);
        tapByElement(yesBtnDrawer);
        return new AddProductScreen(driver);
    }

    public AddProductScreen chooseBrandName() throws IOException {

        tapByElement(brandField);

        tapByElement(firstResultBrand);

        getSelectedBrand = brandField.getText();
        System.out.println(getSelectedBrand);
        return new AddProductScreen(driver);
    }

    public AddProductScreen chooseProdCat() throws IOException, InterruptedException {

        tapByElement(productCatField);
        isElementPresent(firstResultProdCat);

        /*
        tapByElement(firstResultProdCat);
        tapByElement(firstResultProdCat);
        tapByElement(firstResultProdCat);
        tapByElement(firstResultProdCat);
         */

        clickRandomMenus(listProdCat);

        boolean isListPresent = secondResultProdCat.isDisplayed();
        while(isListPresent==true) {
            Thread.sleep(100);
            clickRandomMenus(listProdCat);
            Thread.sleep(100);
            if(productNameField.isDisplayed()){
                break;
            }
        }
        return new AddProductScreen(driver);
    }

    public AddProductScreen fillProductName(String name) throws IOException {

        //tapByElement(productNameField);
        inputValue(productNameField, name);
        getSelectedProdName = productNameField.getText();
        System.out.println(getSelectedProdName);
        return new AddProductScreen(driver);
    }

    public AddProductScreen fillProductShade(String shade) throws IOException {

        //tapByElement(productShadeField);
        inputValue(productShadeField, shade);
        getSelectedProdShade = productShadeField.getText();
        System.out.println(getSelectedProdShade);
        return new AddProductScreen(driver);
    }

    public AddProductScreen fillProductDesc() throws IOException {

        this.verticalSwipeByPercentages(productDescField,0.4,0.01,0.5,500);
        //tapByElement(productDescField);
        inputValue(productDescField, "desc add product test");
        return new AddProductScreen(driver);
    }

    public AddProductScreen fillProductPrice() throws IOException {

        //tapByElement(priceField);
        inputValue(priceField, "90000");
        return new AddProductScreen(driver);
    }

    public AddProductScreen fillProductTags() throws IOException {

        tapByElement(tagsField);
        inputValue(tagsField, "tagtest");
        return new AddProductScreen(driver);
    }

    public AddProductScreen capturePhoto() throws IOException {

        tapByElement(photoThumbnail);

        isElementPresent(captureBtn);
        tapByElement(captureBtn);
        isElementPresent(doneBtn);
        tapByElement(doneBtn);
        return new AddProductScreen(driver);
    }

    public AddPostScreen choosePhotoFromGallery() throws IOException {

        tapByElement(galleryBtn);
        isElementPresent(firstIndexImg);
        tapByElement(firstIndexImg);

        isElementPresent(doneCropBtn);
        tapByElement(doneCropBtn);

        isElementPresent(doneBtn);
        tapByElement(doneBtn);
        return new AddPostScreen(driver);
    }

    public AddProductScreen submitAddProduct() throws IOException {

        tapByElement(addProductBtn);
        return new AddProductScreen(driver);
    }

    //action drawer
    public AddProductScreen checkDrawer() throws IOException {

        isElementPresent(drawerLayout);
        return new AddProductScreen(driver);
    }
    public AddProductScreen getBrandDrawer() throws IOException {

        getSubmittedBrand = brandText.getText();
        System.out.println(getSubmittedBrand);
        return new AddProductScreen(driver);
    }

    public AddProductScreen getProdNameDrawer() throws IOException {

        getSubmittedProdName = productText.getText();
        System.out.println(getSubmittedProdName);
        return new AddProductScreen(driver);
    }

    public AddProductScreen getProdShadeDrawer() throws IOException {

        getSubmittedProdShade = shadeText.getText();
        System.out.println(getSubmittedProdShade);
        return new AddProductScreen(driver);
    }

    public boolean isBrandSame() throws IOException {

        getBrandDrawer();

        boolean brand = getSelectedBrand.equals(getSubmittedBrand);
        return brand;
    }

    public boolean isProdNameSame() throws IOException {

        getProdNameDrawer();

        boolean name = getSelectedProdName.equals(getSubmittedProdName);
        return name;
    }

    public boolean isProdShadeSame() throws IOException {

        getProdShadeDrawer();

        boolean shade = getSelectedProdShade.equals(getSubmittedProdShade);
        return shade;
    }

    public AddProductScreen clickReview() throws IOException {

        tapByElement(reviewBtn);
        return new AddProductScreen(driver);
    }

    public AddProductScreen clickSkipReview() throws IOException {

        tapByElement(skipBtn);
        return new AddProductScreen(driver);
    }

    //action drawer
    public AddProductScreen okErrorShouldUsingImg() throws IOException {

        isElementPresent(titlePopUp);
        isElementPresent(descPopUp);
        isElementPresent(okPopUp);

        String errorDesc = descPopUp.getText();
        Assert.assertTrue(errorDesc.equals("Please choose Product Image"));
        tapByElement(okPopUp);
        return new AddProductScreen(driver);
    }

    public AddProductScreen okErrorShouldChooseBrandName() throws IOException {

        isElementPresent(titlePopUp);
        isElementPresent(descPopUp);
        isElementPresent(okPopUp);

        String errorDesc = descPopUp.getText();
        Assert.assertTrue(errorDesc.equals("Please choose Brand Name"));
        tapByElement(okPopUp);
        return new AddProductScreen(driver);
    }

    public AddProductScreen okErrorShouldChooseProductCategory() throws IOException {

        isElementPresent(titlePopUp);
        isElementPresent(descPopUp);
        isElementPresent(okPopUp);

        String errorDesc = descPopUp.getText();
        Assert.assertTrue(errorDesc.equals("Please choose Product Category"));
        tapByElement(okPopUp);
        return new AddProductScreen(driver);
    }

    public AddProductScreen okErrorShouldChooseProductName() throws IOException {

        isElementPresent(titlePopUp);
        isElementPresent(descPopUp);
        isElementPresent(okPopUp);

        String errorDesc = descPopUp.getText();
        Assert.assertTrue(errorDesc.equals("Please choose Product Name"));
        tapByElement(okPopUp);
        return new AddProductScreen(driver);
    }
}
