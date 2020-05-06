package pageObjects;

import com.cucumber.listener.Reporter;
import com.github.javafaker.Faker;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import io.appium.java_client.functions.ExpectedCondition;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;

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

    protected void sleep (long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected boolean isElementPresent(MobileElement mobileElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
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
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
            System.out.println("element is present");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("element is not present");
            return false;
        }
    }

    /**********************************************************************************
     Tap to an element for 250 milliseconds
     **********************************************************************************/
    public void tapByElement (MobileElement mobileElement) {
        try {
            new TouchAction(driver)
                    .tap(tapOptions().withElement(element(mobileElement)))
                    .waitAction(waitOptions(Duration.ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void tapByElementMobileElement (MobileElement mobileElement) {
        try {
            new TouchAction(driver)
                    .tap(tapOptions().withElement(element(mobileElement)))
                    .waitAction(waitOptions(Duration.ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pressByElement (MobileElement mobileElement) {
        try {
            TouchAction action = new TouchAction(driver);
            action.tap(tapOptions().withElement(element(mobileElement))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**********************************************************************************
     Tap by coordinates
     **********************************************************************************/
    public void tapByCoordinates (int x,  int y) {
        try {
            new TouchAction(driver)
                    .tap(point(x, y))
                    .waitAction(waitOptions(ofMillis(250))).perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Press by element
    public void pressByElement (MobileElement mobileElement, long seconds) {
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
    public void pressByCoordinates (int x, int y, long seconds) {
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
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
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
    private void raiseToast(String text) {
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

        driver.executeScript("mobile: backdoor", scriptArgs);
    }

    public static ExpectedCondition<Boolean> toastMatches(String matchText, Boolean isRegexp) {
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

    /**
     https://appiumpro.com/editions/64
     */
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

    /***EXTENT REPORT****************************************************************/
    public static String returnDateStamp(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public static void captureScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStamp(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/output/imgs/" + screenshotName));

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

}
