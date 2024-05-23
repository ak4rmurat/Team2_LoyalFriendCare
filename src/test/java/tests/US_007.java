package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.*;

public class US_007 extends TestBaseRapor {


   @Test(groups = "smoke")
   public void TC_001() {
       extentTest = extentReports.createTest("Login Testi",
               "Kullanici LoyalFriendCare Anasayfasına ulasip, giris yapabilmeli");
       // 1 - Ziyaretci hedef URL'e gider
       Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest.info("Kullanici LoyalFriendCare anasayfaya gider");
       Faker faker = new Faker();
       String name = faker.name().firstName();
       String emailAdress = faker.internet().emailAddress();
       String password = "Team2.13555";

       UserHomePage userHomePage = new UserHomePage();
       // 2 - "Sign Up" butonuna tiklar
       userHomePage.signUpButton.click();
       extentTest.info("Kullanici SignUp butonunu goruntuler ve butonu tiklar.");


       // 3 - "Name"," E-Mail Address", "Password" ve "Confirm Password" bolumlerine kriterlere uygun bilgileri girer
       userHomePage.userNameKayitTextBox.sendKeys(name);
       userHomePage.emailAddressKayitTextBox.sendKeys(emailAdress);
       userHomePage.newpasswordKayitTextBox.sendKeys(password);
       userHomePage.passwordConfirmKayitTextBox.sendKeys(password);
       extentTest.info("Kullanici Name, E-Mail Adress, Password ve Confirm Password textboxlari goruntuler ve bilgileri girer");

       // 4 - "Sign Up" butonuna tiklar
       userHomePage.signUpKayitButton.click();
       extentTest.info("Kullanici SıgnUp butonunu goruntuler ve tiklar");

       // 5 - Anasayfada "Sign Out" butonu goruntuler
       Assert.assertTrue(userHomePage.signOutButton.isDisplayed());
       extentTest.pass("Kullanici giris yaptigini goruntuler.");


   }

    @Test
    public void TC_002(){

       // 1 - Ziyaretci hedef URL'e gider
        Driver.getDriver().get("https://qa.loyalfriendcare.com/en/login");
       // 2 - "Sign In" butonuna tiklar


       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        ReusableMethods.wait(3);
        UserHomePage userHomePage = new UserHomePage();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.wait(2);
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);
       // 5 - Acilan sayfada bulunan "Sign out" butonuna tiklar.
        userHomePage.signOutButton.click();
        Driver.driver.navigate().refresh();


    }



}
