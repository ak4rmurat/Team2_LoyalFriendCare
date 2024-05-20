package tests;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DepartmentsPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_004 {




@Test
public void TC_001 (){
    UserHomePage userHomePage = new UserHomePage();
    DepartmentsPage departmentsPage=new DepartmentsPage();
    DoctorsPage doctorsPage=new DoctorsPage();
    VaccinationsPage vaccinationsPage=new VaccinationsPage();
    Actions actions=new Actions(driver);
    SoftAssert softAssert=new SoftAssert();

    // 1 - Ziyaretci hedef Url ile Anasayfaya gider

    Driver.getDriver().get(ConfigReader.getProperty("url"));
    Assert.assertTrue(userHomePage.loyalFriendCareLogo.isEnabled());


    // 2 - footer bolumundeki "LOYALFRIENDCARE" yazisi ve arma, "Departments",
    //     "Follow Us" ve "Contacts" bolumleri goruntulenir

    actions.sendKeys(Keys.PAGE_DOWN).perform();
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    actions.sendKeys(Keys.PAGE_DOWN).perform();

    Assert.assertTrue(userHomePage.loyalFriendCareLogo.isEnabled());
    Assert.assertTrue(userHomePage.departmentsFooter.isEnabled());
    Assert.assertTrue(userHomePage.followUsFooter.isEnabled());
    Assert.assertTrue(userHomePage.contactsFooter.isEnabled());


    // 3 - "LOYALFRIENDCARE" yazisina tiklandiginda anasayfaya gider.

    userHomePage.loyalFriendCareLogo.click();
    Driver.getDriver().navigate().back();


    // 4 - "Departments" basligi altindaki Wellness, Dental Care, Anaesthesia, Dermatology, Diagnostics
    //      bolumlerine tiklanarak ilgili sayfalara gidildigi gorulur.

    userHomePage.wellnessFooter.click();
    Assert.assertTrue(departmentsPage.wellnessDepartmentText.isDisplayed());
    Driver.getDriver().navigate().back();


    userHomePage.dentalCareFooter.click();
    Assert.assertTrue(departmentsPage.dentalCareDepartmentText.isDisplayed());
    Driver.getDriver().navigate().back();


    userHomePage.anaesthesiaFooter.click();
    Assert.assertTrue(departmentsPage.anaesthesiaDepartmentText.isDisplayed());
    Driver.getDriver().navigate().back();


    userHomePage.dermatologyFooter.click();
    Assert.assertTrue(departmentsPage.dermatologyDepartmentText.isDisplayed());
    Driver.getDriver().navigate().back();


    userHomePage.diagnosticsFooter.click();
    Assert.assertTrue(departmentsPage.diagnosticDepartmentText.isDisplayed());
    Driver.getDriver().navigate().back();



    // 5 - "Follow Us" basligi altinda Facebook, X, Youtube, Pinterest, Instagram
    //      logolarinin oldugu ve ilgili sayfalara gidildigi gorulur.

    Assert.assertTrue(userHomePage.facebookLogo.isEnabled());
    userHomePage.facebookLogo.click();
    ReusableMethods.wait(2);
    Driver.getDriver().navigate().back();


    Assert.assertTrue(userHomePage.twitterLogo.isEnabled());
    userHomePage.twitterLogo.click();
    ReusableMethods.wait(2);
    Driver.getDriver().get(ConfigReader.getProperty("url"));


    Assert.assertTrue(userHomePage.youtubeLogo.isEnabled());
    userHomePage.youtubeLogo.click();
    ReusableMethods.wait(2);
    Driver.getDriver().navigate().back();


    Assert.assertTrue(userHomePage.pinteresLogo.isEnabled());
    userHomePage.pinteresLogo.click();
    ReusableMethods.wait(2);
    Driver.getDriver().navigate().back();


    Assert.assertTrue(userHomePage.instagramLogo.isEnabled());
    userHomePage.instagramLogo.click();
    ReusableMethods.wait(2);
    Driver.getDriver().navigate().back();


    // 6 - "Contacts" bolumunde adres, telefon ve mail adresleri bulunmalidir.

    Assert.assertTrue(userHomePage.adresFooter.isDisplayed());
    Assert.assertTrue(userHomePage.telefonFooter.isDisplayed());
    Assert.assertTrue(userHomePage.emailFooter.isDisplayed());



    Driver.quitDriver();


    }

}
