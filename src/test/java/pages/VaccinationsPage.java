package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VaccinationsPage {

    public VaccinationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement rabbiesVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[2]")
    public WebElement dHPPVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[3]")
    public WebElement felineLeukemiaVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[4]")
    public WebElement felineImmunodeficiencyVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[5]")
    public WebElement bordetellaVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[6]")
    public WebElement felinePanleukopeniaVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[7]")
    public WebElement felineHerpesvirusVaccineImage; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[8]")
    public WebElement surgicalProcedureVaccineImage; //  Home >> VacciantionsPage



    @FindBy(xpath = "//*[text()='Vaccinations of LoyalFriendCare']")
    public WebElement vaccinationsimage;          // Goruntulenen Vaccinations  sayfa'nın sol tarafında bulunan Ası secenekleri goruntulenir.

    @FindBy(xpath = "//h1[text()=' Rabies Vaccine']")
    public WebElement rabbiesVaccineText;       //  Home > VacciantionsPage> Rabies Vaccine baslık text

    @FindBy(xpath = "//h1[text()=' Bordetella (Kennel Cough) Vaccine']")
    public WebElement  bordetellaVaccineText;   // Home > VacciantionsPage> Bordetella (Kennel Cough) Vaccine baslık text

    @FindBy(xpath = "//h1[text()='Vaccinations']")
    public WebElement  vaccinationsH1Title; //Home > VacciantionsPage>yeşil alan h1 başlık




}
