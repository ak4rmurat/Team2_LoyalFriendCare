package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_036 {


    @Test
    public void TC_3601(){

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions=new Actions(driver);


        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();

        // 3 - Admin Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        // 4 - Anasayfanin goruntulendigini gorur ve Header bolumundeki Admin Kullanici Adi'nin
        //     oldugu butona tiklayarak Admin sayfasina ulasir.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());
        adminDashboardPage.adminLoginButton.click();

        // 5 - Sag ustte bulunan Kullanici resmine tiklar ve alt menude Settings, Edit Profile ve Logout ogelerini goruntuler.

        adminDashboardPage.adminResim.click();
        Assert.assertTrue(adminDashboardPage.adminSettings.isEnabled());
        Assert.assertTrue(adminDashboardPage.adminEditProfile.isEnabled());
        Assert.assertTrue(adminDashboardPage.adminLogout.isEnabled());


        // 6 - Settings tiklandiginda ilgili sayfaya gidildigi gorulur.

        adminDashboardPage.adminSettings.click();
        ReusableMethods.wait(2);
        //Assert.assertTrue(adminDashboardPage.welcomeSettingsText.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);



        // 7 - Edit Profile tiklandiginda ilgili sayfaya gidildigi gorulur.

        adminDashboardPage.adminResim.click();
        ReusableMethods.wait(1);
        adminDashboardPage.adminEditProfile.click();
        Assert.assertTrue(adminDashboardPage.editProfilePage.isEnabled());
        Driver.getDriver().navigate().back();


        // 8 - Logout tiklandiginda sistemden cikis yapildigi gorulur.
        adminDashboardPage.adminResim.click();
        ReusableMethods.wait(1);
        adminDashboardPage.adminLogout.click();
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());

        ReusableMethods.wait(2);
        Driver.quitDriver();

    }
}
