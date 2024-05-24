package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DoctorsPage;
import pages.MedicinesPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.*;

public class US_009 extends TestBaseRapor {


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

    @Test(groups = "pozitive")
    public void TC_002(){
        extentTest = extentReports.createTest("Goruntuleme Testi",
                "Kullanici LoyalFriendCare Anasayfasinin header bolumundeki bolumleri goruntuleyebilmeli ve tiklayabilmeli");
        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        MedicinesPage medicinesPage = new MedicinesPage();
        VaccinationsPage vaccinationsPage = new VaccinationsPage();
        Actions actions = new Actions(Driver.getDriver());
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanici LoyalFriendCare anasayfasine gider");
        ReusableMethods.wait(1);

       // 2 - "Sing In" butonuna tiklar
        userHomePage.signInButton.click();
        ReusableMethods.wait(2);
        extentTest.info("Kullanici SignIn butonuna tiklar");
       // 3 - " Sign In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.wait(2);
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.wait(2);
        extentTest.info("Kullanici gecerli mail ve password bilgilerini girer");
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        extentTest.info("Kullanici SignIn butonuna tiklar");
       // 5 - Anasayfadaki header bolumunden "Doctors"a tiklar
        ReusableMethods.wait(4);
        userHomePage.doctorsDropDown.click();
        extentTest.info("Kullanici anasayfada header bolumundeki Doctors'a tiklar");
        ReusableMethods.wait(2);
       // 6 - Ekranda doktorlari goruntuler

        Assert.assertTrue(doctorsPage.drSophiaKim.isDisplayed());
        extentTest.pass("Kullanici Doctorlari goruntuler");
        actions.moveToElement(doctorsPage.drSophiaKim).perform();
        ReusableMethods.wait(2);
        Driver.driver.navigate().back();
        extentTest.info("Kullanici bir onceki sayfaya gider");
        ReusableMethods.wait(4);
        userHomePage.medicinesDropDown.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(medicinesPage.revolutionlMedicineImage.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Kullanici Medicine'leri goruntuler");
        Driver.driver.navigate().back();
        ReusableMethods.wait(4);
        userHomePage.vaccinationsDropDown.click();
        ReusableMethods.wait(2);
        actions.moveToElement(vaccinationsPage.felineHerpesvirusVaccineImage);
        extentTest.info("Kullanici bir onceki sayfaya gider");
        ReusableMethods.wait(2);
        Assert.assertTrue(vaccinationsPage.rabbiesVaccineImage.isDisplayed());
        extentTest.pass("Kullanici Vaccine'leri goruntuler");
        ReusableMethods.wait(2);


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
