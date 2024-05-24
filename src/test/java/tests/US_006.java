package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage;
import utilities.*;

public class US_006 extends TestBaseCross {

    @Test
    public void TC0601(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();



        ////Ziyaretci  ilgili Url gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Ana sayfanın goruntulenebilir oldugu dogrulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actual=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(expectedUrl,actual,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sıgn Up butonu goruntulenir.
        softAssert.assertTrue(userHomePage.signUpButton.isEnabled());



    }

    @Test()
    public void TC0602(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();



        //Ziyaretci  ilgili Url gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Ana sayfanın goruntulenebilir oldugu dogrulanir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actual=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(expectedUrl,actual,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sıgn Up butonu goruntulenir.
        softAssert.assertTrue(userHomePage.signUpButton.isEnabled());

        //Sign In butonuna tıklanır
         userHomePage.signInButton.click();

         //uye giris sayfası goruntulenir
        String expectedSignUpUrl="https://qa.loyalfriendcare.com/en/login";
        String actualSignUpUrl=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(expectedSignUpUrl,actualSignUpUrl,"Sign In sayfası goruntulenir");

          //EmailTextBox goruntulenebilir
        softAssert.assertTrue(userHomePage.emailTextBox.isDisplayed());

        //PasswordTextBox goruntulenebilir
        softAssert.assertTrue(userHomePage.passwordTextBox.isDisplayed());


       // " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));


        //Sign In butonuna tıklanir
        userHomePage.loginButton.click();

        //Basarılı bir sekilde giris yapıldgı kontrol edilir ve cıkıs yapılır
        userHomePage.signOutButton.click();



        ReusableMethods.wait(3);



    }
}
