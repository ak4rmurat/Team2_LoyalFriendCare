package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.ResourceBundle;

public class US_030 {


    @Test
    public void TC3001(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());


        //Kullanıcı hedef Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Anasayfa goruntulenir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sign In butonu goruntulenir.
        Assert.assertTrue(userHomePage.signInButton.isEnabled());

        //Sign In butonu tıklanir.
        userHomePage.signInButton.click();


        //Acılan sayfa'da Email Adress,Password ve Sıgn ın butonları goruntulenir
        Assert.assertTrue(userHomePage.emailTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());


        //Adminden istenilen bilgileri dogru bir sekilde girer ve Sign In butonuna tıklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();



        //admin sayfasına gecis yapar
        adminDashboardPage.adminLoginButton.click();

        //dashboard sayfasi goruntulenir
        adminDashboardPage.admindasboard.isDisplayed();


        //Sayfa'nın sol tarafında bulunan dashboard ögeleri goruntulenir
        actions.moveToElement(adminDashboardPage.admindasboard).perform();

        //Dashboard menusu altında Pets adsense ve alt menuler goruntulenir
        adminDashboardPage.petsButton.isDisplayed();

       Driver.quitDriver();


    }
    @Test
    public void TC3002(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());


        //Kullanıcı hedef Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Anasayfa goruntulenir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sign In butonu goruntulenir.
        Assert.assertTrue(userHomePage.signInButton.isEnabled());

        //Sign In butonu tıklanir.
        userHomePage.signInButton.click();


        //Acılan sayfa'da Email Adress,Password ve Sıgn ın butonları goruntulenir
        Assert.assertTrue(userHomePage.emailTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());


        //Adminden istenilen bilgileri dogru bir sekilde girer ve Sign In butonuna tıklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();



        //admin sayfasına gecis yapar
        adminDashboardPage.adminLoginButton.click();

        //dashboard sayfasi goruntulenir
        adminDashboardPage.admindasboard.isDisplayed();


        //Sayfa'nın sol tarafında bulunan dashboard ögeleri goruntulenir
        actions.moveToElement(adminDashboardPage.admindasboard).perform();

        //Dashboard menusu altında Pets adsense ve alt menuler goruntulenir
        adminDashboardPage.petsButton.isDisplayed();

        //Dashboard menusu altında Pets adsense menusune tıklanır
        adminDashboardPage.petsButton.click();


         //Pets Adsense menusu altında iki tane secenek goruntulenir
        adminDashboardPage.petManagerPetsButton.isDisplayed();
        adminDashboardPage.createPetsManagersButton.isDisplayed();


      Driver.quitDriver();
    }

    @Test
    public void TC3003(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());


        //Kullanıcı hedef Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Anasayfa goruntulenir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sign In butonu goruntulenir.
       // Assert.assertTrue(userHomePage.signInButton.isEnabled());

        //Sign In butonu tıklanir.
        userHomePage.signInButton.click();


        //Acılan sayfa'da Email Adress,Password ve Sıgn ın butonları goruntulenir
        Assert.assertTrue(userHomePage.emailTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());


        //Adminden istenilen bilgileri dogru bir sekilde girer ve Sign In butonuna tıklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();



        //admin sayfasına gecis yapar
        adminDashboardPage.adminLoginButton.click();

        //dashboard sayfasi goruntulenir
        adminDashboardPage.admindasboard.isDisplayed();


        //Sayfa'nın sol tarafında bulunan dashboard ögeleri goruntulenir
        actions.moveToElement(adminDashboardPage.admindasboard).perform();

        //Dashboard menusu altında Pets adsense ve alt menuler goruntulenir
        adminDashboardPage.petsButton.isDisplayed();

        //Dashboard menusu altında Pets adsense menusune tıklanır
        adminDashboardPage.petsButton.click();


        //Pets Adsense menusu altında iki tane secenek goruntulenir
        adminDashboardPage.petManagerPetsButton.isDisplayed();
        adminDashboardPage.createPetsManagersButton.isDisplayed();


        //Pets adsense menusune tıklanır
        adminDashboardPage.petManagerPetsButton.click();

        ReusableMethods.wait(3);

        actions.moveToElement(adminDashboardPage.admindasboard).perform();


        ReusableMethods.wait(2);

        adminDashboardPage.petsButton.click();

        //Create adsense butonuna tıklanır
        adminDashboardPage.createPetsManagersButton.click();

    //Acılan sayfada Location,Pets Tıtle,Your Dısplay Name,Image,AdSense secenekleri goruntulenir
        actions.sendKeys(adminDashboardPage.createPetsHome).click()
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Lui")
                .sendKeys(Keys.TAB)
                .sendKeys("Noname").perform();

        adminDashboardPage.ActivePets.click();


        adminDashboardPage.createPetsType.click();

        ReusableMethods.wait(2);

        adminDashboardPage.createPetsImage.click();

        adminDashboardPage.createPetsImageEkle.click();

        actions.sendKeys(Keys.TAB).sendKeys("https://www.google.com/save/list/0Kv1-3opkyBPdebm27AYJS2234yWmw?hl=tr").perform();

        adminDashboardPage.createPetsSaveButton.click();

        actions.moveToElement(adminDashboardPage.admindasboard).perform();


        ReusableMethods.wait(2);

        adminDashboardPage.petsButton.click();


        adminDashboardPage.createPetsImageDelete.click();

        adminDashboardPage.adminButonu.click();

        adminDashboardPage.adminLogoutButonu.click();

        userHomePage.signOutButton.click();


        ReusableMethods.wait(4);

        Driver.quitDriver();













    }
}
