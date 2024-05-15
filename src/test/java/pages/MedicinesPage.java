package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedicinesPage {

    public MedicinesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement imageRimadylMedicine; //  Home >> MedicinesPage

    @FindBy(xpath = "(//img[@class='img-fluid'])[2]")
    public WebElement imageRevolutionlMedicine; //  Home >> MedicinesPage


}
