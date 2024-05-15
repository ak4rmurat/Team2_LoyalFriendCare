package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Home']")
    public WebElement homeButton; //HomePage>>Header>>HomeButton

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='About Us']")
    public WebElement aboutUsButton; //HomePage>>Header>>AboutUsButton

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Departments']")
    public WebElement departmentsDropDown; //HomePage>>Header>>DepartmentsDropDown

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Doctors']")
    public WebElement doctorsDropDown; //HomePage>>Header>>DoctorsDropDown

    @FindBy(xpath = "//nav[@id='menu']//a[normalize-space()='Medicines']")
    public WebElement medicinesDropDown; //HomePage>>Header>>MedicinesDropDown

    @FindBy(xpath = "///nav[@id='menu']//a[normalize-space()='Vaccinations']")
    public WebElement vaccinationsDropDown; //HomePage>>Header>>VaccinationsDropDown

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    public WebElement signInButton; //HomePage>>Header>>SignInButton

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    public WebElement signUpButton; //HomePage>>Header>>SignUpButton
























    
    @FindBy(id ="email") // Homepage>> SignInButton / e_mail Text Box
    public WebElement emailTextBox;

    @FindBy(id="password") // Homepage>> SignInButton / Password Text Box
    public WebElement passwordTextBox;

    @FindBy (xpath = "//label[@for='checkbox1']") // Homepage>> SignInButton / Remember Me CheckBox
    public WebElement rememberMeCheckBox;

    @FindBy (className = "text-info small") // Homepage>> SignInButton / Forgot Password Button
    public WebElement forgotPasswordButton;

    @FindBy (className ="btn btn-primary btn-cons m-t-10") // Homepage>> SignInButton /Login Button
    public WebElement loginButton;

    @FindBy(id ="name") // Homepage>> SignUpButton / User Name Text Box
    public WebElement userNameTextBox;

    @FindBy (xpath = "//input[@class='form-control'] ") // Homepage>> SignUpButton / e_mail Text Box
    public WebElement emailAddressTextBox;

    @FindBy (xpath = "//input[@id='password'] ") // Homepage>> SignUpButton / Password Text Box
    public WebElement newpasswordTextBox;

    @FindBy (id = "password-confirm") // Homepage>> SignUpButton / Password Confirm Tex Box
    public WebElement passwordConfirmTextBox;

    @FindBy (className = "btn btn-primary btn-cons m-t-10") // Homepage>> SignUpButton / Sign Up Button
    public WebElement signUpButton;





}
