package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_023 {

    UserHomePage userhomepage = new UserHomePage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();


    @Test
    public void TC_2301(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userhomepage.loginButton.click();

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
    @Test
    public void TC_2302(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        userhomepage.loginButton.click();

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

        //"Roles" butonu altmenuleri olan "Roles" ve "Create Role" butonlarinin gorunur oldugu dorulanir.
        Assert.assertTrue(adminDashboardPage.rolesRolesButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createRolesButton.isEnabled());

        //Acilan altmenuden "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();

        //Acilan sayfada "Table Roles" yazisinin,
        // var olan rollerin ve bu rollerin toplam adedinin goruldugu dogrulanir.

       Assert.assertTrue(adminDashboardPage.tableRolesText.isDisplayed());
       Assert.assertTrue(adminDashboardPage.numberOfRolesText.isDisplayed());




    }

    @Test
    public void TC_2303(){

        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        //Acilan dashboard uzerinde "Roles" butonuna tiklanir.
        //Acilan altmenuden "Create Role" butonuna tiklanir.
        //Acilan sayfa uzerinde, ilgili kisimlara "Name" ve "Display Name" bilgileri girilir.
        //"Save" butonuna tiklanir.
        //"Role Store successfully." yazisi ve eklenen rol goruntulendigi dogrulanir.
        //Olusturulan rolun karsisindaki "Delete" butonuna tiklanir.
        //"Role deleted successfully" yazisi goruntulenir.


    }










}
