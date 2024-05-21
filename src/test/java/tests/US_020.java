package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_020 {

    UserHomePage userHomePage = new UserHomePage();

    @Test
    public void TC_01(){

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa'nin goruntulendiği dogrulanır
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isDisplayed());

        //Kayitli kullanici URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girmeyi dener
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Admin sayfasina giremedigi ve hata kodu " USER DOES NOT HAVE THE RIGHT ROLES." ile karsilastigi dogrulanir
        userHomePage.adminOlmayanKullaniciUyarisi.isDisplayed();

        Driver.quitDriver();








    }
}
