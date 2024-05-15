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
    public WebElement imageRabbiesVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[2]")
    public WebElement imageDHPPVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[3]")
    public WebElement imageFelineLeukemiaVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[4]")
    public WebElement imageFelineImmunodeficiencyVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[5]")
    public WebElement imageBordetellaVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[6]")
    public WebElement imageFelinePanleukopeniaVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[7]")
    public WebElement imageFelineHerpesvirusVaccine; //  Home >> VacciantionsPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[8]")
    public WebElement imageSurgicalProcedureVaccine; //  Home >> VacciantionsPage





}
