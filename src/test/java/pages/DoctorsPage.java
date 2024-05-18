package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorsPage {
    public DoctorsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h1[text()=' Doctors']") public WebElement pageH1Title;// sayfa yeşil header Doctors baslık
    @FindBy(xpath = "//img[@class='img-fluid']") public WebElement imageAlejandroM; // Doctors>Doktor resmi
    @FindBy(xpath = "//input[@id='submit-review']") public WebElement appointmentBookingButton;// Doctors>Appointment booking>Appointment Booking button
    @FindBy(xpath="//*[@id='filters_col_bt']") public WebElement doctorsListLabel; // Doctors> Doctors Listesi
    @FindBy(xpath = "//*[text()='Doctors of LoyalFriendCare']") public WebElement doctorsOfLoyalFriendCareText;// Doctors> Doctors>Doctors Of Loyal Friend Care yazısı
    @FindBy(xpath = "//*[@class='img-fluid']")public WebElement totalDoctorImage;//Doctors>Sayfadaki toplam doktor sayısı
    @FindBy(xpath = "//a[text()='Dr. Alejandro Martinez']") public WebElement doctorName1Label; //Doctors>Doktor Alejandro Martinez resmi altında görünen adı
    @FindBy(xpath = "//a[text()='Dr. Emily Chang']") public WebElement doctorName2Label; //Doctors>Doktor Dr. Emily Chang resmi altında görünen adı
    @FindBy(xpath = "//p[text()='Profession: Veterinarian ']") public WebElement doctorProfessionTextBox; //Doctors>Doktor Resmi> Profession

    @FindBy(xpath = "//input[@id='Date']" )public WebElement tarihDropdownMenu; //Doctors>Appointment booking>TarihDropdownMenu
    @FindBy(xpath = "//input[@id='serial']" )public WebElement phoneNumberTextBox;// DoctorsAppointment booking>TarihDropdownMenu>PhoneNumber textbox
    @FindBy(xpath = "(//*[text()='Wellness'])[2]") public WebElement birimDropDownMenu;// Doctors>Appointment booking>Birim DropdownMenu
    @FindBy(xpath = "(//*[text()='Dr. Alejandro Martinez'])[3]") public WebElement doktorDropDownMenu;// Doctors>Appointment booking>Doktor adları DropdownMenu
    @FindBy(xpath = "//textarea[@id='Comment']") public WebElement createMessageTextBox;// Doctors>Appointment booking>Yorum Textboxı



}
