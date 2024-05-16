package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Doctors']")
     public WebElement doctorsDropDown; //HomePage>>Header>>DoctorsDropDown

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

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Home']")
    public WebElement homeButton; //HomePage>>Header>>HomeButton

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='About Us']")
    public WebElement aboutUsButton; //HomePage>>Header>>AboutUsButton

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Departments']")
    public WebElement departmentsDropDown; //HomePage>>Header>>DepartmentsDropDown

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Medicines']")
    public WebElement medicinesDropDown; //HomePage>>Header>>MedicinesDropDown

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Vaccinations']")
    public WebElement vaccinationsDropDown; //HomePage>>Header>>VaccinationsDropDown

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    public WebElement signInButton; //HomePage>>Header>>SignInButton

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    public WebElement signUpButton; //HomePage>>Header>>SignUpButton

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTexBoxForget; //HomePage>>Header>>SignInButton>>Forgot Password

    @FindBy(id ="email") // Homepage>> SignInButton / e_mail Text Box
    public WebElement emailTextBox;

    @FindBy(id="password") // Homepage>> SignInButton / Password Text Box
    public WebElement passwordTextBox;

    @FindBy (xpath = "//label[@for='checkbox1']") // Homepage>> SignInButton / Remember Me CheckBox
    public WebElement rememberMeCheckBox;

   @FindBy (xpath = "//a[@class='text-info small']") // Homepage>> SignInButton / Forgot Password Button
   public WebElement forgotPasswordButton;

   @FindBy (css = "button[type='submit']") // Homepage>> SignInButton /Login Button
   public WebElement loginButton;

   @FindBy(id ="name") // Homepage>> SignUpButton / User Name Text Box
   public WebElement userNameTextBox;

   @FindBy (xpath = "//input[@class='form-control'] ") // Homepage>> SignUpButton / e_mail Text Box
   public WebElement emailAddressTextBox;

   @FindBy (xpath = "//input[@id='password'] ") // Homepage>> SignUpButton / Password Text Box
   public WebElement newpasswordTextBox;

   @FindBy (id = "password-confirm") // Homepage>> SignUpButton / Password Confirm Tex Box
   public WebElement passwordConfirmTextBox;

   @FindBy (xpath = "//button[@type='submit']") // Homepage>> SignUpButton / Sign Up Button
   public WebElement signUpKayitButton;

   @FindBy(xpath = "//*[text()='Wellness']")
   public WebElement welnessImage;                                                //HomePage / Body / Departmens / Wellness

   @FindBy(xpath = "//*[@alt='Vaccinations']")
   public WebElement vaccinationsImage;                                            //HomePage  / Body / Departmesn / Vaccinations

   @FindBy(xpath = "//*[@alt='Dr. Alejandro Martinez']")
   public WebElement drAlejandRoMartinesimage;                                     //HomePage / Body / Doctors / DrAlejandRo

   @FindBy(xpath = "//*[@alt='Dr. Olivia Bennett']")
   public WebElement drOliviaBennetImage;                                          //HomePage / Body / Doctors / DrOlivaBennet

   @FindBy(xpath = "//*[@alt='Rabies Vaccine']")
   public WebElement rabiesVaccinationsImage;                                       //HomePage / Body / VaccinationsForPets / RabbiesVaccinations

   @FindBy(xpath = "//*[@alt='Bordetella (Kennel Cough) Vaccine']")
   public WebElement bordetellaImage;                                                //HomePage / Body / VaccinationsForPets / Bordetella

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendPasswordResetLink; //HomePage>>Header>>SignInButton>>Forgot Password

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement resetPasswordSuccess; //HomePage>>Header>>SignInButton>>Forgot Password

}
