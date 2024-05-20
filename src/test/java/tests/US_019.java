package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AppointmentBookingPage;
import pages.UserHomePage;
import pages.VaccinationsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_019 {


    @Test
    public void test(){


        //Kullanıcı Url Gider.
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        String expectedUrl="https://qa.loyalfriendcare.com/";

        String actual=Driver.getDriver().getCurrentUrl();

        SoftAssert  softAssert = new SoftAssert();

        softAssert.assertEquals(expectedUrl,actual,"Anasayfa goruntulenebilir");

        //Header bolumunde bulunan Departmens,Medicines ve Vaccinations goruntulenir ve dogrulanir
        UserHomePage userHomePage=new UserHomePage();
        userHomePage.homeButton.isEnabled();
        userHomePage.aboutUsButton.isEnabled();
        userHomePage.departmentsDropDown.isEnabled();
        userHomePage.doctorsDropDown.isEnabled();
        userHomePage.medicinesDropDown.isEnabled();
        userHomePage.vaccinationsDropDown.isEnabled();


        //Header bolumunde bulunan Vaccinations bolumu tıklanir.

        userHomePage.vaccinationsDropDown.click();

        VaccinationsPage vaccinationsPage=new VaccinationsPage();
        vaccinationsPage.vaccinationsimage.isDisplayed();

        vaccinationsPage.rabbiesVaccineImage.click();

        AppointmentBookingPage appointmentBookingPage=new AppointmentBookingPage();


        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(appointmentBookingPage.dateTextBox)
                .sendKeys("11").sendKeys("05").sendKeys("2024")
                .sendKeys(Keys.TAB)
                .sendKeys("05555555555").perform();

        appointmentBookingPage.welnessDropdown.click();

        ReusableMethods.wait(2);

        appointmentBookingPage.wellnessDropdownMenuDentalCare.click();

        actions.sendKeys(Keys.TAB).click().sendKeys().click().sendKeys(Keys.TAB).sendKeys("Thank You").perform();

        appointmentBookingPage.appointmenbookingButon.click();



        ReusableMethods.wait(4);

        Driver.quitDriver();


    }
}