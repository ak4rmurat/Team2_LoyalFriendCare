package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_010 {

    UserHomePage userHomePage = new UserHomePage();

    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.quitDriver();
    }

    @Test
    public void TC_1001(){

        UserHomePage userHomePage = new UserHomePage();
        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //Acilan sayfada "E-Mail Address" ve "Password" bilgileri ile siteye giris yapar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Acilan ana sayfadaki body bolumundeki ogelerin gorunur ve tıklanabilir oldugunu test eder.
        Assert.assertTrue(userHomePage.welnessImage.isEnabled());
        Assert.assertTrue(userHomePage.drAlejandRoMartinesimage.isEnabled());

    }
}
