package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AppointmentBookingPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014 {


    UserHomePage userHomePage = new UserHomePage();
    VaccinationsPage vaccinationsPage = new VaccinationsPage();
    AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    String name = faker.name().firstName();
    String emailAdress = faker.internet().emailAddress();



    @Test
    public void TC_1401(){

        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();


        // 3 - Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);


        // 4 - Anasayfanin goruntulendigini gorur ve body kisminda bulunan
        //     "Vaccinations" bolumu bulunur, tiklanir ve ilgili sayfaya gidilir.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userHomePage.vaccinationsImage.click();
        ReusableMethods.wait(2);


        // 5 - "Vaccinations" sayfasinda "Appointment Booking" bolumunde
        //     date, phone number, welness, dr., create message bolumleri goruntulenir.

        Assert.assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());
        Assert.assertTrue(appointmentBookingPage.phoneNumberTextBox.isEnabled());
        Assert.assertTrue(appointmentBookingPage.welnessDropdown.isEnabled());
        Assert.assertTrue(appointmentBookingPage.doctorDropdown.isEnabled());
        Assert.assertTrue(appointmentBookingPage.createTextBoxMessage.isEnabled());


        // 6 - Date ogesinden asi icin istenen gun girilir veya takvimden secilir

        appointmentBookingPage.dateTextBox.sendKeys("28.05.2024");


        // 7 - Telefon Numarasi girilir

        appointmentBookingPage.phoneNumberTextBox.sendKeys("5425424242");


        // 8 - Asinin hangi bolumle ilgili yapilacagi dropdown menuden secilir

        appointmentBookingPage.welnessDropdown.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);


        // 9 - Dropdown menuden doktor secimi yapilir

        //appointmentBookingPage.doctorDropdown.click();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //ReusableMethods.wait(2);


        // 10 - Mesaj yazilmak isteniyorsa mesaj bolumune yazilir.

        appointmentBookingPage.createTextBoxMessage.sendKeys("Merhabalar.");


        // 11 - Appointment Booking butonuna tiklanir ve
        //      "Congratulations on your well-deserved success." yazisi gorunur.

        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertTrue(appointmentBookingPage.appointmentBookingText.isDisplayed());
        ReusableMethods.wait(2);


        Driver.getDriver().quit();

    }

    @Test
    public void TC_1402(){

        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();


        // 3 - Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);


        // 4 - Anasayfanin goruntulendigini gorur ve body kisminda bulunan
        //     "Vaccinations" bolumu bulunur, tiklanir ve ilgili sayfaya gidilir.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userHomePage.vaccinationsImage.click();
        ReusableMethods.wait(2);


        // 5 - Date ogesinden asi icin gecmis tarihli gun girilir veya takvimden secilir

        appointmentBookingPage.dateTextBox.sendKeys("28.05.2023");


        // 6 - Telefon Numarasi girilir

        appointmentBookingPage.phoneNumberTextBox.sendKeys("5425424242");


        // 7 - Asinin hangi bolumle ilgili yapilacagi dropdown menuden secilir

        appointmentBookingPage.welnessDropdown.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();


        // 8 - Dropdown menuden doktor secimi yapilir

        //appointmentBookingPage.doctorDropdown.click();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //ReusableMethods.wait(2);


        // 9 - Mesaj yazilmak isteniyorsa mesaj bolumune yazilir.

        appointmentBookingPage.createTextBoxMessage.sendKeys("Merhabalar.");


        // 10 - Appointment Booking butonuna tiklanir ve
        //      "Congratulations on your well-deserved success." yazisi gorunur.

        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertTrue(appointmentBookingPage.appointmentBookingText.isDisplayed());
        ReusableMethods.wait(2);


        Driver.getDriver().quit();
    }

    @Test
    public void TC_1403(){

        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();


        // 3 - Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);


        // 4 - Anasayfanin goruntulendigini gorur ve body kisminda bulunan
        //     "Vaccinations" bolumu bulunur, tiklanir ve ilgili sayfaya gidilir.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userHomePage.vaccinationsImage.click();
        ReusableMethods.wait(2);


        // 5 - Date ogesinden asi icin istenen gun girilir veya takvimden secilir

        appointmentBookingPage.dateTextBox.sendKeys("28.05.2024");


        // 6 - Telefon Numarasi yanlis girilir

        appointmentBookingPage.phoneNumberTextBox.sendKeys("123Abcde12.");


        // 7 - Asinin hangi bolumle ilgili yapilacagi dropdown menuden secilir

        appointmentBookingPage.welnessDropdown.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();


        // 8 - Dropdown menuden doktor secimi yapilir

        // actions.sendKeys(Keys.TAB).click().sendKeys().click().sendKeys(Keys.TAB).sendKeys("Thank You").perform();

        //appointmentBookingPage.doctorDropdown.click();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //actions.sendKeys(Keys.ARROW_DOWN).perform();
        //ReusableMethods.wait(2);


        // 9 - Mesaj yazilmak isteniyorsa mesaj bolumune yazilir.

        appointmentBookingPage.createTextBoxMessage.sendKeys("Merhabalar.");


        // 10 - Appointment Booking butonuna tiklanir ve
        //      "Congratulations on your well-deserved success." yazisi gorunur.

        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertTrue(appointmentBookingPage.appointmentBookingText.isDisplayed());
        ReusableMethods.wait(2);


        Driver.getDriver().quit();

    }


}
