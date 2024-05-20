package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005 {


   SoftAssert softAssert=new SoftAssert();
   UserHomePage userHomePage=new UserHomePage();
   Faker faker = new Faker();
    String name = faker.name().firstName();
    String emailAdress = faker.internet().emailAddress();
    String password = "Team2.Damra";



    @Test
    public void TC0501(){


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actual=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(expectedUrl,actual,"Anasayfa goruntulenir");


       softAssert.assertTrue(userHomePage.signUpButton.isEnabled());

       userHomePage.signUpButton.click();



    }


    @Test
    public void TC0502(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        userHomePage.signUpButton.click();

        String expectedUrl="https://qa.loyalfriendcare.com/en/register";
        String actual=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(expectedUrl,actual);


        userHomePage.userNameKayitTextBox.sendKeys(name);
        userHomePage.emailAddressKayitTextBox.sendKeys(emailAdress);
        userHomePage.newpasswordKayitTextBox.sendKeys(password);
        userHomePage.passwordConfirmKayitTextBox.sendKeys(password);


        userHomePage.signUpKayitButton.click();


        softAssert.assertTrue(userHomePage.signOutButton.isEnabled());

        userHomePage.signOutButton.click();






         Driver.closeDriver();

    }
}
