package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_008 {
    UserHomePage userHomePage = new UserHomePage();

    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }

    @Test
    public void TC_0801(){

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Ana sayfada header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //Sifresini unutan kullanici "Forgot Password" a tiklar.
        userHomePage.forgotPasswordButton.click();

        //Acilan Reset Password sayfasinda, kayıtli "E-Mail Address" girilir ve "Send Password Reset Link " butonuna tıklanir.
        userHomePage.emailTexBoxForget.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.sendPasswordResetLink.click();

        //"We have e-mailed your password reset link!" goruntulenebilir oldugunu test eder.
        Assert.assertTrue(userHomePage.resetPasswordSuccess.isDisplayed());

        ReusableMethods.wait(2);
        Driver.quitDriver();

    }
}