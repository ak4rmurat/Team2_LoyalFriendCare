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
    public WebElement welnessDropdown;


    @FindBy(xpath = "//*[@name='doctor_id']")
    public WebElement doctorDropdown;

    @FindBy(xpath = "//*[@placeholder='Create Message']")
    public WebElement createTextBoxMessage;

    @FindBy(xpath = "//*[@value='Appointment Booking']")
    public WebElement appointmenbookingButon;

    @FindBy(xpath = "//*[@data-value='57']")
    public WebElement wellnessDropdownMenuDentalCare;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement appointmentBookingText;//home>departments>herhangi dep>rezervazyon olusturulunca cikan yazi"Congratulations on your well-deserved success."

}
