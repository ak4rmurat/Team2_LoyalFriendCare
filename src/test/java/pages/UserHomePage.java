package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fab fa-facebook-square']")
    public WebElement facebookLogo; // Homepage/footer

    @FindBy(xpath = "//i[@class='fab fa-twitter-square']")
    public WebElement twitterLogo; // Homepage/footer

    @FindBy(xpath = "//i[@class='fab fa-youtube-square']")
    public WebElement youtubeLogo; // Homepage/footer

    @FindBy(xpath = "//i[@class='fab fa-pinterest-square']")
    public WebElement pinteresLogo; // Homepage/footer

    @FindBy(xpath = "//i[@class='fab fa-instagram']")
    public WebElement instagramLogo; // Homepage/footer

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-6 col-sm-6']//img[@alt='LoyalFriendCare']")
    public WebElement loyalFriendCareLogo; // Homepage/footer

}
