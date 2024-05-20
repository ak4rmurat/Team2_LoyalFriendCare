package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DepartmentsPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_002 {


    @Test
    public void TC_201() {
        UserHomePage userHomePage = new UserHomePage();
        DepartmentsPage departmentsPage = new DepartmentsPage();
        // 1 - Ziyaretci ilgili Url ile anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // 2- Anasayfada header bolumunde bulunan "Home, About Us, Departments, Doctors, Medicines, Vaccinations,
        // Sign In ve Sign Up  " butonlarinin gorunur oldugu dogrulanir.

        Assert.assertTrue(userHomePage.homeButton.isEnabled());
        userHomePage.aboutUsButton.isEnabled();
        userHomePage.departmentsDropDown.isEnabled();
        userHomePage.doctorsDropDown.isEnabled();
        userHomePage.medicinesDropDown.isEnabled();
        userHomePage.signInButton.isEnabled();
        userHomePage.signUpButton.isEnabled();

        // 3- Ziyaretci header bolumunde bulunan "Departments" butonuna tiklar.

        userHomePage.departmentsDropDown.click();

        // 4- Acilan sayfanin sol tarafinda
        // "Departments of Loyal Friend Care " textinin ve altmenulerinden "Wellness" butonunun
        // gorunur oldugu dogrulanir.

        Assert.assertTrue(departmentsPage.departmentsOfLFCText.isDisplayed());
        Assert.assertTrue(departmentsPage.departmentsWellnessButton.isEnabled());

        Driver.quitDriver();










    }
}
