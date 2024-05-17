package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DepartmentsPage {

    public DepartmentsPage() {PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Departments of LoyalFriendCare']")
    public WebElement departmentsOfLFCText; // Homepage>> Departments Button / Department of LFC Text

    @FindBy (xpath = "//label[@class='container_check']//a[normalize-space()='Wellness']")
    public WebElement departmentsWellnessButton; // Homepage>> Departments Button / Wellness Button



}
