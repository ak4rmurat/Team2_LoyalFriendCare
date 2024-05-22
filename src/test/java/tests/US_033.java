package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;

public class US_033 {


    @Test
    public void TC_3301() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Admin dashboarda ulastigi "Dashboard Admin" yazisi ile dogrulanir
        Assert.assertTrue(adminDashboardPage.dashboardAdminText.isDisplayed());

        //Sol acilir menuye yaklasip "Vaccinations" menusunun gorunur oldugu dogrulanir
        adminDashboardPage.dashBoardMenu.click();
        Assert.assertTrue(adminDashboardPage.vaccinationsButton.isDisplayed());

        //Sol acilir menuden "Vaccinations" menusunun yanindaki oka tiklanarak alt menusunun gorunur oldugu dogrulanir ve alt menu tiklanir
        adminDashboardPage.vaccinationsAltMenuArrow.click(); // failed. bug var. vaccinations menusunun yaninda alt menuleri acacak ok yok. alt menuler yok

        Driver.quitDriver();

    }

    @Test
    public void TC_3302() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        //Asi sayisi ve asilarin goruntulendigi dogrulanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(adminDashboardPage.asiSayisiYazisi.isDisplayed());

        Driver.quitDriver();

        /*

        String asiSayisiYazisi =adminDashboardPage.asiSayisiYazisi.getText(); //Showing 1 to 8 of 8 entries
        asiSayisiYazisi = asiSayisiYazisi.substring(12,15);
        asiSayisiYazisi = asiSayisiYazisi.replaceAll("\\D","");
        int asiSayisi= Integer.parseInt(asiSayisiYazisi);
        System.out.println(asiSayisi + " adet asi listelenmektedir.");

         */

    }


    @Test
    public void TC_3303() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        //"Add Vaccinations" butonu tiklanir
        adminDashboardPage.addVaccinationsButton.click();

        //"PETS TITLE" textbox'ina yeni asinin adi "denemeasisi" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.sendKeys("denemeasisi")
                .sendKeys(Keys.TAB)
                .sendKeys("deneme")
                .sendKeys(Keys.TAB)
                .sendKeys("100")
                .perform();

        adminDashboardPage.addVaccinationSaveButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Eklenen yeni asi "denemeasisi"nin listede gorundugu dogrulanir
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase("denemeasisi")){
                asiVarmi = true;
            }

        }
        Assert.assertTrue(asiVarmi);

        Driver.quitDriver();

    }
    @Test
    public void TC_3304() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        //Duzeltme yapmak istedigi asinin "denemeasisi" nin yanindaki "Edit" butonuna tiklar
        adminDashboardPage.asiEditButton.click();

        //"PETS TITLE" textbox'ina yeni asinin adi "denemeasisi1" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.doubleClick().doubleClick(adminDashboardPage.addVaccinationTitleTextBox).perform();
        actions.sendKeys("denemeasisi1")
                .sendKeys(Keys.TAB)
                .sendKeys("deneme1")
                .sendKeys(Keys.TAB)
                .sendKeys("200")
                .perform();

        //"Dont Change Image" radyo butonuna tiklar
        adminDashboardPage.dontChangeImageRadyoButton.click();

        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();

        //Duzenlenen asinin "denemeasisi1"in listede gorundugu dogrulanir
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase("denemeasisi1")){
                asiVarmi = true;
            }

        }
        Assert.assertTrue(asiVarmi);

        Driver.quitDriver();


    }

    @Test
    public void TC_3305() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        //Duzeltme yapmak istedigi asinin "denemeasisi" nin yanindaki "Delete" butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        adminDashboardPage.asiDeleteButton.click();

        //Silmis oldugu asinin asi listesinde gorulmedigini dogrular
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase("denemeasisi")){
                asiVarmi = true;
            }

        }
        Assert.assertFalse(asiVarmi);

        Driver.quitDriver();

    }

    @Test
    public void TC_3306() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        //"Add Vaccinations" butonu tiklanir
        adminDashboardPage.addVaccinationsButton.click();

        //"PETS TITLE" textbox'ina yeni asinin adi "denemeasisi" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .perform();

        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());

        Driver.quitDriver();

    }

    @Test
    public void TC_3307() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

       // "Add Vaccinations" butonuna tiklar
        adminDashboardPage.addVaccinationsButton.click();

        //"PETS TITLE" textbox'ina  asinin adi olarak "*****" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.doubleClick().doubleClick(adminDashboardPage.addVaccinationTitleTextBox).perform();
        actions.sendKeys("*****")
                .sendKeys(Keys.TAB)
                .sendKeys("*****")
                .sendKeys(Keys.TAB)
                .sendKeys("100")
                .perform();


        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());// test failed. bug cikti.
                                                                                     // gecersiz veri girisinde kayit islemi gerceklesmemeliydi

        Driver.quitDriver();

    }

    @Test
    public void TC_3308() {

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Admin, hedef URL ile Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userHomePage.signInButton.click();

        //Kayitli Admin Email Adresi ve admin Password'unu girerek sign in butonuna tiklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //URL adresi olarak  "https://qa.loyalfriendcare.com/admin"  girerek admin sayfasina girer
        Driver.getDriver().get("https://qa.loyalfriendcare.com/admin");

        //Sol acilir menuye yaklasip "Vaccinations" menusune tiklanir
        adminDashboardPage.dashBoardMenu.click();
        adminDashboardPage.vaccinationsButton.click();

        // "Add Vaccinations" butonuna tiklar
        adminDashboardPage.addVaccinationsButton.click();

        //"PETS TITLE" textbox'ina  asinin adi olarak "denemeasisi", asinin ucreti olarak "yuzdolar" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.doubleClick().doubleClick(adminDashboardPage.addVaccinationTitleTextBox).perform();
        actions.sendKeys("denemeasisi")
                .sendKeys(Keys.TAB)
                .sendKeys("deneme")
                .sendKeys(Keys.TAB)
                .sendKeys("yuzdolar")
                .perform();


        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());// test failed. bug cikti.
                                                        // gecersiz veri girisinde kayit islemi gerceklesmemeliydi

        Driver.quitDriver();


    }






}
