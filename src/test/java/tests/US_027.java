package tests;

import com.beust.ah.A;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.*;

import java.util.List;

public class US_027 extends TestBaseRapor {
    UserHomePage userHomePage=new UserHomePage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();


    @Test
    public void TC_001(){
        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        Assert.assertTrue(userHomePage.signInButton.isEnabled());
        userHomePage.signInButton.click();

        //3-İlgili boxlara email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        Assert.assertTrue(ConfigReader.getProperty("adminDashboardUrl").contains("admin"));

       //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);


        //6-Acilan dasboardda Doctors yazisina tiklanir
        adminDashboardPage.doctorsButton.click();
        Assert.assertTrue(adminDashboardPage.doctorsButton.isDisplayed());
        //7-Alt menuden Doctors yazisina tiklanir
        Assert.assertTrue(adminDashboardPage.doctorsDoctorsButton.isDisplayed());
        adminDashboardPage.doctorsDoctorsButton.click();

        //8-Doktor sayisinin sayfanin altinda goruntulenir
        Assert.assertTrue(adminDashboardPage.doctorCountText.getText().contains("8"));


        //8-Edit butonu goruntulenir

        Assert.assertTrue(adminDashboardPage.doctorsTableEditText.isDisplayed());

        //9-Delete butonu goruntulenir
        Assert.assertTrue(adminDashboardPage.doctorsTableDeleteText.isDisplayed());

        //10- Headerdaki Add Doctors butonuna tiklanir
        adminDashboardPage.doctorsTableAddDoctorsButton.click();
        Assert.assertTrue(adminDashboardPage.newDoctorsText.getText().contains("Doctors"));
        Driver.getDriver().navigate().back();

        //11- Search Doctors searchboxina doktor ismi girerek arama yapilir
        adminDashboardPage.searchDoctorsTextbox.click();
        adminDashboardPage.searchDoctorsTextbox.sendKeys("Dr. Alejandro Martinez", Keys.ENTER);
        ReusableMethods.wait(5);
        Assert.assertTrue(adminDashboardPage.doctorsNameText.getText().equalsIgnoreCase("Dr. Alejandro Martinez"));

        adminDashboardPage.loyalFriendCareFooterLink.click();
        userHomePage.signOutButton.click();

    }
    @Test
    public void TC_002(){
        extentTest = extentReports.createTest("Login Testi",
                "Kullanici LoyalFriendCare Anasayfasına ulasip, giris yapabilmeli");
        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici LoyalFriendCare anasayfaya gider");
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        Assert.assertTrue(userHomePage.signInButton.isEnabled());
        userHomePage.signInButton.click();

        //3-İlgili boxlara email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        Assert.assertTrue(ConfigReader.getProperty("adminDashboardUrl").contains("admin"));

        //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);


        //6-Acilan dasboardda Doctors yazisina tiklanir
        adminDashboardPage.doctorsButton.click();
        Assert.assertTrue(adminDashboardPage.doctorsButton.isDisplayed());

        //7-Alt menuden Create Doctors yazisina tiklanir
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.createDoctorsButton.isDisplayed());
        adminDashboardPage.createDoctorsButton.click();

        //8-Doctors Title boxina geçerli doktor adı girilir
        adminDashboardPage.doctorsTitleTextBox.sendKeys("Dr.Philip Almanec");

        //9-Doctors contente boxina gecerli aciklama girilir
        adminDashboardPage.doctorsContentEnglishTextBox.sendKeys("Profession: Veterinarian\n" +
                "Years of Experience: 8 years\n" +
                "Specialization: Feline Medicine\n" +
                "Message:Cats hold a special place in my heart. Providing them with compassionate care and expertise is my priority.");
        ReusableMethods.wait(2);

        //10- Doctors save butonuna tiklanir
        adminDashboardPage.doctorsSaveeButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.doctorsStoreSuccessfullyAlert.isDisplayed());
        extentTest.pass("Admin gecersiz bilgilerle doktor olusturamamli");

        adminDashboardPage.loyalFriendCareFooterLink.click();
        userHomePage.signOutButton.click();

    }
    @Test(groups = "negative")
    public void TC_003_Bilgi__Girisi_Yapmadan_Create_Doctor_Testi(){
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        extentTest = extentReports.createTest("Doktor testi",
                "Admin gecersiz bilgiler ile Doktor olusturamamali");
        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Admin LoyalFriendCare anasayfaya gider");
        ReusableMethods.wait(2);



        //2-Header bolumundeki Sign in butonuna tıklar

        userHomePage.signInButton.click();
        extentTest.info("Admin SignIn butonune tiklar");
        ReusableMethods.wait(2);

        //3-İlgili boxlara email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        ReusableMethods.wait(2);
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.wait(2);
        extentTest.info("Admin gecerli mail ve password bilgilerini girer");
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());
        extentTest.pass("Admin SignIn butonunu goruntuler ve tiklar");
        userHomePage.loginButton.click();

        ReusableMethods.wait(2);



        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        ReusableMethods.wait(3);
        extentTest.info("Admin Dashboard login butonuna tiklar");




        //5-Sayfanın soluna hover yapilir

        Assert.assertTrue(adminDashboardPage.dashBoardMenu.isDisplayed());
        extentTest.pass("Admin dashboard menuyu goruntuler ve menuye gecer");
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(3);



        //6-Acilan dasboardda Doctors yazisina tiklanir
        adminDashboardPage.doctorsButton.click();
        ReusableMethods.wait(2);
        extentTest.info("Admin Doctors butonuna tiklar");


        //7-Alt menuden Create Doctors yazisina tiklanir


        adminDashboardPage.createDoctorsButton.click();
        ReusableMethods.wait(4);
        extentTest.info("Admin Create Doctors butonuna tiklar");

        //8-Doctors Title boxina gecersiz doktor adı girilir


        //9-Doctors contente boxina gecersiz aciklama girilir


        //10- Doctors save butonuna tiklanir
        adminDashboardPage.doctorsSaveeButton.click();
        extentTest.info("Admin bilgi girisi yapmadan Save Button'a tiklar");
        ReusableMethods.wait(5);
        Assert.assertTrue(adminDashboardPage.doctorsTitleTextBox.isDisplayed());
        extentTest.pass("Admin gecersiz bilgilerle doktor olusturamamali");
        ReusableMethods.wait(2);



}
}

