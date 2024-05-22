package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_035 extends TestBaseCross {

    @Test
    public void TC_001(){
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());


        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        Assert.assertTrue(userHomePage.signInButton.isEnabled());
        userHomePage.signInButton.click();


        //3-İlgili boxlara admin email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        Assert.assertTrue(ConfigReader.getProperty("adminDashboardUrl").contains("admin"));

        //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        Assert.assertTrue(adminDashboardPage.dashBoardMenu.isDisplayed());


        //6-Acilan dasboardda Roles yazisina tiklanir
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.rolesButton.isDisplayed());
        adminDashboardPage.rolesButton.click();


        //7-Alt menuden Create Role yazisina tiklanir
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.createRolesButton.isDisplayed());
        adminDashboardPage.createRolesButton.click();

        //8-Create Role sayfasindayken sayfanin sol tarafina hover yapilir

        Assert.assertTrue(adminDashboardPage.dashBoardMenu.isDisplayed());

        adminDashboardPage.loyalFriendCareFooterLink.click();
        userHomePage.signOutButton.click();
    }
    @Test
    public void TC_002(){
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());


        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        Assert.assertTrue(userHomePage.signInButton.isEnabled());
        userHomePage.signInButton.click();


        //3-İlgili boxlara admin email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        Assert.assertTrue(ConfigReader.getProperty("adminDashboardUrl").contains("admin"));

        //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        Assert.assertTrue(adminDashboardPage.dashBoardMenu.isDisplayed());


        //6-Acilan dasboardda Tickets yazisina tiklanir
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboardPage.ticketsButton.isDisplayed());
        adminDashboardPage.ticketsButton.click();

        //7-Tickets sayfasindayken sayfanin sol tarafina hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        Assert.assertTrue(adminDashboardPage.dashBoardMenu.isDisplayed());

    }
}
