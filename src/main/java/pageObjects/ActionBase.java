package pageObjects;

import com.cucumber.listener.Reporter;
import com.github.javafaker.Faker;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.*;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;

import static io.appium.java_client.CommandExecutionHelper.execute;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class ActionBase extends DriverFactory {

    protected WebDriverWait wait;
    private static String screenshotName;

    Faker faker = new Faker();

    protected void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected boolean isElementPresent(MobileElement mobileElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            System.out.println("element is present");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("element is not present");
            return false;
        }
    }

    protected boolean isElementEnabled(MobileElement mobileElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
            System.out.println("element is present");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("element is not present");
            return false;
        }
    }

    /***  SENDKEYS  ***/
    public void inputValue(MobileElement mobileElement, String value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            mobileElement.clear();
            mobileElement.setValue(value);
            driver.hideKeyboard();
            System.out.println("element is present");
        } catch (NoSuchElementException e) {
            System.out.println("element is not present");
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }

    public void inputValueEnter(MobileElement mobileElement, String value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            mobileElement.clear();
            mobileElement.setValue(value+"\n");
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
            driver.hideKeyboard();
            System.out.println("element is present");
        } catch (NoSuchElementException e) {
            System.out.println("element is not present");
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************
     Tap to an element for 250 milliseconds
     **********************************************************************************/
    public void tapByElement(MobileElement mobileElement) {
        try {
            new TouchAction(driver)
                    .tap(tapOptions().withElement(element(mobileElement)))
                    .waitAction(waitOptions(Duration.ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pressByElement(MobileElement mobileElement) {
        try {
            TouchAction action = new TouchAction(driver);
            action.tap(tapOptions().withElement(element(mobileElement))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**********************************************************************************
     Accept Alert
     **********************************************************************************/
    protected void acceptAlert() throws IOException {
        System.out.println("wait to dismiss dialog");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.err.println("no alert visible");
        }
    }

    /**********************************************************************************
     Tap by coordinates
     **********************************************************************************/
    public void tapByCoordinates(int x,  int y) {
        try {
            new TouchAction(driver)
                    .tap(point(x, y))
                    .waitAction(waitOptions(ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Press by element
    public void pressByElement(MobileElement mobileElement, long seconds) {
        try {
            new TouchAction(driver)
                    .press(element(mobileElement))
                    .waitAction(waitOptions(ofSeconds(seconds)))
                    .release()
                    .perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Press by coordinates
    public void pressByCoordinates(int x, int y, long seconds) {
        new TouchAction(driver)
                .press(point(x,y))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }


    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage (MobileElement mobileElement, double startPercentage, double endPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .tap(tapOptions().withElement(element(mobileElement)))
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(MobileElement mobileElement, double startPercentage, double endPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
                //.tap(tapOptions().withElement(element(mobileElement)))
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    //Swipe by elements
    public void swipeByElements (MobileElement startElement, MobileElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction(driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    //Multitouch action by using an android element
    public void multiTouchByElement (MobileElement mobileElement) {
        TouchAction press = new TouchAction(driver)
                .press(element(mobileElement))
                .waitAction(waitOptions(ofSeconds(1)))
                .release();

        new MultiTouchAction(driver)
                .add(press)
                .perform();
    }

    /*
	https://seleniumbycharan.com/2016/08/07/finding-elements-using-locators-in-appium/
	 */

    /**********************************************
     *** TOAST MESSAGE ***
     **********************************************/
    public void raiseToast(String text) {
        ImmutableMap<String, Object> scriptArgs = ImmutableMap.of(
                "target", "application",
                "methods", Arrays.asList(ImmutableMap.of(
                        "name", "raiseToast",
                        "args", Arrays.asList(ImmutableMap.of(
                                "value", text,
                                "type", "String"
                        ))
                ))
        );

        driver.executeScript("mobile: isToastVisible", scriptArgs);
    }

    public static ExpectedCondition<Boolean> toastMatches(String matchText, Boolean isRegexp) {
        //false = exact toast string
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                ImmutableMap<String, Object> args = ImmutableMap.of(
                        "text", matchText,
                        "isRegexp", isRegexp
                );
                return (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: isToastVisible", args);
            }

            @Override
            public String toString() {
                return "toast to be present";
            }
        };
    }

    /**********************************************
     *** Tap Random Element ***
     **********************************************/
    //xpath fullpath https://stackoverflow.com/questions/39036751/how-to-randomly-click-an-element-in-the-list-androidusing-seleniumappium
    public static void clickRandomMenus(List<MobileElement> mobileElements){
        try {
            List<MobileElement> li = mobileElements;
            int i = 0;
            System.out.println("there are"+" "+li.size()+" "+"element");

            ArrayList<MobileElement> arrayProductCat = new ArrayList<MobileElement>();

            while(i!=li.size()) {
                arrayProductCat.add(li.get(i));
                i++;
            }
            Random rand = new Random();
            int index = rand.nextInt(arrayProductCat.size()-1); // -1 because index will start from 0
            arrayProductCat.get(index).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void clickAllTaggedProduct(List<MobileElement> mobileElements){
        try {
            List<MobileElement> li = mobileElements;
            int i = 0;
            System.out.println("there are"+" "+li.size()+" "+"element");

            ArrayList<MobileElement> arrayProductCat = new ArrayList<MobileElement>();

            while(i!=li.size()) {
                arrayProductCat.add(li.get(i));
                i++;
            }
            Random rand = new Random();
            int index = rand.nextInt(arrayProductCat.size()-1); // -1 because index will start from 0

            long c = arrayProductCat.stream().count();
            System.out.println("total"+" "+c);

            while (c!=i){
                arrayProductCat.get(index).click();
                Thread.sleep(1000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void clickRandomMultipleMenus(List<MobileElement> mobileElements){
        try {
            List<MobileElement> li = mobileElements;
            int i = 0;
            System.out.println("there are"+" "+li.size()+" "+"element");

            ArrayList<MobileElement> arrayProductCat = new ArrayList<MobileElement>();

            while(i!=li.size()) {
                arrayProductCat.add(li.get(i));
                i++;
            }
            Random rand = new Random();
            int index = rand.nextInt(arrayProductCat.size()-1); // -1 because index will start from 0
            arrayProductCat.get(index).click();

            while(li.isEmpty()){
                System.out.println("there are"+" "+li.size()+" "+"element");
                break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //xpath smart search
    public static int randomElementPicker(MobileElement[] elements) {
        Random r = new Random();
        return r.nextInt(elements.length);
    }

    /**********************************************
     https://appiumpro.com/editions/64
     **********************************************/
    public void testToast(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        final String toastText = text;
        raiseToast(toastText);

        wait.until(toastMatches(toastText, false));

        raiseToast(toastText);
        wait.until(toastMatches("^Catch.+!", true));
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();
            os.close();
        }
    }


    /*****************************************************************
     EXTENT REPORT
     *****************************************************************/
    public static String returnDateStamp(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    /*   not using on purpose since ss task by extent manager    */
    public static void captureScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStamp(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/output/tc/" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href="+ returnScreenshotName() + "><img src="+ returnScreenshotName()+ " height=200 width=300></img></a>");
    }

    public static void captureScreenshot(String name) throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        screenshotName = (name+".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/output/tc/" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href="+ returnScreenshotName() + "><img src="+ returnScreenshotName()+ " height=200 width=300></img></a>");
    }

    public static String returnScreenshotName() {
        return (System.getProperty("user.dir") + "/output/imgs/" + screenshotName).toString();
    }

    public static void copyLatestExtentReport() throws IOException {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") + "/test-output/cucumber/report.html");
        File dest = new File(System.getProperty("user.dir") + "/output/report/" + date.toString() + ".html");
        copyFileUsingStream(source, dest);

        ///Users/mac/Documents/Automation/fdn.bddparallel.web/target/report.html
    }

    /*****************************************************************
     Compare Images / Visual Test
     *****************************************************************/
    public void compareImgIfUploaded(String nama1, String nama2){

        BufferedImage imgA = null;
        BufferedImage imgB = null;

        try
        {
            File fileA = new File(System.getProperty("user.dir") + "/output/tc/"+nama1+".jpg");
            File fileB = new File(System.getProperty("user.dir") + "/output/tc/"+nama2+".jpg");

            imgA = ImageIO.read(fileA);
            imgB = ImageIO.read(fileB);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        int width1 = imgA.getWidth();
        int width2 = imgB.getWidth();
        int height1 = imgA.getHeight();
        int height2 = imgB.getHeight();

        if ((width1 != width2) || (height1 != height2))
            System.out.println("Error: Images dimensions"+
                    " mismatch");
        else
        {
            long difference = 0;
            for (int y = 0; y < height1; y++)
            {
                for (int x = 0; x < width1; x++)
                {
                    int rgbA = imgA.getRGB(x, y);
                    int rgbB = imgB.getRGB(x, y);
                    int redA = (rgbA >> 16) & 0xff;
                    int greenA = (rgbA >> 8) & 0xff;
                    int blueA = (rgbA) & 0xff;
                    int redB = (rgbB >> 16) & 0xff;
                    int greenB = (rgbB >> 8) & 0xff;
                    int blueB = (rgbB) & 0xff;
                    difference += Math.abs(redA - redB);
                    difference += Math.abs(greenA - greenB);
                    difference += Math.abs(blueA - blueB);
                }
            }
            double total_pixels = width1 * height1 * 3;
            double avg_different_pixels = difference / total_pixels;
            double percentage = (avg_different_pixels / 255) * 100;
            System.out.println("Difference Percentage-->" +
                    percentage);
            if(percentage<=1.0){
                Assert.fail("Below Standart Percentage");
            }
        }
    }

    public static void deleteFile(String nama1, String nama2) {
        try {
            Files.deleteIfExists(Paths.get(System.getProperty("user.dir") + "/output/tc/"+nama1+".jpg"));
            Files.deleteIfExists(Paths.get(System.getProperty("user.dir") + "/output/tc/"+nama2+".jpg"));
        }
        catch(NoSuchFileException e) {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e) {
            System.out.println("Invalid permissions.");
        }

        System.out.println("Deletion successful.");
    }

    /*****************************************************************
     Send msg to telegram
     *****************************************************************/
    public static void sendMessageToTelegram(String scenario,String status) throws IOException {

        String TOKEN = "1026051821:AAEuT8g9HHZ1lh-iXUVBAIj34fJQTQn5ccA";
        String CHAT_ID = "-329202248"; //AppiumTelegram

        RestAssured.baseURI = "https://api.telegram.org/bot"+TOKEN;
        RequestSpecification httpRequest = RestAssured.given();
        String text = "Test Case : "+ scenario + "\n"
                + "status : "+ status;

        httpRequest.header("Content-Type", "application/json").log().all();

        JsonObject payload = new JsonObject();
        payload.addProperty("chat_id", CHAT_ID);
        payload.addProperty("text", text);
        httpRequest.body(payload.toString());

        Response response = httpRequest.post("/sendMessage");
        response.getBody().prettyPrint();
    }
}
