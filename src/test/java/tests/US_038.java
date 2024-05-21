package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_038 {

    UserHomePage userHomePage = new UserHomePage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();


    @Test
    public void TC_01() {

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Dashboad'daki kullanici resmine tiklar
        adminDashboardPage.adminKullaniciResmi.click();
        ReusableMethods.wait(1);

        //Acilan menuden "logout" yazisina tiklar
        adminDashboardPage.adminLogoutButonu.click();

        //Admin giris sayfasinda oldugu dogrulanir
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isDisplayed());



    }


}
