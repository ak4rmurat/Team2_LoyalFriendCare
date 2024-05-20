package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorsPage {
    public DoctorsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h1[text()=' Doctors']") public WebElement doctorsH1Title;// Home> Doctors>sayfa yeşil header Doctors baslık
    @FindBy(xpath = "//img[@class='img-fluid']") public WebElement imageAlejandroM; // Home> Doctors>Doktor resmi
    @FindBy(xpath = "//input[@id='submit-review']") public WebElement appointmentBookingButton;//Home> Doctors>Appointment booking>Appointment Booking button
    @FindBy(xpath="//*[@id='filters_col_bt']") public WebElement doctorsListLabel; // Home>Doctors> Doctors Listesi
    @FindBy(xpath = "//*[text()='Doctors of LoyalFriendCare']") public WebElement doctorsOfLoyalFriendCareText;//Home> Doctors> Doctors>Doctors Of Loyal Friend Care yazısı
    @FindBy(xpath = "//*[@class='img-fluid']")public WebElement totalDoctorImage;//Home>Doctors>Sayfadaki toplam doktor sayısı
    @FindBy(xpath = "//a[text()='Dr. Alejandro Martinez']") public WebElement doctorName1Label; //Home>Doctors>Doktor Alejandro Martinez resmi altında görünen adı
    @FindBy(xpath = "//a[text()='Dr. Olivia Bennett']") public WebElement doctorName2Label; //Home>Doctors>Doktor Dr. Olivia Bennett resmi altında görünen adı
    @FindBy(xpath = "//p[text()='Profession: Veterinarian ']") public WebElement doctorProfessionTextBox; //Home>Doctors>Doktor Resmi> Profession

    @FindBy(xpath = "//input[@id='Date']" )public WebElement tarihDropdownMenu; //Home>Doctors>Appointment booking>TarihDropdownMenu
    @FindBy(xpath = "//input[@id='serial']" )public WebElement phoneNumberTextBox;// Home>DoctorsAppointment booking>TarihDropdownMenu>PhoneNumber textbox
    @FindBy(xpath = "(//*[text()='Wellness'])[2]") public WebElement birimDropDownMenu;// Home>Doctors>Appointment booking>Birim DropdownMenu
    @FindBy(xpath = "(//*[text()='Dr. Alejandro Martinez'])[3]") public WebElement doktorDropDownMenu;// Home>Doctors>Appointment booking>Doktor adları DropdownMenu
    @FindBy(xpath = "//textarea[@id='Comment']") public WebElement createMessageTextBox;// Home>Doctors>Appointment booking>Yorum Textboxı
    @FindBy(xpath = "//h1[text()=' Dr. Alejandro Martinez']") public WebElement drAlejandroMartinezText;//Home>Doctors> drAlejandroMartinez> baslık text
    @FindBy(xpath = "//h1[text()=' Dr. Olivia Bennett']") public WebElement  drOliviaBennettText;//Home>Departments> drOliviaBennett> baslık text




}
