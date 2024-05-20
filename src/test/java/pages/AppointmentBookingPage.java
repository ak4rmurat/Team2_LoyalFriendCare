package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentBookingPage {

    public AppointmentBookingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@placeholder='Date']")
    public WebElement dateTextBox;                //rezervasyon tarih box

    @FindBy(xpath = "//*[@placeholder='Phone Number']")
    public WebElement phoneNumberTextBox;         //rezervasyon cep telefonu

    @FindBy(xpath = "//*[@class='nice-select wide'][1]")
    public WebElement welnessDropdown; //HomePage>>Doctors>>WellnessDropdown

    @FindBy(xpath = "//*[@value='Appointment Booking']")
    public WebElement appointmenbookingButon; //HomePage>>Doctors>>Appointment Booking Button

    @FindBy(xpath = "//*[@data-value='57']")
    public WebElement wellnessDropdownMenuDentalCare; //HomePage>>Doctors>>Wellness Dropdown Menu DentalCare

    @FindBy(xpath = "//h5[@class='d-inline']")
    public WebElement appointmenBookingText; //HomePage>>Doctors>>Appointment Booking Text

    @FindBy(xpath = "//li[contains(text(),'Dr. Isabella Wong')]")
    public WebElement drDropdownMenuDrIsabella; //HomePage>>Doctors>> Dr Dropdown Menu Dr.Isabella

    @FindBy(xpath = "//div[normalize-space()='Congratulations on your well-deserved success.']")
    public WebElement appointmenBookingTextSuccessText; //HomePage>>Doctors>> Appointment Booking Text Success Text

    @FindBy(xpath = "//li[contains(text(),'Dermatology')]")
    public WebElement appointmentBookingDepartmanDropDown; //HomePage>>Doctors>> Appointment Booking Departman DropDown


}
