package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;

public class CommonUtils {


    private static Properties prop = new Properties();
    public static int EXPLICIT_WAIT_TIME;
    public static int IMPLICIT_WAIT_TIME;
    public static int DEFAULT_WAIT_TIME;
    public static String APPLICATION_NAME;
    public static String BASE_PKG;
    public static String APPS_ACTIVITY;
    public static String APP_PASSWORD;
    private static String APPIUM_PORT;
    public static String AUTOMATION_INSTRUMENTATION;
    public static String BROWSER_NAME;
    public static String PLATFORM_NAME;
    public static int NEW_COMMAND_TIMEOUT;
    public static String PLATFORM_VERSION;
    public static int DEVICE_TIMEOUT;
    public static String DEVICE_NAME;

    //Ios
    public static String UDID;
    public static String APP;
    public static String AUTOMATION_NAME;
    public static String BUNDLEID;

    private static DesiredCapabilities capabilities = new DesiredCapabilities();
    private static URL serverUrl;
    private static AppiumDriver driver;

    public static void loadAndroidConfigProp(String propertyFileName) throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/client/properties/"+propertyFileName);
        prop.load(fis);

        EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
        IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
        DEFAULT_WAIT_TIME = Integer.parseInt(prop.getProperty("default.wait"));
        APPLICATION_NAME = prop.getProperty("application.path");
        BASE_PKG = prop.getProperty("base.pkg");
        APPS_ACTIVITY = prop.getProperty("application.activity");
        APPIUM_PORT = prop.getProperty("appium.server.port");
        AUTOMATION_INSTRUMENTATION=prop.getProperty("automation.instumentation");
        DEVICE_NAME=prop.getProperty("device.name");
        BROWSER_NAME=prop.getProperty("browser.name");
        PLATFORM_NAME=prop.getProperty("platform.name");
        PLATFORM_VERSION=prop.getProperty("platform.version");
        NEW_COMMAND_TIMEOUT= Integer.parseInt(prop.getProperty("new.command.timeout"));
        DEVICE_TIMEOUT= Integer.parseInt(prop.getProperty("device.ready.timeout"));

    }

    public static void loadIosConfigProp(String propertyFileName) throws IOException {
        FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/client/properties/"+propertyFileName);
        prop.load(fis2);

        EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
        IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
        DEFAULT_WAIT_TIME = Integer.parseInt(prop.getProperty("default.wait"));
        UDID = prop.getProperty("udid");
        APP = prop.getProperty("application.app");
        APPIUM_PORT = prop.getProperty("appium.server.port");
        AUTOMATION_NAME=prop.getProperty("automation.name");
        DEVICE_NAME=prop.getProperty("device.name");
        PLATFORM_NAME=prop.getProperty("platform.name");
        PLATFORM_VERSION=prop.getProperty("platform.version");
        NEW_COMMAND_TIMEOUT= Integer.parseInt(prop.getProperty("new.command.timeout"));
        DEVICE_TIMEOUT= Integer.parseInt(prop.getProperty("device.ready.timeout"));
        BUNDLEID=prop.getProperty("bundle.id");
    }

    public static void setAndroidCapabilities() {
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, CommonUtils.BROWSER_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, CommonUtils.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, CommonUtils.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, CommonUtils.AUTOMATION_INSTRUMENTATION);
        capabilities.setCapability(MobileCapabilityType.APP, CommonUtils.APPLICATION_NAME);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, CommonUtils.NEW_COMMAND_TIMEOUT);
        capabilities.setCapability(DEVICE_READY_TIMEOUT, CommonUtils.DEVICE_TIMEOUT);
        capabilities.setCapability(APP_ACTIVITY, CommonUtils.APPS_ACTIVITY);
        capabilities.setCapability(APP_PACKAGE, CommonUtils.BASE_PKG);
        //https://appiumpro.com/editions/50 - if false will install from android properties
        capabilities.setCapability("skipDeviceInitialization", true);
        capabilities.setCapability("skipServerInstallation", true);
    }

    public static void setIOSCapabilities() {
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, CommonUtils.BROWSER_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, CommonUtils.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, CommonUtils.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.UDID, CommonUtils.UDID);
        //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, CommonUtils.AUTOMATION_INSTRUMENTATION);
        //capabilities.setCapability(MobileCapabilityType.APP, CommonUtils.APPLICATION_NAME);
        capabilities.setCapability("bundleId", CommonUtils.BUNDLEID);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, CommonUtils.NEW_COMMAND_TIMEOUT);
        capabilities.setCapability(DEVICE_READY_TIMEOUT, CommonUtils.DEVICE_TIMEOUT);
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        //capabilities.setCapability("app", CommonUtils.APP);
    }

    public static AppiumDriver getAndroidDriver() throws MalformedURLException {
        serverUrl = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");
        driver = new AndroidDriver(serverUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public static AppiumDriver getIOSDriver() throws MalformedURLException {
        serverUrl = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");
        driver = new IOSDriver(serverUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }



}
