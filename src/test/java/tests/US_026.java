package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_026 extends TestBaseCross {

    @Test
    public void TC_001(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
       // 4 - Sol acilir menuye giderek "Departments" secenegini goruntuler
       adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.departmentsButton.isDisplayed());
    }
    @Test
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
       // 4 - Sol acilir menuye giderek "Departments" secenegine tiklar.
        adminDashboardPage.dashBoardMenu.click();
       // 5 - Departments'in altindaki "Departments" ve "Create Departments" seçeneklerini goruntuler
        adminDashboardPage.departmentsButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboardPage.departmentsDepartmentsButton.isDisplayed());
        Assert.assertTrue(adminDashboardPage.createDepartmentsButton.isDisplayed());
       // 6 - "Departments" secenegini tiklar
        adminDashboardPage.departmentsDepartmentsButton.click();
       // 7 - Departmanlara ait bilgileri goruntuler

       // 8 - Hedef URL'e gider
       // 9 - Sol acilir menudeki "Departments" seceneginin altindaki "Create Departments" secenegine tiklar
       // 10 - Acilan sayfada "New Departments" yazisini goruntuler
    }

    @Test
    public void TC_003(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
       // 4 - Sol acilir menuye giderek "Departments" secenegine tiklar.
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);
       // 5 - Departments'in altindaki "Create Departments"e tiklar
        adminDashboardPage.departmentsButton.click();
        ReusableMethods.wait(1);
        adminDashboardPage.createDepartmentsButton.click();

       // 6 - Sayfada bulunan "Parent Departments, Order Departments, Title Departments ve Departments Color" bilgilerini doldurur.
       // 7 - "Save" butonuna tiklar
    }

    @Test
    public void TC_004(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
       // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
       // 4 - Sol acilir menuye giderek "Departments" secenegine tiklar.
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);
       // 5 -  Departmens'in altindaki "Departments" e tiklar
        adminDashboardPage.departmentsButton.click();
        ReusableMethods.wait(1);
        adminDashboardPage.departmentsDepartmentsButton.click();
        ReusableMethods.wait(1);
       // 6 - Ekranda "team2" olan Departman icin "Edit" butonuna tiklar.
       // 7 - Sayfada bulunan "Parent Departments, Order Departments, Title Departments ve Departments Color" bilgilerini günceller ve "Save Departments" e tiklar
       // 8 - Ekranda "Departments Updated successfully." bilgisini goruntuler
    }

    @Test
    public void TC_005(){
        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        // 1 - Kullanici hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // 2 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.signInButton.click();
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        // 3 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        adminDashboardPage.adminLoginButton.click();
        // 4 - Sol acilir menuye giderek "Departments" secenegine tiklar.
        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(1);
        // 5 -  Departmens'in altindaki "Departments" e tiklar
        adminDashboardPage.departmentsButton.click();
        ReusableMethods.wait(1);
        adminDashboardPage.departmentsDepartmentsButton.click();
        ReusableMethods.wait(1);
        // 6 - Ekranda "team2" olan Departman icin "Delete" butonuna tiklar.

        // 7 - Ekranda "Departments deleted successfully" yazisini goruntuler
    }
}
