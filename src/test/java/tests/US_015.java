package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppointmentBookingPage;
import pages.DepartmentsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_015 extends TestBaseCross {

    @Test
    public void TC_001(){
        UserHomePage userHomePage=new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        AppointmentBookingPage appointmentBookingPage=new AppointmentBookingPage();
        Actions actions=new Actions(Driver.getDriver());

        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        userHomePage.signInButton.click();

        //3-İlgili boxlara gecerli email adres ve sifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //4-Header departments a tıklar
        userHomePage.departmentsDropDown.click();

        //5-DentalCare Departmant a  tiklar
        departmentsPage.dentalCareImage.click();
        Assert.assertTrue(appointmentBookingPage.dateTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.phoneNumberTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.createTextBoxMessage.isEnabled());
        Assert.assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());

        //6-Appointment Booking tarih kismindan gecerli tarih secilir
        appointmentBookingPage.dateTextBox.sendKeys("31.08.2024");

        //7-Phone number kutusuna gecerli tel no girilir
        appointmentBookingPage.phoneNumberTextBox.sendKeys("05431111111");
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //8-Departmants dropdown menusunden ilgili departman secilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //9-Doctor dropdown menusunden doktor secilir
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //10-Appoinment Booking butonuna tıklanır,
        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertTrue(appointmentBookingPage.appointmentBookingText.isDisplayed());
        userHomePage.loyalFriendCareHeaderLogo.click();
        userHomePage.signOutButton.click();
    }
    @Test
    public void TC_002(){
        UserHomePage userHomePage=new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        AppointmentBookingPage appointmentBookingPage=new AppointmentBookingPage();
        Actions actions=new Actions(Driver.getDriver());

        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        userHomePage.signInButton.click();

        //3-İlgili boxlara gecerli email adres ve sifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //4-Header departments a tıklar
        userHomePage.departmentsDropDown.click();

        //5-DentalCare Departmant a  tiklar
        departmentsPage.dentalCareImage.click();
        Assert.assertTrue(appointmentBookingPage.dateTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.phoneNumberTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.createTextBoxMessage.isEnabled());
        Assert.assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());

        //6-Appointment Booking tarih kismindan gecersiz(gecmis) tarih secilir
        appointmentBookingPage.dateTextBox.sendKeys("31.08.2021");

        //7-Phone number kutusuna gecersiz tel no girilir
        appointmentBookingPage.phoneNumberTextBox.sendKeys("fgfg");
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //8-Departmants dropdown menusunden ilgili departman secilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //9-Doctor dropdown menusunden doktor secilir
        actions.sendKeys(Keys.SHIFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //10-Appoinment Booking butonuna tıklanır,
        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertFalse(appointmentBookingPage.appointmentBookingText.isDisplayed());
        userHomePage.loyalFriendCareHeaderLogo.click();
        userHomePage.signOutButton.click();
    }
    @Test
    public void TC_003(){
        UserHomePage userHomePage=new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        AppointmentBookingPage appointmentBookingPage=new AppointmentBookingPage();
        Actions actions=new Actions(Driver.getDriver());

        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        userHomePage.signInButton.click();

        //3-İlgili boxlara gecerli email adres ve sifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //4-Header departments a tıklar
        userHomePage.departmentsDropDown.click();

        //5-DentalCare Departmant a  tiklar
        departmentsPage.dentalCareImage.click();
        Assert.assertTrue(appointmentBookingPage.dateTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.phoneNumberTextBox.isDisplayed());
        Assert.assertTrue(appointmentBookingPage.createTextBoxMessage.isEnabled());
        Assert.assertTrue(appointmentBookingPage.appointmenbookingButon.isEnabled());


        //10-Appoinment Booking butonuna tıklanır,
        appointmentBookingPage.appointmenbookingButon.click();
        Assert.assertFalse(appointmentBookingPage.appointmentBookingText.isDisplayed());
        userHomePage.loyalFriendCareHeaderLogo.click();
        userHomePage.signOutButton.click();
}
    }