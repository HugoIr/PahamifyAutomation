package test.pahamify.testCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.net.MalformedURLException;
import java.net.URL;


public class Onboarding extends BaseClass {

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapability = new DesiredCapabilities();
        desiredCapability.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapability.setCapability("platformName", "android");
        desiredCapability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pahamify.android");
        desiredCapability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.pahamify.android"
                                                                      + ".SplashActivity");
        desiredCapability.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver driver;
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapability);

        Thread.sleep(30000);
        // test.pahamify.testCases.Onboarding Swipe

        swipeAction(driver, 57, 819, 803, 819);
        swipeAction(driver, 1011, 791, 399, 766);
        swipeAction(driver, 978, 815, 204, 681);
        swipeAction(driver, 962, 326, 224, 448);
        swipeAction(driver, 1023, 734, 253, 628);

        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget"
                                                                      + ".TextView[@text='Daftar"
                                                                      + "']");

        el1.click();
        Thread.sleep(3000);

        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget"
                                                                      + ".TextView[@text='Daftar"
                                                                      + " dengan Email"
                                                                      + "']");
        el2.click();
        Thread.sleep(3000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
        el3.sendKeys("trishannettesteph@outlook.com");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
        el4.sendKeys("trishannettesteph@outlook.com");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
        el5.sendKeys("thrisha43");
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
        el6.click();
        Thread.sleep(2000);
        el6.click();

        swipeAction(driver, 884,1051,901,383);

        MobileElement verifikasiNantiBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Nanti']");
        verifikasiNantiBtn.click();

        Assert.assertTrue(true);
        Thread.sleep(10000);
        driver.quit();
    }

}
