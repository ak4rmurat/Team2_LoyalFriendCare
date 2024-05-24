package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.AllPages;
import pages.UserHomePage;
import utilities.*;

public class US_007 extends TestBaseRapor {

   @Test()
   public void TC_001() {
       AllPages allPages = new AllPages();
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
       allPages.userHomePage.userNameKayitTextBox.sendKeys(name);
       allPages.userHomePage.emailAddressKayitTextBox.sendKeys(emailAdress);
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

    @Test(groups = "pozitive")
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();

        extentTest = extentReports.createTest("Login Testi",
                "Kullanici LoyalFriendCare Anasayfasına ulasip, giris yapabilmeli");
       // 1 - Ziyaretci hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.wait(2);
        extentTest.info("Kullanici LoyalFriendCare anasayfasina gider");
       // 2 - "Sign In" butonuna tiklar
        Assert.assertTrue(userHomePage.signInButton.isDisplayed());
        extentTest.pass("Kullanici anasayfadaki SignIn butonunu goruntuler ve tiklar");
        userHomePage.signInButton.click();

       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        ReusableMethods.wait(2);

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.wait(2);
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.wait(2);
        extentTest.info("Kullanici gecerli mail ve password bilgilerini girer");

       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        extentTest.info("Kullanici SignIn butonuna tiklar");
        ReusableMethods.wait(2);
       // 5 - Acilan sayfada bulunan "Sign out" butonuna tiklar.
        Assert.assertTrue(userHomePage.signOutButton.isDisplayed());
        extentTest.pass("Kullanici basarili bir sekilde giris yapar");
        ReusableMethods.wait(2);


    }



}
