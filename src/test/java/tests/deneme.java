package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class deneme {

    UserHomePage userhomepage = new UserHomePage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();


    @Test
    public void TC_2301(){
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

        //Acilan dashboard uzerinde "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();

        //"Roles" butonu altmenuleri olan "Roles" ve "Create Role" butonlarinin gorunur oldugu dogrulanir.

        Assert.assertTrue(adminDashboardPage.rolesRolesButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createRolesButton.isEnabled());



    }
    }