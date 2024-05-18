package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DepartmentsPage {
    public DepartmentsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[text()=' Departments']") public WebElement departmentsH1Title;//Departments>yeşil alan h1 başlık;
    @FindBy(xpath = "//*[@id='filters_col_bt']") public WebElement departmentsListLabel;//Departments>departments listesi yazısı
    @FindBy(xpath ="//*[text()='Departments of LoyalFriendCare']") public WebElement departmentsOfLoyalFriendCareLabel;//Departments>sol taraf departmentsOfLoyalFriendCare yazısı
    @FindBy(xpath = "//*[text()='Wellness']") public WebElement departmentsListWellnessLabel;//Departments>sol taraf Wellness yazısı
    @FindBy(xpath = "//*[text()='Dental Care']") public WebElement departmentsListDentalCareLabel;//Departments>sol taraf dental Care yazısı
    @FindBy(xpath = "(//*[text()='Vaccinations'])[3]") public WebElement departmentsListVaccinationsLabel;//Departments>sol taraf Vaccinations yazısı
    @FindBy(xpath = "//img[@class='img-fluid']")public WebElement totalDepartmentsImage;//Departments>toplam resim sayısı
    @FindBy(xpath = "//(img[@class='img-fluid'])[1]")public WebElement wellnessImage;//Departments>wellness resim
    @FindBy(xpath = "//(img[@class='img-fluid'])[2]")public WebElement dentalCareImage;//Departments> dentalCare resim
    @FindBy(xpath = "(//h1[text()=' Wellness'])[1]") public WebElement wellnessDepartmentText;//Departments> Wellness> baslık text
    @FindBy(xpath = "(//h1[text()=' Dental Care'])[1]") public WebElement dentalCareDepartmentText;//Departments> DentalCare> baslık text








}
