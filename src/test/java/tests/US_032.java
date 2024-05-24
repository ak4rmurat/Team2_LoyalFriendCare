package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class US_032  extends TestBaseRapor {

    @BeforeMethod
    public void start(){
        AllPages allPages = new AllPages();

        extentTest = extentReports.createTest("Ticket-Our Ticket Testi",
                "Admin giris yaptiktan sonra Dashboard sayfasinda Ticket bolumunu goruntuler");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Admin LoyalFriendCare anasayfasine gider.");
        allPages.userHomePage().alternatifSignInButton.click();
        extentTest.info("Admin anasayfadaki SignIn butonunu goruntuler ve tiklar.");
        assert allPages.userHomePage().emailTextBox.isDisplayed();
        extentTest.pass("Admin Login sayfasina ulasir.");
        allPages.userHomePage().emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        allPages.userHomePage().passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        allPages.userHomePage().loginButton.click();
        extentTest.info("Admin giris bolumlerini goruntuler ve giris yapar.");
        Assert.assertTrue(allPages.adminDashboardPage().adminLoginButton.isDisplayed());
        extentTest.pass("Admin login butonunu goruntuler");
        allPages.adminDashboardPage().adminLoginButton.click();
        extentTest.info("Admin login butonuna tiklar.");
        allPages.adminDashboardPage().dashBoardMenu.click();
        extentTest.info("Admin dashboard sayfasina ulasir ve menuye tiklar");
    }
    @Test
    public void TC_3201() throws InterruptedException {
        AllPages allPages = new AllPages();
        Assert.assertTrue(allPages.adminDashboardPage().ticketsButton.isEnabled());
        extentTest.pass("Admin Tickets yazisini goruntuler");
            }
    @Test
    public void TC_3202() throws InterruptedException {
        AllPages allPages = new AllPages();
        allPages.adminDashboardPage().ticketsButton.click();
        Assert.assertTrue(allPages.adminDashboardPage().ourTicketsText.isDisplayed());
        extentTest.pass("Admin Out Ticket yazisini goruntuler");
    }


}
