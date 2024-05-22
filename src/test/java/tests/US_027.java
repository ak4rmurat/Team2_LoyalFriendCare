package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_027 {
    UserHomePage userHomePage=new UserHomePage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();


    @Test
    public void TC_001(){
        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        Assert.assertTrue(userHomePage.signInButton.isEnabled());
        userHomePage.signInButton.click();

        //3-İlgili boxlara email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        Assert.assertTrue(ConfigReader.getProperty("adminDashboardUrl").contains("admin"));

       //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);


        //6-Acilan dasboardda Doctors yazisina tiklanir
        adminDashboardPage.doctorsButton.click();
        Assert.assertTrue(adminDashboardPage.doctorsButton.isDisplayed());
        //7-Alt menuden Doctors yazisina tiklanir
        Assert.assertTrue(adminDashboardPage.doctorsDoctorsButton.isDisplayed());
        adminDashboardPage.doctorsDoctorsButton.click();

        //8-Doktor sayisinin sayfanin altinda goruntulenir
        Assert.assertTrue(adminDashboardPage.doctorCountText.getText().contains("8"));


        //8-Edit butonu goruntulenir

        Assert.assertTrue(adminDashboardPage.doctorsTableEditText.isDisplayed());

        //9-Delete butonu goruntulenir
        Assert.assertTrue(adminDashboardPage.doctorsTableDeleteText.isDisplayed());

        //10- Headerdaki Add Doctors butonuna tiklanir
        adminDashboardPage.doctorsTableAddDoctorsButton.click();
        Assert.assertTrue(adminDashboardPage.newDoctorsText.getText().contains("Doctors"));
        Driver.getDriver().navigate().back();

        //11- Search Doctors searchboxina doktor ismi girerek arama yapilir
        adminDashboardPage.searchDoctorsTextbox.click();
        adminDashboardPage.searchDoctorsTextbox.sendKeys("Dr. Alejandro Martinez", Keys.ENTER);
        ReusableMethods.wait(5);
        Assert.assertTrue(adminDashboardPage.doctorsNameText.getText().equalsIgnoreCase("Dr. Alejandro Martinez"));

    }
}

