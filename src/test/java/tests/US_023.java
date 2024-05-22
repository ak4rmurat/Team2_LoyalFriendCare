package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class US_023 extends TestBaseCross {



    @Test
    public void TC_2301(){
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

        //Acilan dashboard uzerinde "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();

        //"Roles" butonu altmenuleri olan "Roles" ve "Create Role" butonlarinin gorunur oldugu dogrulanir.

        Assert.assertTrue(adminDashboardPage.rolesRolesButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createRolesButton.isEnabled());



    }
    @Test
    public void TC_2302(){
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

        //Acilan dashboard uzerinde "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();

        //"Roles" butonu altmenuleri olan "Roles" ve "Create Role" butonlarinin gorunur oldugu dorulanir.
        Assert.assertTrue(adminDashboardPage.rolesRolesButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createRolesButton.isEnabled());

        //Acilan altmenuden "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();

        //Acilan sayfada "Table Roles" yazisinin,
        // var olan rollerin ve bu rollerin toplam adedinin goruldugu dogrulanir.

       Assert.assertTrue(adminDashboardPage.tableRolesText.isEnabled());
       Assert.assertTrue(adminDashboardPage.numberOfRolesText.isDisplayed());




    }

    @Test
    public void TC_2303(){
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

        //Acilan dashboard uzerinde "Roles" butonuna tiklanir.
        adminDashboardPage.rolesButton.click();


        //Acilan altmenuden "Create Role" butonuna tiklanir.
        adminDashboardPage.createRolesButton.click();


        //Acilan sayfa uzerinde, ilgili kisimlara "Name" ve "Display Name" bilgileri girilir.
        actions.sendKeys(adminDashboardPage.createRolesNameTextArea).sendKeys("Supervisor").sendKeys(Keys.TAB).
                sendKeys("web").perform();

        //"Save" butonuna tiklanir.
        adminDashboardPage.createRoleSaveButton.click();

        //"Role Store successfully." yazisi ve eklenen rol goruntulendigi dogrulanir.
        Assert.assertTrue(adminDashboardPage.roleStoreSuccessfullyAlert.isDisplayed());

        //Olusturulan rolun karsisindaki "Delete" butonuna tiklanir.
        adminDashboardPage.roleDeleteButton.click();


        //"Role deleted successfully" yazisi goruntulenir.
        Assert.assertTrue(adminDashboardPage.roleDeletedSuccessfullyAlert.isDisplayed());


    }




}
