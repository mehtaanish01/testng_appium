import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AndroidApp {



    //Obtain Run URL from Link Provided for Organization
    static String TG_DEVICE_URL="http://testos.testgrid.io:8057/wd/hub";

    AppiumDriver driver;

    //Obtain Capabilities from Link Provided for Organization
    static String TG_DEVICE_NAME="Samsung Galaxy S10";
    static String TG_DEVICE_UDID="R58M90X176B";
    static String TG_DEVICE_PLATFORMNAME="Android";
    static String TG_DEVICE_PLATFORMVERSION="12";

    //Set Package Name & Activity - For App You want to automate
    static String APP_PACKAGE="com.lambdatest.proverbial";
    static String APP_ACTIVITY="com.lambdatest.proverbial.MainActivity";
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", TG_DEVICE_NAME);
        cap.setCapability("udid", TG_DEVICE_UDID);
        cap.setCapability("platformName", TG_DEVICE_PLATFORMNAME);
        cap.setCapability("platformVersion", TG_DEVICE_PLATFORMVERSION);
        cap.setCapability("appPackage", APP_PACKAGE);
        cap.setCapability("appActivity", APP_ACTIVITY);
        URL url = new URL(TG_DEVICE_URL);
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, cap);

//    @Test
//    @org.testng.annotations.Parameters(value = {"device", "version", "platform"})
//    public void AndroidApp1(String device, String version, String platform) {
//        try {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("build","Java TestNG Android");
//            capabilities.setCapability("name",platform+" "+device+" "+version);
//            capabilities.setCapability("deviceName", device);
//            capabilities.setCapability("platformVersion",version);
//            capabilities.setCapability("platformName", platform);
//            capabilities.setCapability("isRealMobile", true);
//            //AppURL (Create from Wikipedia.apk sample in project)
//            capabilities.setCapability("app", "APP_URL"); //Enter your app url
//            capabilities.setCapability("deviceOrientation", "PORTRAIT");
//            capabilities.setCapability("console", true);
//            capabilities.setCapability("network", false);
//            capabilities.setCapability("visual", true);
//            capabilities.setCapability("devicelog", true);
//            //capabilities.setCapability("geoLocation", "HK");
//
//            String hub = "https://" + userName + ":" + accessKey + gridURL;
//            driver = new AppiumDriver(new URL(hub), capabilities);

        MobileElement color = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/color");
        //Changes color to pink
        color.click();
        Thread.sleep(1000);
        //Back to orginal color
        color.click();

        MobileElement text = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/Text");
        //Changes the text to "Proverbial"
        text.click();

        //toast will be visible
        MobileElement toast = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/toast");
        toast.click();

        //notification will be visible
        MobileElement notification = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/notification");
        notification.click();
        Thread.sleep(2000);

        //Opens the geolocation page
        MobileElement geo = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/geoLocation");
        geo.click();
        Thread.sleep(5000);

        //takes back to home page
        MobileElement home = (MobileElement) driver.findElementByAccessibilityId("Home");
        home.click();

        //Takes to speed test page
        MobileElement speedtest = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/speedTest");
        speedtest.click();
        Thread.sleep(5000);

        MobileElement Home = (MobileElement) driver.findElementByAccessibilityId("Home");
        Home.click();

        //Opens the browser
        MobileElement browser = (MobileElement) driver.findElementByAccessibilityId("Browser");
        browser.click();

//            MobileElement url = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/url");
//            url.sendKeys("https://www.lambdatest.com");

        MobileElement find = (MobileElement) driver.findElementById("com.lambdatest.proverbial:id/find");
        find.click();

        driver.quit();


            try{
                driver.quit();
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }


    }

