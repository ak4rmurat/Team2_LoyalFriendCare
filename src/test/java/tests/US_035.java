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

public class US_035 {
    UserHomePage userHomePage=new UserHomePage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void TC_001(){
        //1-Kullanıcı URL e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2-Header bolumundeki Sign in butonuna tıklar
        userHomePage.signInButton.click();

        //3-İlgili boxlara admin email adres ve şifre girer,sign in butonuna tıklar
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();

        //4-Acılan anasayfada header kısmında admin adı olan butona tıklanarak admin sayfasina erisilir
        adminDashboardPage.adminLoginButton.click();
        ReusableMethods.wait(5);

        //5-Sayfanın soluna hover yapilir
        adminDashboardPage.dashBoardMenu.click();
        actions.moveToElement(adminDashboardPage.dashBoardMenu).click();

        //6-Acilan dasboardda Roles yazisina tiklanir
        adminDashboardPage.rolesButton.click();

        //7-Alt menuden Create Role yazisina tiklanir

        //8-Create Role sayfasindayken sayfanin sol tarafina hover yapilir
    }
}
