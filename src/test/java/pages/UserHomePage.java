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

    @FindBy(xpath = "//div[@class='col-lg-3 col-md-6 col-sm-6']//img[@alt='LoyalFriendCare']")
    public WebElement loyalFriendCareLogo; // Homepage/footer

    @FindBy(xpath = "//*[@id=\"page\"]/footer/div/div[1]/div[2]/h3")
    public WebElement departmentsFooter; // Homepage/footer/departments

    @FindBy(xpath = "//*[@id=\"collapse_ft_2\"]/ul/li[1]/a")
    public WebElement wellnessFooter; // Homepage/footer/wellness

    @FindBy(xpath = "//*[@id=\"collapse_ft_2\"]/ul/li[2]/a")
    public WebElement dentalCareFooter; // Homepage/footer/dental care

    @FindBy(xpath = "//*[@id=\"collapse_ft_2\"]/ul/li[3]/a")
    public WebElement anaesthesiaFooter; // Homepage/footer/Anaesthesia

    @FindBy(xpath = "//*[@id=\"collapse_ft_2\"]/ul/li[4]/a")
    public WebElement dermatologyFooter; // Homepage/footer/Dermatology

    @FindBy(xpath = "//*[@id=\"collapse_ft_2\"]/ul/li[5]/a")
    public WebElement diagnosticsFooter; // Homepage/footer/diagnostics


    @FindBy(xpath = "//*[@id=\"page\"]/footer/div/div[1]/div[3]/h3")
    public WebElement followUsFooter; // Homepage/footer/followUs

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

    @FindBy(xpath = "//*[@id=\"page\"]/footer/div/div[1]/div[4]/h3")
    public WebElement contactsFooter; // Homepage/footer/contacts

    @FindBy(xpath = "//*[@id=\"collapse_ft_3\"]/ul/li[1]")
    public WebElement adresFooter; // Homepage/footer/adres

    @FindBy(xpath = "//*[@id=\"collapse_ft_3\"]/ul/li[2]")
    public WebElement telefonFooter; // Homepage/footer/telefon

    @FindBy(xpath = "//*[@id=\"collapse_ft_3\"]/ul/li[3]")
    public WebElement emailFooter; // Homepage/footer/email

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
   public WebElement userNameKayitTextBox;

   @FindBy (xpath = "//input[@id='email']") // Homepage>> SignUpButton / e_mail Text Box
   public WebElement emailAddressKayitTextBox;

   @FindBy (xpath = "//input[@id='password']") // Homepage>> SignUpButton / Password Text Box
   public WebElement newpasswordKayitTextBox;

   @FindBy (id = "password-confirm") // Homepage>> SignUpButton / Password Confirm Tex Box
   public WebElement passwordConfirmKayitTextBox;

   @FindBy (xpath = "//button[@type='submit']")
   public WebElement signUpKayitButton;     // Homepage>> SignUpButton / Sign Up Button

   @FindBy(xpath = "//*[text()='Wellness']")
   public WebElement welnessImage;         //HomePage / Body / Departmens / Wellness

   @FindBy(xpath = "//*[@alt='Vaccinations']")
   public WebElement vaccinationsImage;        //HomePage  / Body / Departmesn / Vaccinations

   @FindBy(xpath = "//*[@alt='Dr. Alejandro Martinez']")
   public WebElement drAlejandRoMartinesimage;       //HomePage / Body / Doctors / DrAlejandRo

   @FindBy(xpath = "//*[@alt='Dr. Olivia Bennett']")
   public WebElement drOliviaBennetImage;         //HomePage / Body / Doctors / DrOlivaBennet

   @FindBy(xpath = "//*[@alt='Rabies Vaccine']")
   public WebElement rabiesVaccinationsImage;       //HomePage / Body / VaccinationsForPets / RabbiesVaccinations

   @FindBy(xpath = "//*[@alt='Bordetella (Kennel Cough) Vaccine']")
   public WebElement bordetellaImage;     //HomePage / Body / VaccinationsForPets / Bordetella

    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    public WebElement signOutButton; // Homepage header / Sign Out Button

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendPasswordResetLink; //HomePage >> Header >> SignInButton >> Forgot Password

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement resetPasswordSuccess; //HomePage >> Header >> SignInButton >> Forgot Password

    @FindBy(xpath = "//a[normalize-space()='admin01']")
    public WebElement adminDashboardButton; //HomePage >> Header >> Admin Dashboard Button

    @FindBy(xpath = "//*[text()='Dental Care']")
    public WebElement dentalCareImage;  //HomePage / Body / Departmens / Dental care

    @FindBy(xpath ="(//*[text()='Departments'])[2]" )
    public WebElement greenDepartmentsLink; //Home>Body>yeşil departments linki

    @FindBy(xpath ="(//*[text()='Doctors'])[3]" )
    public WebElement greenDoctorsLink; //Home>Body>yeşil doctors linki

    @FindBy(xpath ="(//*[text()='Vaccinations'])[4]" )
    public WebElement greenVaccinationsLink;  //Home>Body>yeşil vaccinations linki

    @FindBy(xpath = "(//img[@alt='LoyalFriendCare'])[2]")
    public WebElement loyalFriendCareHeaderLogo;

    @FindBy(xpath = "//span[@class='invalid-feedback']")
    public WebElement hataliMailGirisi; // Hatali mail girisi text

    @FindBy(xpath ="(//*[text()='Departments'])[2]" ) 
    public WebElement greenDepartments1Link; //Home>Body>yeşil departments linki
  
    @FindBy(xpath = "//div[@class='ml-4 text-lg text-gray-500 uppercase tracking-wider']")
    public WebElement adminOlmayanKullaniciUyarisi;

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/en/login']")
    public WebElement alternatifSignInButton; // User HomePage


}
