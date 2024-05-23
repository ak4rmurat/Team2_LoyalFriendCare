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
import utilities.TestBaseCross;

import java.lang.reflect.Array;

public class US_033 extends TestBaseCross {


    @Test
    public void TC_3301() { //Admin, admin dashboarda ulasip sol acilir menuden
                            // Vaccinations ve alt menulerinin aktif ve dogru calistiklarini goruntuleyebilmeli

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
        Assert.assertTrue(adminDashboardPage.vaccinationsButton.isEnabled());

        //Sol acilir menuden "Vaccinations" menusunun yanindaki oka tiklanarak alt menusunun gorunur oldugu dogrulanir ve alt menu tiklanir
        adminDashboardPage.vaccinationsAltMenuArrow.click(); // failed. bug var. vaccinations menusunun yaninda alt menuleri acacak ok yok. alt menuler yok
    }

    @Test
    public void TC_3302() { //Admin, Vaccinations bolumune girdiginde var olan asi sayisini
                            // ve asilarin dogru bir şekilde listelendigini goruntuleyebilmeli

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

        String asiSayisiYazisi =adminDashboardPage.asiSayisiYazisi.getText(); //Showing 1 to 8 of 8 entries
        asiSayisiYazisi = asiSayisiYazisi.substring(12,15);
        asiSayisiYazisi = asiSayisiYazisi.replaceAll("\\D","");
        int asiSayisi= Integer.parseInt(asiSayisiYazisi);

        Assert.assertEquals(adminDashboardPage.asiElemanlariListesi.size(),asiSayisi);

    }


    @Test
    public void TC_3303() { //Admin, Vaccinations bolumunde yeni asi ekleyebilmeli
                                // ve ekledigi asiyi ilgili sayfalarda goruntuleyebilmeli

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
        actions.sendKeys(ConfigReader.getProperty("asiAdi"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiIcerik"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiUcreti"))
                .perform();

        adminDashboardPage.addVaccinationSaveButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Eklenen yeni asi "denemeasisi"nin listede gorundugu dogrulanir
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase(ConfigReader.getProperty("asiAdi"))){
                asiVarmi = true;
            }

        }
        Assert.assertTrue(asiVarmi);
    }


    @Test
    public void TC_3304() { //Admin, olusturdugu asilarin bilgilerini duzenleyebilmeli

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
        ReusableMethods.wait(1);
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.doubleClick().doubleClick(adminDashboardPage.addVaccinationTitleTextBox).perform();
        actions.sendKeys(ConfigReader.getProperty("asiEditAdi"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiEditIcerik"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiEditUcreti"))
                .perform();

        //"Dont Change Image" radyo butonuna tiklar
        adminDashboardPage.dontChangeImageRadyoButton.click();

        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Duzenlenen asinin "denemeasisi1"in listede gorundugu dogrulanir
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase(ConfigReader.getProperty("asiEditAdi"))){
                asiVarmi = true;
            }

        }
        Assert.assertTrue(asiVarmi);
    }

    @Test
    public void TC_3305() { //Admin, olusturdugu asilari silebilmeli

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

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Silmis oldugu asinin asi listesinde gorulmedigini dogrular
        boolean asiVarmi = false;
        for (int i = 0; i < adminDashboardPage.asiElemanlariListesi.size(); i++) {
            if (adminDashboardPage.asiElemanlariListesi.get(i).getText().equalsIgnoreCase(ConfigReader.getProperty("asiEditAdi"))){
                asiVarmi = true;
            }

        }
        Assert.assertFalse(asiVarmi);
    }


    @Test
    public void TC_3306() { //Veri girisi yapilan textbox'lara hicbir şey girilmeden
                            // kaydedilmek istendiginde kayit islemi gerceklesmemeli

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

        //"PETS TITLE" textbox'ina yeni asinin adi "" yazar
        adminDashboardPage.addVaccinationTitleTextBox.click();
        actions.sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .perform();

        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());
    }

    @Test
    public void TC_3307() { //Veri girisi yapilan textbox'lara gecersiz karakterler girilerek
                            // kaydedilmek istendiginde kayit islemi gerceklesmemeli

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
        actions.sendKeys(ConfigReader.getProperty("gecersizAsiAdi"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("gecersizAsiIcerik"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiUcreti"))
                .perform();

        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());// test failed. bug cikti.
                                                                                     // gecersiz veri girisinde kayit islemi gerceklesmemeliydi
    }

    @Test
    public void TC_3308() {  //Veri girisi yapilan "PETS PRICE" textbox'ina
                            // sayisal degerlerden baska bir deger girilmesi halinde kayit islemi gerceklesmemeli

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
        actions.sendKeys(ConfigReader.getProperty("asiAdi"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("asiIcerik"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("gecersizAsiUcreti"))
                .perform();

        //"SAVE" butonuna tiklar
        adminDashboardPage.addVaccinationSaveButton.click();

        Assert.assertTrue(adminDashboardPage.addVaccinationSaveButton.isDisplayed());// test failed. bug cikti.
                                                        // gecersiz veri girisinde kayit islemi gerceklesmemeliydi
    }


}
