package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013 {



    @Test
    public void TC_1301(){
        UserHomePage userHomePage = new UserHomePage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());


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

        //"Appointment Booking " yazisinin goruntulendigi dogrulanir.
        Assert. assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());

        //Kullanici acilan sayfada randevu tarihini secer,
        // "phone" kutusuna telefon numarasi ekler,
        // ilgili saglik deparmanini ve doktoru sectikten sonra "Appointment Booking" e tiklar.
                actions.sendKeys(appointmentBookingPage.dateTextBox)
                .sendKeys("20").sendKeys("08").sendKeys("2024")
                .sendKeys(Keys.TAB)
                .sendKeys("05425424242")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        ReusableMethods.wait(1);

        appointmentBookingPage.appointmentBookingDepartmanDropDown.click();

        ReusableMethods.wait(1);

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        ReusableMethods.wait(1);

        appointmentBookingPage.drDropdownMenuDrIsabella.click();

        ReusableMethods.wait(1);

        appointmentBookingPage.appointmenbookingButon.click();

        ReusableMethods.wait(2);

        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.
        Assert.assertTrue(appointmentBookingPage.appointmenBookingTextSuccessText.isDisplayed());


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















}
