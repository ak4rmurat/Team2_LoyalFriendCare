package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class US_029 extends TestBaseCross {

    @Test public void TC_2901(){

        UserHomePage userhomepage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userhomepage.signInButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userhomepage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userhomepage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userhomepage.loginButton.click();

        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        adminDashboardPage.adminLoginButton.click();

        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        adminDashboardPage.dashBoardMenu.click();


        //Acilan dashboard uzerinde "Medicines" butonuna tiklanir.
        adminDashboardPage.medicinesButton.click();



        //"Medicines" butonu altmenuleri olan "Medicines" ve "Create Medicine" butonlarinin gorunur oldugu dogrulanir.
        Assert.assertTrue(adminDashboardPage.medicinesMedicinesButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createMedicinesButton.isEnabled());


            }

    @Test public void TC_2902(){

        UserHomePage userhomepage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userhomepage.signInButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userhomepage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userhomepage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userhomepage.loginButton.click();

        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        adminDashboardPage.adminLoginButton.click();

        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        adminDashboardPage.dashBoardMenu.click();

        //Acilan dashboard uzerinde "Medicines" butonuna tiklanir.
        adminDashboardPage.medicinesButton.click();

        //Acilan altmenuden "Medicines" butonuna tiklanir.
        adminDashboardPage.medicinesMedicinesButton.click();

        // Acilan sayfada "Table Medicines" ve "Showing 1 to 5 of 5 entries" yazisinin goruldugu dogrulanir.

        Assert.assertTrue(adminDashboardPage.tableMedicinesText.isDisplayed());
        Assert.assertTrue(adminDashboardPage.showingMedicinesNumberText.isDisplayed());


    }

    @Test public void TC_2903() {

        UserHomePage userhomepage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userhomepage.signInButton.click();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        userhomepage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userhomepage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userhomepage.loginButton.click();

        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        adminDashboardPage.adminLoginButton.click();

        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        adminDashboardPage.dashBoardMenu.click();

        //Acilan dashboard uzerinde "Medicines" butonuna tiklanir.
        adminDashboardPage.medicinesButton.click();

        //Acilan dashboard uzerinde " Create Medicines" butonuna tiklanir.
        adminDashboardPage.createMedicinesButton.click();


        //Acilan sayfa uzerinde, "Medicines Title" kismina "Antibit" ve "Medicines Content" kismina "2 mg png" bilgileri girilir.

       actions.sendKeys(adminDashboardPage.medicinesTitleTextArea).sendKeys("Antibit").sendKeys(Keys.TAB)
               .sendKeys("2 mg png").perform();

        //"Save" butonuna tiklanir.

        adminDashboardPage.createMedicinesSaveButton.click();



        //Olusturulan ilacin karsisindaki "Delete" butonuna tiklanir.







    }





    }
