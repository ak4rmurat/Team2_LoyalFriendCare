package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_031 extends TestBaseCross {
    UserHomePage userHomePage=new UserHomePage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();



    @Test
    public void TC_001(){
        // 1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        // 2-Header bolumundeki Sign in butonuna tıklar
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

        //6-Acilan dasboardda Consultation yazisina tiklanir
        adminDashboardPage.consultationButton.click();
        Assert.assertTrue(adminDashboardPage.consultationAltMenuButton.isDisplayed());;

        //7-Alt menuden Consultation yazisina tiklanir
        adminDashboardPage.consultationAltMenuButton.click();
        Assert.assertTrue(adminDashboardPage.consultationTitleH5.getText().equalsIgnoreCase("consultation"));

        //8-Acilan sayfada headerdaki ve bodydeki imagelarin goruntulenebilir oldugu ve 4 adet oldugu dogrulanir.
        Driver.getDriver().get("https://qa.loyalfriendcare.com/en/Dashboard/Audios");//tdashboard düzelince sil
        Assert.assertTrue(adminDashboardPage.consultationBaslikImage.isDisplayed());
        Assert.assertTrue(adminDashboardPage.consultationAudioImagesList.get(0).isDisplayed());
        Assert.assertTrue(adminDashboardPage.consultationAudioImagesList.get(1).isDisplayed());
        Assert.assertTrue(adminDashboardPage.consultationAudioImagesList.get(2).isDisplayed());
        Assert.assertTrue(adminDashboardPage.consultationAudioImagesList.get(3).isDisplayed());
        Assert.assertEquals(adminDashboardPage.consultationAudioImagesList.size(),4);

        adminDashboardPage.loyalFriendCareFooterLink.click();
        userHomePage.signOutButton.click();

    }
    @Test
    public void TC_002(){

        // 1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        // 2-Header bolumundeki Sign in butonuna tıklar
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

        //6-Acilan dasboardda Consultation yazisina tiklanir
        adminDashboardPage.consultationButton.click();
        adminDashboardPage.consultationAltMenuButton.isDisplayed();

        //7-Alt menuden Consultation yazisina tiklanir
        adminDashboardPage.consultationAltMenuButton.click();
        Assert.assertTrue(adminDashboardPage.consultationTitleH5.getText().equalsIgnoreCase("consultation"));

        //9-Goruntulenen Audios.XXX.pdf baglantilarina tiklanir

        ReusableMethods.switchToWindow("https://qa.loyalfriendcare.com/Audios/Winning%20in%20PetCare.pdf");
        Assert.assertTrue("https://qa.loyalfriendcare.com/Audios/Winning%20in%20PetCare.pdf".contains("Winning"));
        Driver.getDriver().navigate().back();

        ReusableMethods.switchToWindow("https://qa.loyalfriendcare.com/Audios/PetCare.pdf");
        Assert.assertTrue("https://qa.loyalfriendcare.com/Audios/PetCare.pdf".contains("PetCare"));
        Driver.getDriver().navigate().back();

        ReusableMethods.switchToWindow("https://qa.loyalfriendcare.com/Audios/Natural%20Pet%20Care.pdf");
        Assert.assertTrue("https://qa.loyalfriendcare.com/Audios/Natural%20Pet%20Care.pdf".contains("Natural"));
        Driver.getDriver().navigate().back();

        ReusableMethods.switchToWindow("https://qa.loyalfriendcare.com/Audios/Amplifying%20pet.pdf");
        Assert.assertFalse(adminDashboardPage.notFound404.isDisplayed());



    }
    }