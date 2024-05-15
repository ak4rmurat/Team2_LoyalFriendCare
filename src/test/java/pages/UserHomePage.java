package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Wellness']")
    public WebElement Welnessimage;                                                //HomePage / Body / Departmens / Wellness


    @FindBy(xpath = "//*[@alt='Vaccinations']")
    public WebElement Vaccinationsimage;                                            //HomePage  / Body / Departmesn / Vaccinations


    @FindBy(xpath = "//*[@alt='Dr. Alejandro Martinez']")
    public WebElement DrAlejandRoMartinesimage;                                     //HomePage / Body / Doctors / DrAlejandRo

    @FindBy(xpath = "//*[@alt='Dr. Olivia Bennett']")
    public WebElement DrOliviaBennetimage;                                          //HomePage / Body / Doctors / DrOlivaBennet

    @FindBy(xpath = "//*[@alt='Rabies Vaccine']")
    public WebElement RabiesVaccinationsimage;                                       //HomePage / Body / VaccinationsForPets / RabbiesVaccinations

    @FindBy(xpath = "//*[@alt='Bordetella (Kennel Cough) Vaccine']")
    public WebElement Bordetellaimage;                                                //HomePage / Body / VaccinationsForPets / Bordetella



}
