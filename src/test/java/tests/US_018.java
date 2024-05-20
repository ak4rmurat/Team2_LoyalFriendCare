package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.MedicinesPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_018 {


    @Test
    public void TC_001(){
        UserHomePage userHomePage = new UserHomePage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
       // 5 - Anasaydaki header bolumunden "Medicines"e tiklar
        userHomePage.medicinesDropDown.click();
       // 6 - Sayfada ilaclari goruntuler

        Driver.quitDriver();
    }

    @Test
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();
        MedicinesPage medicinesPage = new MedicinesPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
       // 5 - Anasaydaki header bolumunden "Medicines"e tiklar
        userHomePage.medicinesDropDown.click();
       // 6 - Medicines bolumunda "Revolution" a tiklar
        medicinesPage.revolutionlMedicineImage.click();
       // 7 - Gecmis bir tarih secer
        appointmentBookingPage.dateTextBox.sendKeys("15052024");
       // 8 - Telefon numarası, Departman, Doktor ve Message bilgilerini girer
        appointmentBookingPage.phoneNumberTextBox.sendKeys("05555555555"+ Keys.TAB + Keys.ARROW_DOWN+
                Keys.ARROW_DOWN +Keys.ENTER +  Keys.TAB + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN+
                Keys.ENTER + Keys.TAB + "Mesaj bulunuyor");
       // 9 - "Appointment Booking" e tiklar
        ReusableMethods.wait(5);
        appointmentBookingPage.appointmenbookingButon.click();
       // 10 - Ekranda hata mesajı alir.
        Assert.assertFalse(appointmentBookingPage.conformatiomMassage.isDisplayed());

        Driver.quitDriver();
    }
     @Test
    public void TC_003() {
         UserHomePage userHomePage = new UserHomePage();
         MedicinesPage medicinesPage = new MedicinesPage();
         AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();

         //1 - Kullanici hedef URL'e gider
         Driver.getDriver().get(ConfigReader.getProperty("url"));
         //    2 - "Sing In" butonuna tiklar
         userHomePage.signInButton.click();
         //3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
         userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
         userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
         //4 - "Sign In" butonuna tiklar
         userHomePage.loginButton.click();
         //5 - Anasaydaki header bolumunden "Medicines"e tiklar
         userHomePage.medicinesDropDown.click();
         //6 - Medicines bolumunda "Baytril" e tiklar
        medicinesPage.rimadylMedicineImage.click();
         //7 - Uygun kriterler ile Randevu tarihi,  Telefon numarası, Departman, Doktor ve Message bilgilerini girer
         ReusableMethods.wait(2);
         appointmentBookingPage.dateTextBox.sendKeys("25052024");
         appointmentBookingPage.phoneNumberTextBox.sendKeys("05555555555"+ Keys.TAB + Keys.ARROW_DOWN+
                 Keys.ARROW_DOWN +Keys.ENTER +  Keys.TAB + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN+
                 Keys.ENTER + Keys.TAB + "Mesaj bulunuyor");
         //9 - "Appointment Booking" e tiklar
         ReusableMethods.wait(2);
         appointmentBookingPage.appointmenbookingButon.click();
         ReusableMethods.wait(2);
         //10 - "Congratulations on your well-deserved success." mesajini goruntuler
         String expectedMessage = "Congratulations on your well-deserved success.";
         String actualMessage = appointmentBookingPage.conformatiomMassage.getText();
         Assert.assertEquals(actualMessage,expectedMessage);

         Driver.quitDriver();

    }
    @Test
    public void TC_004(){
        UserHomePage userHomePage = new UserHomePage();
        MedicinesPage medicinesPage = new MedicinesPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
       // 5 - Anasaydaki header bolumunden "Medicines"e tiklar
        userHomePage.medicinesDropDown.click();
       // 6 - Medicines bolumunda "Revolution" a tiklar
        medicinesPage.revolutionlMedicineImage.click();
       // 7 - Tarih girişi yapmadan,  Telefon numarası, Departman ve Message bilgilerini girer
        ReusableMethods.wait(2);
        appointmentBookingPage.phoneNumberTextBox.sendKeys("05555555555"+ Keys.TAB + Keys.ARROW_DOWN+
                Keys.ARROW_DOWN +Keys.ENTER +  Keys.TAB + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN+
                Keys.ENTER + Keys.TAB + "Mesaj bulunuyor");

       // 9 - "Appointment Booking" e tiklar
        appointmentBookingPage.appointmenbookingButon.click();
       // 10 - Ekranda hata mesajı cikar
        Assert.assertFalse(appointmentBookingPage.conformatiomMassage.isDisplayed());

        Driver.quitDriver();

    }
}
