package test.pahamify.testCases;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException, MalformedURLException {

        List onHomepage = driver.findElements(By.xpath("//android.widget.TextView[@text='Mata Pelajaran']"));

        // try if already login
        // then logout
        try {
            if ( !onHomepage.isEmpty()) {
                System.out.println("on Homepage");

                // -----------------------------------------------------------------------------------------
                // choose one of the available subject

                MobileElement subjectBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
                                                                                     + ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView");
                subjectBtn.click();

                Thread.sleep(2000);

                MobileElement courseBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Sifat-Sifat Koligatif Larutan']");
                courseBtn.click();

                Thread.sleep(2000);

                MobileElement courseVideo = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Sifat Koligatif Larutan Non Elektrolit']");
                courseVideo.click();

                Thread.sleep(2000);
                List titleOfVideo = driver.findElements(By.xpath("//android.widget.TextView[@text='Sifat Koligatif Larutan Non Elektrolit']"));

                // watch video for a while
                Thread.sleep(5000);

                swipeDown(driver);

                Thread.sleep(3000);
                //---------------------------------------------------------
//                tapAction(driver, 322,1683);
//
//                tapAction(driver, 746,1695);
//                tapAction(driver, 950,1667);
//                tapAction(driver, 94,1667);
//
//                // swipe down 8 times
//                for(int i = 0; i < 8; i++) {
//                    swipeDown(driver);
//                }
//
//                // check the most bottom carousel
//                for(int i = 0; i < 5; i++) {
//                    swipeRight(driver);
//                }


                Assert.assertTrue(true);
//                (new TouchAction(driver)).tap(new PointOption().withCoordinates(542, 420)).perform();
//                Thread.sleep(1000);
//                System.out.println("profile");
//                Thread.sleep(1000);
//
//                (new TouchAction(driver)).tap(new PointOption().withCoordinates(986, 143)).perform();
//
//                Thread.sleep(3000);
//                System.out.println("settings");
//
//                swipeAction(driver, 791, 1581, 799,901);
//                swipeAction(driver, 791, 1581, 799,901);
//                swipeAction(driver, 791, 1581, 799,901);
//
//                Thread.sleep(1000);
//                System.out.println("swiped");
//                MobileElement logoutBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Log Out']");
//                logoutBtn.click();
//                System.out.println("logout!");
            }

        }

        // if not login yet
        catch (NoSuchElementException e) {

            // try if already in login page
                System.out.println("before textlogin ");
                List textLogin = driver.findElements(By.id("b75c783f-bceb-450e-8186-27cdb2a40cd1"));
                System.out.println("after textlogin ");
                Thread.sleep(1000);
                if ( ! textLogin.isEmpty() ) {
                    System.out.println("textlogin exist ");

                    MobileElement masukBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='di sini']");
                    masukBtn.click();
                    System.out.println("di sini ");
                    Thread.sleep(2000);


                }

                // elementid = 39d96e7c-3d53-4c4d-9b59-5a30800f0a8a
                MobileElement masukDenganEmailBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Masuk dengan Email']");
                masukDenganEmailBtn.click();

                //                MobileElement emailInput = (MobileElement) driver.findElementById("dd9940eb-7df1-4a65-9fa2-95c404a475a8");
                Thread.sleep(2000);
                MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
                el1.sendKeys(config.getEmail());
                MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
                el2.sendKeys(config.getPassword());
                MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
                el3.click();
                Thread.sleep(2000);
                el3.click();

                MobileElement loginBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Masuk']");
                loginBtn.click();

                // if user asked to fill the basic information
                // when login for the first time
                List pilihAvatar = driver.findElements(By.xpath("//android.widget.TextView[@text='Pilih Avatar Kamu']"));
                if ( !pilihAvatar.isEmpty()) {
                    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText");
                    el5.sendKeys("lilaamir43");
                    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
                    el6.click();
                    MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.TextView");
                    el7.click();
                    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup/android.widget.TextView");
                    el8.click();

                    MobileElement lanjutBtn = (MobileElement) driver.findElementById("9951750e-023c-45e7-9c84-cde9160fce18");
                    lanjutBtn.click();

                    MobileElement lewati = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Lewati']");
                    lewati.click();

                    List verifikasiPopUp = driver.findElements(By.xpath("//android.widget.TextView[@text='Yuk Verifikasikan Nomor HP-mu!']"));
                    if ( !verifikasiPopUp.isEmpty()) {
                        (new TouchAction(driver)).tap(new PointOption().withCoordinates(986, 183)).perform();
                        System.out.println("Berhasil mengisi ");
                    }
                }

                // on login success
                else {
                    System.out.println("berhasil login!");
                    Thread.sleep(15000);

                    // swipe down 8 times
                    for(int i = 0; i < 8; i++) {
                        swipeDown(driver);
                    }

                    // check the most bottom carousel
                    for(int i = 0; i < 5; i++) {
                        swipeRight(driver);
                    }

                    tapAction(driver, 322,1683);
                    Thread.sleep(10);
                    tapAction(driver, 746,1695);
                    Thread.sleep(10);
                    tapAction(driver, 950,1667);
                    Thread.sleep(10);
                    tapAction(driver, 94,1667);
                    Thread.sleep(3);

                    // -----------------------------------------------------------------------------------------
                    // choose one of the available subject

                    MobileElement subjectBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
                                                                                + ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView");
                    subjectBtn.click();

                    for(int i = 0; i < 3; i++) {
                        swipeDown(driver);
                    }

                    MobileElement courseBtn = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Sifat-Sifat Koligatif Larutan']");
                    courseBtn.click();

                    MobileElement courseVideo = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Sifat Koligatif Larutan Non Elektrolit']");
                    courseVideo.click();

                    List titleOfVideo = driver.findElements(By.xpath("//android.widget.TextView[@text='Sifat Koligatif Larutan Non Elektrolit']"));
                    // watch video for a while
                    Thread.sleep(15000);

                    swipeDown(driver);
                    MobileElement durationText = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='03.14']");
                    durationText.click();



//                    List profileBox = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
//                                                                   + ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view"
//                                                                   + ".ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]"));

                    // If user on the homepage
                    if (!titleOfVideo.isEmpty()) {
                        Assert.assertTrue(true);
                    }
                }


        }


        driver.quit();
    }

}
