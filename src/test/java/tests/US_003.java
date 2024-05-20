package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DepartmentsPage;
import pages.DoctorsPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class US_003 {


  @Test
   public void TC_001(){
      UserHomePage userHomePage = new UserHomePage();
      DepartmentsPage departmentsPage=new DepartmentsPage();
      DoctorsPage doctorsPage=new DoctorsPage();
      VaccinationsPage vaccinationsPage=new VaccinationsPage();
      Actions actions=new Actions(driver);
      SoftAssert softAssert=new SoftAssert();


        //1- Kullanıcı verilen url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
      Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2- Body Departments altında yer alan sekmeleri ve Departments yazısını görüntüler
        Assert.assertTrue(userHomePage.welnessImage.isDisplayed());
        Assert.assertTrue(userHomePage.welnessImage.isEnabled());
       Assert.assertTrue(userHomePage.dentalCareImage.isDisplayed());
       Assert.assertTrue(userHomePage.dentalCareImage.isEnabled());

        //3-Departments altında yer alan  sekmelere ve departments yazısına tıklar.Tıklanan sekmelerin ilgili windowa  yönlendirdiği görüntülenir
        userHomePage.welnessImage.click();

        Assert.assertEquals(departmentsPage.wellnessDepartmentText.getText(),"Wellness");
        ReusableMethods.wait(3);
        Driver.getDriver().navigate().back();

        userHomePage.dentalCareImage.click();
       Assert.assertEquals(departmentsPage.dentalCareDepartmentText.getText(),"Dental Care");
       Driver.getDriver().navigate().back();
        userHomePage.greenDepartmentsLink.click();
        Assert.assertEquals(departmentsPage.departmentsH1Title.getText(),"Departments");

        userHomePage.loyalFriendCareLogo.click();


   }
    @Test
    public void TC_002(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        DoctorsPage doctorsPage=new DoctorsPage();
        VaccinationsPage vaccinationsPage=new VaccinationsPage();
        Actions actions=new Actions(driver);
        SoftAssert softAssert=new SoftAssert();


        //1- Kullanıcı verilen url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2- Popular Doctors altında yer alan doktor isimlerinden oluşan sekmeleri  ve Doctors yazısını görüntüler
        Assert.assertTrue(userHomePage.drAlejandRoMartinesimage.isDisplayed());
        Assert.assertTrue(userHomePage.drAlejandRoMartinesimage.isEnabled());
        Assert.assertTrue(userHomePage.drOliviaBennetImage.isDisplayed());
        Assert.assertTrue(userHomePage.drOliviaBennetImage.isEnabled());

        //3- Popular Doctors altında yer alan doktor isimlerinden oluşan sekmeleri  ve Doctors yazısına tıklar4.Tıklanan sekmelerin ilgili windowa  yönlendirdiği görüntülenir
        userHomePage.drAlejandRoMartinesimage.click();
        Assert.assertEquals(doctorsPage.drAlejandroMartinezText.getText(),"Dr. Alejandro Martinez");
        Driver.getDriver().navigate().back();

        userHomePage.drOliviaBennetImage.click();
        Assert.assertEquals(doctorsPage.drOliviaBennettText.getText(),"Dr. Olivia Bennett");
        Driver.getDriver().navigate().back();

        userHomePage.greenDoctorsLink.click();
        Assert.assertEquals(doctorsPage.doctorsH1Title.getText(),"Doctors");
        userHomePage.loyalFriendCareLogo.click();

    }
    @Test
    public void TC_003(){
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage=new DepartmentsPage();
        DoctorsPage doctorsPage=new DoctorsPage();
        VaccinationsPage vaccinationsPage=new VaccinationsPage();
        Actions actions=new Actions(driver);
        SoftAssert softAssert=new SoftAssert();


        //1- Kullanıcı verilen url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareLogo.isDisplayed());

        //2- Vaccinations for Pets  altında yer alan aşı isimlerinden oluşan sekmeleri  ve Vaccinations yazısını görüntüler
        Assert.assertTrue(userHomePage.rabiesVaccinationsImage.isDisplayed());
        Assert.assertTrue(userHomePage.rabiesVaccinationsImage.isEnabled());
        Assert.assertTrue(userHomePage.bordetellaImage.isDisplayed());
        Assert.assertTrue(userHomePage.bordetellaImage.isEnabled());

        //3- Vaccinations for Pets altında yer alan doktor isimlerinden oluşan sekmelere ve Vaccinations yazısına tıklar
        //4.Tıklanan sekmelerin ilgili windowa  yönlendirdiği görüntülenir

        userHomePage.rabiesVaccinationsImage.click();
        Assert.assertEquals(vaccinationsPage.rabbiesVaccineText.getText(),"Rabies Vaccine");
        Driver.getDriver().navigate().back();

        userHomePage.drOliviaBennetImage.click();
        Assert.assertEquals(vaccinationsPage.bordetellaVaccineText.getText(),"Bordetella (Kennel Cough) Vaccine");
        Driver.getDriver().navigate().back();

        userHomePage.greenVaccinationsLink.click();
        Assert.assertEquals(vaccinationsPage.vaccinationsH1Title.getText(),"Vaccinations");
        userHomePage.loyalFriendCareLogo.click();

    }
    }



