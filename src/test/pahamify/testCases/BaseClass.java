package test.pahamify.testCases;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.pahamify.utilities.ReadConfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class BaseClass {

    public static AndroidDriver driver;
    public DesiredCapabilities desiredCapability;
    public static org.testng.log4testng.Logger Logger;
    public static ReadConfig config;

    @BeforeClass
    public void setup() throws InterruptedException, MalformedURLException {
        config = new ReadConfig();

        desiredCapability = new DesiredCapabilities();
        desiredCapability.setCapability(MobileCapabilityType.DEVICE_NAME, config.getDeviceName());
        desiredCapability.setCapability("platformName", config.getPlatformName());
        desiredCapability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, config.getAppPackage());
        desiredCapability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, config.getAppActivity());
        desiredCapability.setCapability(MobileCapabilityType.NO_RESET, config.isNoReset());

        driver = new AndroidDriver(new URL(config.getUrl()), desiredCapability);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("set timeout");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public static void swipeAction(AndroidDriver driver, int xPress, int yPress, int xMove,
                                   int yMove) throws InterruptedException {
        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(xPress, yPress))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(new PointOption().withCoordinates(xMove, yMove))
                .release()
                .perform();
        Thread.sleep(1000);
    }

    public static void tapAction(AndroidDriver driver, int x, int y) throws InterruptedException {
        (new TouchAction(driver))
                .tap(new PointOption().withCoordinates(x,y))
                .waitAction(waitOptions(ofMillis(5000)))
                .perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void swipeDown(AndroidDriver driver) throws InterruptedException {

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(481, 1512))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(new PointOption().withCoordinates(493, 774))
                .release()
                .perform();
//        Thread.sleep(1000);

    }

    public static void swipeRight(AndroidDriver driver) throws InterruptedException {
        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(929, 1308))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(new PointOption().withCoordinates(444, 1308))
                .release()
                .perform();
//        Thread.sleep(1000);
    }


}
