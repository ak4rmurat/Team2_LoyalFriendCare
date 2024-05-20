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

public class US_028 {

    UserHomePage userHomePage = new UserHomePage();
    DoctorsPage doctorsPage = new DoctorsPage();
    AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }

    @Test
    public void TC_2801(){

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //Acilan sayfada "E-Mail Address" ve "Password" bolumune admin bilgileri ile siteye giris yapar.
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

    @Test
    public void TC_2802(){

        //Kullanici sitenin "URL" 'ine gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Header bolumundeki "Sign In" butonuna tiklar.
        userHomePage.signInButton.click();

        //Acilan sayfada "E-Mail Address" ve "Password" bolumune admin bilgileri ile siteye giris yapar.
        actions.sendKeys(ConfigReader.getProperty("adminMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("adminPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //Acilan sayfadaki header bolumundeki "Sign Out" butonunun yanindaki "Kullanicinin bilgisinin yazdigi butona" tiklar.
        userHomePage.adminDashboardButton.click();

        //Dashboarda'a gelir ve "Departments" 'e tiklar.
        actions.moveToElement(adminDashboardPage.departmentsButton).perform();
        adminDashboardPage.departmentsDepartmentsButton.click();
        ReusableMethods.wait(2);

        //Acilan alttakidaki menude "Departments" 'e tiklar ve sayfaya gittigi test edilir.


        //Sonra dashboarda gelir ve "Departments" 'e tiklar acilan altindaki menude "Create Departsmens" tiklar ve sayfaya gittigi test edilir.

        //Dashboarda'a gelir ve "Departments" 'e tiklar acilan alttakidaki menude "Departsmens" 'e tiklar.

        //Acilan sayfadaki deparments sayisini ve departmanlari goruntuler.
    }

    @Test
    public void TC_2803(){

        //Kullanici sitenin "URL" 'ine gider.

        //Header bolumundeki "Sign In" butonuna tiklar.

        //Acilan sayfada "E-Mail Address" ve "Password" bolumune admin bilgileri ile siteye giris yapar.

        //Acilan sayfadaki header bolumundeki "Sign Out" butonunun yanindaki "Kullanicinin bilgisinin yazdigi butona" tiklar.

        //Dashboarda'a gelir ve "Departsmens" 'e tiklar , acilan altindaki menude "Create Departsmens" tiklar.

        //"New Departsmens" yazisinin goruldugu dogrulanir.

        //Admin "Create your Departments" bolumundeki kutulara sirasiyla bilgileri girer.

        //"Save" butonuna tiklar.

        //Acilan "Departsmens" sayfasinda , yeni olusturulan departmanin gorunur oldugunu test eder.

    }

    @Test
    public void TC_2804(){

        //Kullanici sitenin "URL" 'ine gider.

        //Header bolumundeki "Sign In" butonuna tiklar.

        //Acilan sayfada "E-Mail Address" ve "Password" bolumune admin bilgileri ile siteye giris yapar.

        //Acilan sayfadaki header bolumundeki "Sign Out" butonunun yanindaki "Kullanicinin bilgisinin yazdigi butona" tiklar.

        //Dashboarda'a gelir ve "Departments" 'e tiklar , acilan altindaki menude "Create Departsmens" tiklar.

        //"New Departsmens"" yazisinin goruldugu dogrulanir.

        //Admin "Create your Departments" bolumundeki kutulara sirasiyla bilgileri girer.

        //"Save" butonuna tiklar.

        //Acilan "Departsmens" sayfasinda , yeni olusturulan departmanin gorunur oldugunu test eder.

        //Yeni olusturulan departmanin yaninda "Edit" ve "Delete" butonunun gorunur ve tiklanabilir oldugunu test eder.

        //Olusturulan departmanin uzerine gelip "Edit" butonuna basip duzenler ve sonrasinda "Save Departsmens" butonuna tiklar ve kayit eder.

        //Tekrar olusturulan departmanin uzerine gelip "Delete" butonuna basar ve siler.

        //"Departmens deleted successfully" yazisinin gorundugu dogrulanir.

    }
}
