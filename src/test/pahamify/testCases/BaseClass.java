package test.pahamify.testCases;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.pahamify.utilities.ReadConfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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
        System.out.println("Set timeout");

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

    public static void fillAvatarAtTheFirstTimeLoginTest() throws InterruptedException {

        tapAction(driver, 371,526);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText");
        el5.sendKeys("trishaa789");
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.TextView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup/android.widget.TextView");
        el8.click();

        MobileElement lanjutBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Lanjut']");
        lanjutBtn.click();

        Thread.sleep(1000);

        MobileElement lewati = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Lewati']");
        lewati.click();

        List verifikasiPopUp = driver.findElements(By.xpath("//android.widget.TextView[@text='Yuk Verifikasikan Nomor HP-mu!']"));
        if ( !verifikasiPopUp.isEmpty()) {
            (new TouchAction(driver)).tap(new PointOption().withCoordinates(986, 183)).perform();
            System.out.println("Berhasil mengisi ");
        }
    }

}
