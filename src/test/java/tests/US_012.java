package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012 {

    UserHomePage userHomePage = new UserHomePage();
    AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();







    @Test
    public void TC_1201() {

    //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

    //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

    // Anasayfanin goruldugu dorulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    //Anasayfa bodysinde bulunan "Departments" bolumunden istenilen bir departmana tiklar.
        userHomePage.welnessImage.click();

    //"Appointment Booking " yazisinin goruntulendigi dogrulanir.

        Assert. assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());


    //Kullanici acilan sayfada randevu tarihini secer, "phone" kutusuna telefon numarasi ekler, ilgili saglik deparmanini ve doktoru sectikten sonra "Appointment Booking" e tiklar.
    //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.
    }

    @Test
    public void TC_1202(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        // Anasayfanin goruldugu dorulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

        //Anasayfa bodysinde bulunan "Departments" bolumunden istenilen bir departmana tiklar.
        userHomePage.welnessImage.click();

        //"Appointment Booking " yazisinin goruntulendigi dogrulanir.

        Assert. assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());

        //Kullanici acilan sayfada randevu tarihini secMEZ, "phone" kutusuna icinde HARF bulunan bir deger ekler, ilgili saglik deparmanini ve doktoru sectikten sonra "Appointment Booking" e tiklar.



        //"Congratulations on your well-deserved success." yazisinin goruntulenmedigi ve hata uyarisinin alindigi dogrulanir.








    }

}
