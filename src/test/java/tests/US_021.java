package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.AppointmentBookingPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_021 {
    UserHomePage userHomePage = new UserHomePage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }

    @Test
    public void TC_2101(){

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //"E-Mail Address" ve "Password" bolumune admin bilgileri ile siteye giris yapar.
        actions.sendKeys(ConfigReader.getProperty("adminMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("adminPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //Acilan sayfadaki header bolumundeki "Sign Out" butonunun yanindaki "Kullanicinin bilgisinin yazdigi butona" tiklar.
        userHomePage.adminDashboardButton.click();

        //Acilan sayfadaki sol taraftaki dashboard da "Settings" menusunun gorunur oldugu ve tiklanabilir oldugu test edilir.
        Assert.assertTrue(adminDashboardPage.adminDashboardSettingButton.isEnabled());

    }
}
