package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import utilities.*;

import java.security.Key;

public class US_013 extends TestBaseRapor {



    @Test(groups = "smoke")
    public void TC_1301_Randevu_Olusturma_Testi(){
        extentTest = extentReports.createTest("Randevu Testi",
                "Kullanici basarili bir sekilde randevu olusturabilmeli");
        UserHomePage userHomePage = new UserHomePage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        DoctorsPage doctorsPage = new DoctorsPage();
        Actions actions = new Actions(Driver.getDriver());


        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici LoyalFriendCare anasayfasina gider");
        ReusableMethods.wait(2);
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();
        extentTest.info("Kullanici SignIn butonuna tiklar");
        ReusableMethods.wait(2);

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.wait(2);
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.wait(2);
        extentTest.info("Kullanici gecerli mail ve password bilgileriyle giris yapar");
        userHomePage.loginButton.click();

        //Anasayfanin goruldugu dorulanir.

        ReusableMethods.wait(4);

        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        actions.moveToElement(userHomePage.drOliviaBennetImage).perform();
        extentTest.info("Kullanici Dr. Olivia Benneti popular doktors bolumunde goruntuler");
        ReusableMethods.wait(2);
        userHomePage.drOliviaBennetImage.click();
        ReusableMethods.wait(2);

        //"Appointment Booking " yazisinin goruntulendigi dogrulanir.
        Assert.assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());
        extentTest.pass("Kullanici randevu bolumunu goruntuler");
        ReusableMethods.wait(2);

        //Kullanici acilan sayfada randevu tarihini secer,
        // "phone" kutusuna telefon numarasi ekler,
        // ilgili saglik deparmanini ve doktoru sectikten sonra "Appointment Booking" e tiklar.
        appointmentBookingPage.dateTextBox.sendKeys("27052024");
        ReusableMethods.wait(3);
        appointmentBookingPage.phoneNumberTextBox.sendKeys("05555555555"+ Keys.TAB + Keys.ARROW_DOWN+
                Keys.ARROW_DOWN +Keys.ENTER +  Keys.TAB + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN +
                Keys.ENTER + Keys.TAB + "Mesaj bulunuyor");

                        ReusableMethods.wait(4);

        extentTest.info("Kullanici gecerli Tarih, Telefon vb. bilgilerini girer");

        appointmentBookingPage.appointmenbookingButon.click();
        extentTest.info("Kullanici appointment booking butonuna tiklar");

        ReusableMethods.wait(4);

        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.
        Assert.assertTrue(appointmentBookingPage.appointmenBookingTextSuccessText.isDisplayed());
        extentTest.pass("Kullanici basarili bir sekilde randevusunu olusturur.");

        ReusableMethods.wait(2);

    }

    @Test
    public void TC_1302(){
        UserHomePage userHomePage = new UserHomePage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());
        DoctorsPage doctorsPage = new DoctorsPage();

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfanin goruldugu dorulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        userHomePage.drOliviaBennetImage.click();

        //"Leave a Review" yazisinin goruldugu dogrulanir.
        Assert.assertTrue(doctorsPage.leaveAReviewText.isDisplayed());

        //Kullanici "Rating" dropdown menusune tiklar ve puanlama yapar.
        doctorsPage.ratingDropDownMenu.click();
        doctorsPage.ratingDropDownMenu5.click();

        //Kullanici "Your Review" text alanina tiklar ve feedback yazar.
        actions.sendKeys(Keys.TAB)
                .sendKeys("Basarılı bir doktor").perform();
        ReusableMethods.wait(2);

        //"Submit" butonuna tiklanir.
        doctorsPage.submitButton.click();

        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.
        Assert.assertTrue(doctorsPage.successText.isDisplayed());


    }
    @Test
    public void TC_1303(){
        UserHomePage userHomePage = new UserHomePage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());
        DoctorsPage doctorsPage = new DoctorsPage();

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.loginButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfanin goruldugu dorulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        userHomePage.drOliviaBennetImage.click();

        //"Leave a Review" yazisinin goruldugu dogrulanir.
        Assert.assertTrue(doctorsPage.leaveAReviewText.isDisplayed());

        //Kullanici "Rating" dropdown menusunden herhangi bir degeri secmez.
        doctorsPage.ratingDropDownMenu.click();

        //Kullanici "Your Review" text alanina herhangi bir metin girmez.
        actions.sendKeys(Keys.TAB);

        //"Submit" butonuna tiklanir.
        doctorsPage.submitButton.click();

        //"Congratulations on your well-deserved success." yazisinin goruntulenmedigi ve hata bildirimi alindigi dogrulanir.
        Assert.assertFalse(doctorsPage.successText.isDisplayed());

    }

    @Test(groups = "smoke")
    public void TC_1304_Feedback_Olusturma_Testi(){
        extentTest = extentReports.createTest("Feedback Testi",
                "Kullanici feedback gonderebilmeli");
        UserHomePage userHomePage = new UserHomePage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        DoctorsPage doctorsPage = new DoctorsPage();
        Actions actions = new Actions(Driver.getDriver());


        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici LoyalFriendCare anasayfasina gider");
        ReusableMethods.wait(2);
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();
        extentTest.info("Kullanici SignIn butonuna tiklar");
        ReusableMethods.wait(2);

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.wait(2);
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.wait(2);
        extentTest.info("Kullanici gecerli mail ve password bilgileriyle giris yapar");
        userHomePage.loginButton.click();

        //Anasayfanin goruldugu dorulanir.

        ReusableMethods.wait(4);

        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        actions.moveToElement(userHomePage.drOliviaBennetImage).perform();
        extentTest.info("Kullanici Dr. Olivia Benneti popular doktors bolumunde goruntuler");
        ReusableMethods.wait(2);
        userHomePage.drOliviaBennetImage.click();
        ReusableMethods.wait(2);
        actions.moveToElement(doctorsPage.submitButton);
        ReusableMethods.wait(4);
        extentTest.info("Kullanici feedback bolumune iner");
        doctorsPage.ratingDropDownMenu.click();
        ReusableMethods.wait(2);
        doctorsPage.ratingDropDownMenu5.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys("Basarılı bir doktor").perform();
        ReusableMethods.wait(2);
        extentTest.info("Kullanici feedback bolumune bilgi girisini yapar");
        ReusableMethods.wait(1);
        doctorsPage.submitButton.click();
        extentTest.info("Kullanici submit botununa tiklar");
        ReusableMethods.wait(4);

        Assert.assertTrue(appointmentBookingPage.appointmenBookingTextSuccessText.isDisplayed());
        extentTest.pass("Kullanici basarili bir sekilde feedback gonderir");

        ReusableMethods.wait(2);


    }















}
