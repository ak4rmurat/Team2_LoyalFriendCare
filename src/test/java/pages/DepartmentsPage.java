package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DepartmentsPage {


    public DepartmentsPage() {PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h1[text()=' Departments']")
    public WebElement departmentsH1Title;//Home>Departments>yeşil alan h1 başlık;

    @FindBy(xpath = "//*[@id='filters_col_bt']")
    public WebElement departmentsListLabel;//Home>Departments>departments listesi yazısı

    @FindBy(xpath ="//*[text()='Departments of LoyalFriendCare']")
    public WebElement departmentsOfLoyalFriendCareLabel;//Home>Departments>sol taraf departmentsOfLoyalFriendCare yazısı

    @FindBy(xpath = "//*[text()='Wellness']")
    public WebElement departmentsListWellnessLabel;//Home>Departments>sol taraf Wellness yazısı

    @FindBy(xpath = "//*[text()='Dental Care']")
    public WebElement departmentsListDentalCareLabel;//Home>Departments>sol taraf dental Care yazısı

    @FindBy(xpath = "(//*[text()='Vaccinations'])[3]")
    public WebElement departmentsListVaccinationsLabel;//Home>Departments>sol taraf Vaccinations yazısı

    @FindBy(xpath = "//img[@class='img-fluid']")
    public WebElement totalDepartmentsImage;//Home>Departments>toplam resim sayısı

    @FindBy(xpath = "//(img[@class='img-fluid'])[1]")
    public WebElement wellnessImage;//Home>Departments>wellness resim

    @FindBy(xpath = "(//img[@class='img-fluid'])[2]")
    public WebElement dentalCareImage;//Home>Departments> dentalCare resim

    @FindBy(xpath = "(//h1[text()=' Wellness'])[1]")
    public WebElement wellnessDepartmentText;//Home>Departments> Wellness> baslık text

    @FindBy(xpath = "(//h1[text()=' Dental Care'])[1]")
    public WebElement dentalCareDepartmentText;//Home>Departments> DentalCare> baslık text

    @FindBy(xpath = "//*[@id=\"page\"]/main/div[1]/div/h1")
    public WebElement anaesthesiaDepartmentText; // Home / Departments / Anaesthesia baslik text

    @FindBy(xpath = "//*[@id=\"page\"]/main/div[1]/div")
    public WebElement dermatologyDepartmentText; // Home / Departments / Dermatology baslik text

    @FindBy(xpath = "//*[@id=\"page\"]/main/div[1]/div/h1")
    public WebElement diagnosticDepartmentText; // Home / Departments / Diagnostic baslik text

    @FindBy (xpath = "//*[text()='Departments of LoyalFriendCare']")
    public WebElement departmentsOfLFCText; // Homepage>> Departments Button / Department of LFC Text

    @FindBy (xpath = "//label[@class='container_check']//a[normalize-space()='Wellness']")
    public WebElement departmentsWellnessButton; // Homepage>> Departments Button / Wellness Button

    @FindBy(xpath = "//*[text()='Beds Departments']")
    public WebElement bedsDepartmentsText;  // Homepage>> Departments Button / Wellness Button/Beds Departments text

    @FindBy(xpath = "//img[@alt='Wellness Room']")
    public WebElement wellnesRoomImage; // Homepage>> Departments Button / Wellness Button/Wellness Room image

    @FindBy(xpath = "(//h1[text()='Wellness Room'])[2]")
    public WebElement wellnessRoomText; // Homepage>> Departments Button / Wellness Button/Wellness Room image / Wellness Room Text

    @FindBy(xpath = "//a[text()= 'Boarding']")
    public WebElement boardingText; // Homepage >> Departments Button / Boarding Text Link/

    @FindBy(xpath = "//img[@alt='Boarding Room']")
    public WebElement boardingRoomImage; // Homepage>> Departments Button / Boarding Text Link/ Boarding Room Image

    @FindBy(xpath = "//a[text()= 'Pain Control']")
    public WebElement painControlText; // Homepage >> Departments Button / Pain Control Text Link/

    @FindBy(xpath = "//img[@alt='Pain Control']")
    public WebElement painControlImage; // Homepage>> Departments Button / Pain Control Text Link/ Pain Control Image

    @FindBy(xpath = "(//li[*=''])[1]")
    public WebElement yatakliOdaSorumluDoktorYazisi;  // Homepage>> Departments Button / Wellness Button/Wellness Room image /
                                                        // Wellness Room Text/  yataklı oda sorumlu doktor yazısı

    @FindBy(xpath = "(//li[*=''])[2]")
    public WebElement yatakliOdaIlgiliDepartmanYazisi;  // Homepage>> Departments Button / Wellness Button/Wellness Room image /
                                                        // Wellness Room Text/  yataklı oda ilgili departman yazısı

    @FindBy(xpath = "(//li[*=''])[3]")
    public WebElement yatakliOdaIlgiliIlacYazisi;  // Homepage>> Departments Button / Wellness Button/Wellness Room image /
                                                         // Wellness Room Text/  yataklı oda ilgili ilac  yazısı

    @FindBy(xpath = "(//li[*=''])[4]")
    public WebElement yatakliOdaUcretBilgiYazisi;  // Homepage>> Departments Button / Wellness Button/Wellness Room image /
                                                            // Wellness Room Text/  yataklı oda ücrte bilgi yazısı













}
