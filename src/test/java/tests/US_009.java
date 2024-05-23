package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DoctorsPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_009 extends TestBaseCross {


    @Test
    public void TC_001(){
        UserHomePage userHomePage = new UserHomePage();

        // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();

       // 5 - Anasayfadaki header bolumunde bulunan  "Home", "About Us", "Departments", "Doctors", "Medicines" ve "Vaccinations" bolumlerini goruntuler

        Assert.assertTrue(userHomePage.doctorsDropDown.isDisplayed());
        Assert.assertTrue(userHomePage.homeButton.isDisplayed());
        Assert.assertTrue(userHomePage.medicinesDropDown.isDisplayed());



    }

    @Test
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sign In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
       // 5 - Anasayfadaki header bolumunden "Doctors"a tiklar
        userHomePage.doctorsDropDown.click();
       // 6 - Ekranda doktorlari goruntuler
        Assert.assertTrue(doctorsPage.doctorsIssabella.isDisplayed());
        Assert.assertTrue(doctorsPage.drSophiaKim.isDisplayed());


    }

    @Test
    public void TC_003(){
        UserHomePage userHomePage = new UserHomePage();
        VaccinationsPage vaccinationsPage = new VaccinationsPage();
        // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // 2 - "Sing In" butonuna tiklar

        userHomePage.signInButton.click();
        // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        // 5 - Anasayfadaki header bolumunden "Vaccinations"a tiklar
        userHomePage.vaccinationsDropDown.click();
        // 6 - Ekranda asilari goruntuler
        Assert.assertTrue(vaccinationsPage.rabbiesVaccineImage.isDisplayed());
        Assert.assertTrue(vaccinationsPage.felineImmunodeficiencyVaccineImage.isDisplayed());




    }
}
