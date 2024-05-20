package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_022 {




    @Test
    public void test(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());
         //Kullanıcı hedef Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

         //Anasayfa goruntulenir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl,"Anasayfa goruntulenir");

        //Header bolumunde bulunan Sign In butonu goruntulenir.
        Assert.assertTrue(userHomePage.signInButton.isEnabled());

        //Sign In butonu tıklanir.
        userHomePage.signInButton.click();


        //Acılan sayfa'da Email Adress,Password ve Sıgn ın butonları goruntulenir
        Assert.assertTrue(userHomePage.emailTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());


        //Adminden istenilen bilgileri dogru bir sekilde girer ve Sign In butonuna tıklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
       userHomePage.loginButton.click();



            //admin sayfasına gecis yapar
      adminDashboardPage.adminLoginButton.click();


              //dashboard sayfasi goruntulenir
         adminDashboardPage.admindasboard.isDisplayed();


           //Sayfa'nın sol tarafında bulunan dashboard ögeleri goruntulenir
         actions.moveToElement(adminDashboardPage.admindasboard).perform();


         ReusableMethods.wait(1);

         Driver.quitDriver();







    }
    @Test
    public void test01(){
        SoftAssert softAssert=new SoftAssert();
        UserHomePage userHomePage=new UserHomePage();
        AdminDashboardPage adminDashboardPage=new AdminDashboardPage();
        Actions actions=new Actions(Driver.getDriver());

        //Kullanıcı hedef Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Anasayfa goruntulenir.
        String expectedUrl="https://qa.loyalfriendcare.com/en";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl,"Anasayfa goruntulenir");


        //Header bolumunde bulunan Sign In butonu goruntulenir.
        Assert.assertTrue(userHomePage.signInButton.isEnabled());

        //Sign In butonu tıklanir.
        userHomePage.signInButton.click();

        //Acılan sayfa'da Email Adress,Password ve Sıgn ın butonları goruntulenir
        Assert.assertTrue(userHomePage.emailTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(userHomePage.loginButton.isDisplayed());


  //Admin istenilen bilgileri dogru bir sekilde girer ve Sign In butonuna tıklar.
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();


        //admin sayfasına gecis yapar
        adminDashboardPage.adminLoginButton.click();


           //Dashboard sayfasi goruntulenir.
        adminDashboardPage.admindasboard.isDisplayed();

         ////Sayfa'nın sol tarafında bulunan dashboard ögeleri goruntulenir
        actions.moveToElement(adminDashboardPage.admindasboard).perform();



         //Dashboard'un altında bulunan Roles,Users,Bed managers ,Departmens,Doctors,
        // Medicines,Pets,Adsense, Consulation, Tickets,Vaccinations,Settings ogeler goruntulenir
       Assert.assertTrue(adminDashboardPage.bedManagersButton.isDisplayed());
       Assert.assertTrue(adminDashboardPage.rolesButton.isDisplayed());
       Assert.assertTrue(adminDashboardPage.departmentsButton.isDisplayed());
       Assert.assertTrue(adminDashboardPage.medicinesButton.isDisplayed());


       //Roles ogesi tıklanır altında acılan Roles,Create Roles secenekleri goruntulenir
       adminDashboardPage.rolesButton.click();

       adminDashboardPage.rolesRolesButton.isDisplayed();
       adminDashboardPage.createRolesButton.isDisplayed();


        //Users ogesi tıklanır altında acılan Users,Create User secenekleri goruntulenir
       adminDashboardPage.usersButton.click();
       adminDashboardPage.usersUsersButton.isDisplayed();
       adminDashboardPage.createUsersButton.isDisplayed();

       //Bed managers ogesi tıklanır altında acılan Bed managers,Create Bed managers secenekleri goruntulenir
       adminDashboardPage.bedManagersButton.click();
       adminDashboardPage.bedManagersBedManagersButton.isDisplayed();
       adminDashboardPage.createBedManagersButton.isDisplayed();


       //Departmens ogesi tıklanır altında acılan Departmens,Create Departmens secenekleri goruntulenir
       adminDashboardPage.departmentsButton.click();
       adminDashboardPage.departmentsDepartmentsButton.isDisplayed();
       adminDashboardPage.createDepartmentsButton.isDisplayed();


       ReusableMethods.wait(3);

       Driver.quitDriver();






    }
}
