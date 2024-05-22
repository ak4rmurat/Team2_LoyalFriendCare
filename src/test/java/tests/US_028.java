package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

import java.util.List;

public class US_028 {


    @AfterMethod
    public void close (){
        ReusableMethods.wait(2);
        Driver.quitDriver();
    }

    @Test
    public void TC_2801(){
        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

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

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

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
        actions.moveToElement(adminDashboardPage.admindasboard).perform();
        adminDashboardPage.departmentsButton.click();

        //Acilan alttakidaki menude "Departments" 'e tiklar ve sayfaya gittigi test edilir.
        adminDashboardPage.departmentsDepartmentsButton.click();
        Assert.assertTrue(adminDashboardPage.departmentsAddDepartmentsButton.isEnabled());

        //Sonra dashboarda gelir ve "Departments" 'e tiklar acilan altindaki menude "Create Departsmens" tiklar ve sayfaya gittigi test edilir.
        actions.moveToElement(adminDashboardPage.admindasboard).perform();
        adminDashboardPage.departmentsButton.click();
        adminDashboardPage.departmentCreateDepartments.click();
        adminDashboardPage.newCreateDepartmentsText.isDisplayed();

        //Dashboarda'a gelir ve "Departments" 'e tiklar acilan alttakidaki menude "Departsmens" 'e tiklar.
        actions.moveToElement(adminDashboardPage.admindasboard).perform();
        adminDashboardPage.departmentsButton.click();
        adminDashboardPage.departmentsDepartmentsButton.click();

        //Acilan sayfadaki deparments sayisini ve departmanlari goruntuler.
        String expectedDepartmentsAdetText = "Showing 1 to 8 of 8 entries";
        String actualDepartmentsAdetText = adminDashboardPage.departmentsAdetText.getText();
        Assert.assertEquals(actualDepartmentsAdetText,expectedDepartmentsAdetText);

        List<WebElement> departmentsList =
                Driver.driver.findElements(By.xpath("//tbody/tr[1]/td[1]"));

        Assert.assertTrue(departmentsList.size() > 0);



    }

    @Test
    public void TC_2803(){

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

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

        //Dashboarda'a gelir ve "Departsmens" 'e tiklar , acilan altindaki menude "Create Departsmens" tiklar.
        actions.moveToElement(adminDashboardPage.admindasboard).perform();
        adminDashboardPage.departmentsButton.click();
        adminDashboardPage.departmentCreateDepartments.click();

        //"New Departsmens" yazisinin goruldugu dogrulanir.
        adminDashboardPage.newCreateDepartmentsText.isDisplayed();

        //Admin "Create your Departments" bolumundeki kutulara sirasiyla bilgileri girer.
        adminDashboardPage.createDepartmentsBox.click();
        actions.sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("2")
                .sendKeys(Keys.TAB)
                .sendKeys("Wellness")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        //"Save" butonuna tiklar.
        adminDashboardPage.createDepartmentsSaveButton.click();

        //Acilan "Departsmens" sayfasinda , yeni olusturulan departmanin gorunur oldugunu test eder.
        Assert.assertTrue(adminDashboardPage.newDepartments.isDisplayed());

        //Olusturulan departman silinir.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        adminDashboardPage.createDepartmentsDeleteButton.click();

        //Departmanin basarili bir sekilde silindigini test eder.
        Assert.assertTrue(adminDashboardPage.departmentsSuccessDeleteText.isDisplayed());

    }

    @Test
    public void TC_2804(){

        UserHomePage userHomePage = new UserHomePage();
        DoctorsPage doctorsPage = new DoctorsPage();
        AppointmentBookingPage appointmentBookingPage = new AppointmentBookingPage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions = new Actions(Driver.getDriver());

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

        //Dashboarda'a gelir ve "Departments" 'e tiklar , acilan altindaki menude "Create Departsmens" tiklar.
        actions.moveToElement(adminDashboardPage.admindasboard).perform();
        adminDashboardPage.departmentsButton.click();
        adminDashboardPage.departmentCreateDepartments.click();

        //"New Departsmens"" yazisinin goruldugu dogrulanir.
        adminDashboardPage.newCreateDepartmentsText.isDisplayed();

        //Admin "Create your Departments" bolumundeki kutulara sirasiyla bilgileri girer.
        adminDashboardPage.createDepartmentsBox.click();
        actions.sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("2")
                .sendKeys(Keys.TAB)
                .sendKeys("Wellness")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        //"Save" butonuna tiklar.
        adminDashboardPage.createDepartmentsSaveButton.click();

        //Acilan "Departsmens" sayfasinda , yeni olusturulan departmanin gorunur oldugunu test eder.
        Assert.assertTrue(adminDashboardPage.newDepartments.isDisplayed());

        //Yeni olusturulan departmanin yaninda "Edit" ve "Delete" butonunun gorunur ve tiklanabilir oldugunu test eder.
        Assert.assertTrue(adminDashboardPage.createDepartmentsEditButton.isEnabled());
        Assert.assertTrue(adminDashboardPage.createDepartmentsDeleteButton.isEnabled());

        //Olusturulan departmanin uzerine gelip "Edit" butonuna basip duzenler ve sonrasinda "Save Departsmens" butonuna tiklar ve kayit eder.
        adminDashboardPage.createDepartmentsEditButton.click();
        Assert.assertTrue(adminDashboardPage.editDepartmentsEditText.isDisplayed());

        adminDashboardPage.editDepartmentsParentsBox.click();
        actions.sendKeys("2").perform();

        adminDashboardPage.editSaveDepartmentsButton.click();

        //Tekrar olusturulan departmanin uzerine gelip "Delete" butonuna basar ve siler.
        adminDashboardPage.createDepartmentsDeleteButton.click();

        //"Departmens deleted successfully" yazisinin gorundugu dogrulanir.
        Assert.assertTrue(adminDashboardPage.departmentsSuccessDeleteText.isDisplayed());

    }
}
