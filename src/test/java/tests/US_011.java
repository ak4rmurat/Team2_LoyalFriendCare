package tests;

import com.github.javafaker.Faker;
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

public class US_011 {


    @Test
    public void TC_1101(){

        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String emailAdress = faker.internet().emailAddress();
        String password = "Team2.13555";
        SoftAssert softAssert = new SoftAssert();
        Actions actions=new Actions(Driver.getDriver());



        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();



        // 3 - Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);




        // 4 - Anasayfanin goruntulendigini gorur ve Anasayfanin alt kisminda bulunan  footer bolumu bulunur.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(2);

        // 5 - "LOYALFRIENDCARE" yazisi ve arma, "Departments", "Follow Us" ve "Contacts" bolumleri goruntulenir.

        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());
        Assert.assertTrue(userHomePage.departmentsFooter.isDisplayed());
        Assert.assertTrue(userHomePage.followUsFooter.isDisplayed());
        Assert.assertTrue(userHomePage.contactsFooter.isDisplayed());


        // 6 - LOYALFRIENDCARE" yazisina tiklandiginda anasayfaya gider.

        userHomePage.loyalFriendCareLogo.click();
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isDisplayed());
        Driver.getDriver().navigate().back();



        // 7 - "Departments" basligi altındaki Wellness, Dental Care, Anaesthesia, Dermatology, Diagnostics
        //     bolumlerine tiklanarak ilgili sayfalara gidildigi gorulur.

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



        // 8 - "Follow Us" basligi altinda Facebook, X, Youtube, Pinterest, Instagram
        //     logolarinin oldugu ve ilgili sayfalara gidildigi gorulur

        Assert.assertTrue(userHomePage.facebookLogo.isDisplayed());
        userHomePage.facebookLogo.click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();


        Assert.assertTrue(userHomePage.twitterLogo.isDisplayed());
        userHomePage.twitterLogo.click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();


        Assert.assertTrue(userHomePage.youtubeLogo.isDisplayed());
        userHomePage.youtubeLogo.click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();


        Assert.assertTrue(userHomePage.pinteresLogo.isDisplayed());
        userHomePage.pinteresLogo.click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();


        Assert.assertTrue(userHomePage.instagramLogo.isDisplayed());
        userHomePage.instagramLogo.click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();



        // 9 - "Contacts" bolumunde adres, telefon ve mail adresleri bulunmalidir

        Assert.assertTrue(userHomePage.adresFooter.isDisplayed());
        Assert.assertTrue(userHomePage.telefonFooter.isDisplayed());
        Assert.assertTrue(userHomePage.emailFooter.isDisplayed());



        Driver.quitDriver();

    }


    @Test
    public void TC_1102(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String emailAdress = faker.internet().emailAddress();
        String password = "Team2.13555";
        SoftAssert softAssert = new SoftAssert();
        Actions actions=new Actions(Driver.getDriver());



        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();


        // 3 - Kayitli Kullanici Adi'ni dogru Password'unu yanlis girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys("123456");
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);


        // 4 - Sifrenin hatali girildigi mesajı goruntulenir.


        Driver.quitDriver();

    }

    @Test
    public void TC_1103(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String emailAdress = faker.internet().emailAddress();
        String password = "Team2.13555";
        SoftAssert softAssert = new SoftAssert();
        Actions actions=new Actions(Driver.getDriver());



        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());



        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();



        // 3 - Kayitli Kullanici Adi'ni yanlis Password'unu dogru girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys("a1b2c3d4e5@gmail.com");
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();


        // 4 - Kullanici Adi'nin hatali girildigi mesajı goruntulenir.

        Assert.assertTrue(userHomePage.hataliMailGirisi.isDisplayed());
        ReusableMethods.wait(2);



        Driver.quitDriver();

    }
}
