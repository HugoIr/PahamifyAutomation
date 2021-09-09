package test.pahamify.testCases;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class RegisterTest extends BaseClass {

    @Test
    public void registerTest() throws InterruptedException {

        try {
            driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
            List onBoardingRegisterBtn = driver.findElements(By.xpath("//android.widget.TextView[@text='Daftar']"));
            List onLoginPage = driver.findElements(By.xpath("//android.widget.TextView[@text='Selamat Datang Kembali']"));

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            // if current page is onboarding page
            if (!onBoardingRegisterBtn.isEmpty()) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                onBoardingTest();
                MobileElement registerBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Daftar']");
                registerBtn.click();

                fillRegistrationUsingEmailForm();

                // if user asked to fill the basic information
                // when login for the first time
                System.out.println("bef");
                fillAvatarAtTheFirstTimeLoginTest();
                System.out.println("aft");

                Assert.assertTrue(true);

            }

            // if current page is the login page
            else if ( !onLoginPage.isEmpty()) {
                swipeDown(driver);

                // Click daftar baru
                tapAction(driver, 742, 1655);

                fillRegistrationUsingEmailForm();
                System.out.println("bef");
                fillAvatarAtTheFirstTimeLoginTest();
                System.out.println("aft");
            }
        }
        catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    public static void onBoardingTest() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            swipeAction(driver, 1011, 791, 399, 766);
        }
    }

    public static void fillRegistrationUsingEmailForm() throws InterruptedException {
        MobileElement registerWithEmailBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Daftar dengan Email']");
        registerWithEmailBtn.click();

        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[1]/android.widget.EditText");
        el3.sendKeys("trishannettesteph@outlook.com");

        MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[2]/android.widget.EditText");
        el4.sendKeys("trishannettesteph@outlook.com");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[3]/android.widget.EditText");
        el5.sendKeys("thrisha43");

        swipeDown(driver);
        Thread.sleep(1000);
        MobileElement withoutVerificationBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Verifikasi Email Nanti']");
        withoutVerificationBtn.click();

        Thread.sleep(5000);
    }

}
