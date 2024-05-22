package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DepartmentsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_016 extends TestBaseCross {



    @Test
    public void TC_1601(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa Body'sinde bulunan "Departments" linkine tiklar.
        userHomePage.greenDepartmentsLink.click();

        //"Departments of LoyalFriendCare" yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(departmentsPage.departmentsOfLoyalFriendCareLabel.isDisplayed());


    }

    @Test
    public void TC_1602(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa Body'sinde bulunan "Departments" linkine tiklar.
        userHomePage.greenDepartmentsLink.click();

        //Sayfanin body'sinde bulunan, listenen departmanlardan birine "Wellness" linkine tiklar

        departmentsPage.departmentsWellnessButton.click();

        //"Beds Departments" yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(departmentsPage.bedsDepartmentsText.isDisplayed());

        //  Sayfadaki "Welness Room" yazan resimli linke tiklanir
        departmentsPage.wellnesRoomImage.click();

        //Acilan sayfada "Wellness Room" yazisinin goruldugu dogrulanir
        Assert.assertTrue(departmentsPage.wellnessRoomText.isDisplayed());



    }

    @Test
    public void TC_1603(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa Body'sinde bulunan "Departments" linkine tiklar.
        userHomePage.greenDepartmentsLink.click();

        //Sayfanin body'sinde bulunan, listenen departmanlardan birine "Boarding" linkine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        departmentsPage.boardingText.click();


        //"Beds Departments" yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(departmentsPage.bedsDepartmentsText.isDisplayed());

        //Sayfadaki "Boarding Room" yazan resimli linke tiklanir
        departmentsPage.boardingRoomImage.click(); //Test failed. Bug verdi. Boarding Room yazan resimli link çıkmıyor


    }


    @Test
    public void TC_1604(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa Body'sinde bulunan "Departments" linkine tiklar.
        userHomePage.greenDepartmentsLink.click();

        //Sayfanin body'sinde bulunan, listenen departmanlardan birine "Pain Control" linkine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        departmentsPage.painControlText.click();


        //"Beds Departments" yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(departmentsPage.bedsDepartmentsText.isDisplayed());

        //Sayfadaki "Pain Control Room" yazan resimli linke tiklanir
        departmentsPage.painControlImage.click(); //Test failed. Bug verdi. Pain Control Room yazan resimli link çıkmıyor


    }

    @Test
    public void TC_1605(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli Kullanici hedef Url ile Anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Email Adresi ve Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        userHomePage.loginButton.click();

        //Anasayfa Body'sinde bulunan "Departments" linkine tiklar.
        userHomePage.greenDepartmentsLink.click();

        //Sayfanin body'sinde bulunan, listenen departmanlardan birine "Wellness" linkine tiklar

        departmentsPage.departmentsWellnessButton.click();

        //"Beds Departments" yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(departmentsPage.bedsDepartmentsText.isDisplayed());

        //  Sayfadaki "Welness Room" yazan resimli linke tiklanir
        departmentsPage.wellnesRoomImage.click();

        //Acilan sayfada "Wellness Room" yazisinin goruldugu dogrulanir
        Assert.assertTrue(departmentsPage.wellnessRoomText.isDisplayed());

        //Acilan sayfada Wellnes Room departmaninin yatakli bolumunun
        // ucretinin, sorumlu doktorunun ve departmana ait bilgilerin goruntulenebildigi dogrulanir
        Assert.assertTrue(departmentsPage.yatakliOdaUcretBilgiYazisi.isDisplayed());
        Assert.assertTrue(departmentsPage.yatakliOdaSorumluDoktorYazisi.isDisplayed());
        Assert.assertTrue(departmentsPage.yatakliOdaIlgiliDepartmanYazisi.isDisplayed());
        Assert.assertTrue(departmentsPage.yatakliOdaIlgiliIlacYazisi.isDisplayed());



    }


}
