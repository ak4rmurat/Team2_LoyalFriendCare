package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorsPage {

    public DoctorsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Doctors/miya-hansen']//img[@class='img-fluid']")
    public WebElement doctorMarcusImage; // HomePage >> Doctors >> Dr.MarcusImage

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Doctors/pet-band']//img[@class='img-fluid']")
    public WebElement doctorsIssabella; // HomePage >> Doctors >> Dr.Issabella

    @FindBy(xpath = "//h6[normalize-space()='Doctors of LoyalFriendCare']")
    public WebElement doctorsOfLoyalFriendCareText; // HomePage >> Doctors >> Doctors Of Loyal Friend Care Text

    @FindBy(xpath = "//label[@class='container_check']//a[normalize-space()='Dr. Sophia Kim']")
    public WebElement drSophiaKim; // HomePage >> Doctors >> Dr.Sophia

    @FindBy(xpath = "//h5[normalize-space()='Leave a Review']")
    public WebElement leaveAReviewText; // HomePage >> Doctors >> Leave A Review Text

    @FindBy(xpath = "//div[@class='form-group col-md-12']//div[@class='nice-select wide']")
    public WebElement ratingDropDownMenu; // HomePage >> Doctors >> Rating

    @FindBy(xpath = "//li[normalize-space()='5']")
    public WebElement ratingDropDownMenu5; // HomePage >> Doctors >> Rating "5"

    @FindBy(xpath = "//input[@id='submit-review']")
    public WebElement submitButton; // HomePage >> Doctors >> Submit Button

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successText; // HomePage >> Doctors >> Success Text

}
