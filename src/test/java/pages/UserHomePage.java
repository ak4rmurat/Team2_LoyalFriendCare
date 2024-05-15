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

}
