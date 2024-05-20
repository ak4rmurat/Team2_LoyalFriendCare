package tests;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_017 {


    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.quitDriver();
    }

    @Test
    public void TC_1701(){

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //Acilan sayfada "E-Mail Address" ve "Password" bilgileri ile siteye giris yapar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Acilan sayfadaki header bolumundeki "Doctors" 'a tiklar.
        userHomePage.doctorsDropDown.click();

        //Doktors sayfasina erisebildigini test eder.
        Assert.assertTrue(doctorsPage.doctorsOfLoyalFriendCareText.isDisplayed());

        //Sayfadaki her bir doktorun tiklanabilir ve sayfasina gidilebildigini test eder.
        Assert.assertTrue(doctorsPage.doctorMarcusImage.isEnabled());
    }

    @Test
    public void TC_1702(){

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar , acilan sayfada "E-Mail Address" ve "Password" bilgileri ile siteye giris yapar.
        userHomePage.signInButton.click();
        actions.sendKeys(ConfigReader.getProperty("userMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("userPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //Acilan sayfadaki header bolumundeki "Doctors" 'a tiklar.
        userHomePage.doctorsDropDown.click();

        //Doktorlar sayfasindan secilen doktora tiklar.
        doctorsPage.doctorsIssabella.click();

        //Acilan sayfada "Appointment Booking " yazisinin goruntulendigi dogrulanir.
        Assert.assertTrue(appointmentBookingPage.appointmenBookingText.isDisplayed());

        //Kullanici sayfada "Randevu Tarihini" secer, "Phone" kutusuna telefon numarasi ekler,
        //ilgili "Departmanini" ve "Doktoru" secer ve "Create Message" bolumune mesajini yazar sonra Appointment Booking" e tiklar.
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

        actions.sendKeys(Keys.TAB)
                .sendKeys("Thank You").perform();

        appointmentBookingPage.appointmenbookingButon.click();

        ReusableMethods.wait(2);

        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.
        Assert.assertTrue(appointmentBookingPage.appointmenBookingTextSuccessText.isDisplayed());

    }

    @Test
    public void TC_1704(){

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar , acilan sayfada "E-Mail Address" ve "Password" bilgileri ile siteye giris yapar.
        userHomePage.signInButton.click();
        actions.sendKeys(ConfigReader.getProperty("userMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("userPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //Acilan sayfadaki header bolumundeki "Doctors" 'a tiklar.
        userHomePage.doctorsDropDown.click();

        //Doktorlar sayfasindan istelinen doktora tiklar.
        doctorsPage.drSophiaKim.click();

        //"Leave a Review" yazisinin goruldugu dogrulanir.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
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

}
