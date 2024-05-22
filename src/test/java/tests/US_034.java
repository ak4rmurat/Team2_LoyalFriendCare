package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_034 {

    @Test
    public void TC_3301(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
       // 4 - Sol acilir menude "Settings"i goruntuler
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboardPage.settingsButton.isDisplayed());

        Driver.quitDriver();

    }

    @Test
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
      //  1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
      //  2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
      //  3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
      //  4 - Sol acilir menude "Settings" e tiklar
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);
        adminDashboardPage.settingsButton.click();
        ReusableMethods.wait(1);
      //  5 - Acilan sayfada var olan ayarlari goruntuler
        Assert.assertTrue(adminDashboardPage.youtubeSettingsInfo.isDisplayed());

        Driver.quitDriver();
    }
}
