package tests;

import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class US_032 extends TestBaseCross {

    AllPages allPages = new AllPages();




    @Test
    public void TC_3201() throws InterruptedException {
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        allPages.userHomePage().alternatifSignInButton.click();

        // Login sayfasina girdigini dogrular
        assert allPages.userHomePage().emailTextBox.isDisplayed();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        allPages.userHomePage().emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        allPages.userHomePage().passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        allPages.userHomePage().loginButton.click();

        //Admin sayfasina girildigi dogrulanir.
        Assert.assertTrue(allPages.adminDashboardPage().adminLoginButton.isDisplayed());

        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        allPages.adminDashboardPage().adminLoginButton.click();

        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        allPages.adminDashboardPage().dashBoardMenu.click();
        // "Tickets" yazisinin  goruntulendigi dogrulanir.
        Assert.assertTrue(allPages.adminDashboardPage().ticketsButton.isEnabled());


            }

    @Test
    public void TC_3202() throws InterruptedException {
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        allPages.userHomePage().signInButton.click();

        // Login sayfasina girdigini dogrular
        assert allPages.userHomePage().emailTextBox.isDisplayed();

        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        allPages.userHomePage().emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        allPages.userHomePage().passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        allPages.userHomePage().loginButton.click();

        //Admin sayfasina girildigi dogrulanir.
        Assert.assertTrue(allPages.adminDashboardPage().adminLoginButton.isDisplayed());

        //Anasayfa header bolumunde bulunan ve uzerinde admin adi yazili olan butona tiklar.
        allPages.adminDashboardPage().adminLoginButton.click();

        //Acilan admin sayfasinda bulunan sol acilir menu aktif edilir.
        allPages.adminDashboardPage().dashBoardMenu.click();
        //Acilan dashboard uzerinde " Tickets" butonuna tiklanir.
        allPages.adminDashboardPage().ticketsButton.click();

        // "Our Tickets" yazisi ve var olan randevuların  goruntulendigi dogrulanir.
        Assert.assertTrue(allPages.adminDashboardPage().ourTicketsText.isDisplayed());


    }


}
