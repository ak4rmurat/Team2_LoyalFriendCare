package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPage {

    public AdminDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[normalize-space()='admin01']")
    public WebElement adminLoginButton; // Header / admin01 butonu

    @FindBy(xpath = "//span[@class='bg-primary icon-thumbnail']")
    public WebElement dashBoardMenu; // Admin Dashboard Menu

    @FindBy(xpath = "//span[normalize-space()='Departments']")
    public WebElement departmentsButton; // Admin Dashboard Menu >> Departments

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Categories'][normalize-space()='Departments']")
    public WebElement departmentsDepartmentsButton; // Admin Dashboard >> Departments >> Departments

    @FindBy(xpath = "//a[normalize-space()='Create Departments']")
    public WebElement createDepartmentsButton; // Admin Dashboard >> Departments >> Create Departments

    @FindBy(xpath = "//span[normalize-space()='Doctors']")
    public WebElement doctorsButton; // Admin Dashboard >> Doctors

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Clients']")
    public WebElement doctorsDoctorsButton; // Admin Dashboard >> Doctors >> Doctors

    @FindBy(xpath = "//a[normalize-space()='Create Doctors']")
    public WebElement createDoctorsButton; // Admin Dashboard >> Doctors >> Create Doctors

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Medicines']")
    public WebElement medicinesButton; // Admin Dashboard >> Medicines

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Instagrams']")
    public WebElement medicinesMedicinesButton; // Admin Dashboard >> Medicines >> Medicines

    @FindBy(xpath = "//a[normalize-space()='Create Medicines']")
    public WebElement createMedicinesButton; // Admin Dashboard >> Medicines >> Create Medicines

    @FindBy(xpath = "//span[normalize-space()='Vaccinations']")
    public WebElement vaccinationsButton; // Admin Dashboard >> Vaccinations

    @FindBy(xpath = "//span[normalize-space()='Roles']")
    public WebElement rolesButton; // Admin Dashboard >> Roles

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Roles']")
    public WebElement rolesRolesButton; // Admin Dashboard >> Roles >> Roles

    @FindBy(xpath = "//a[normalize-space()='Create Role']")
    public WebElement createRolesButton; // Admin Dashboard >> Roles >> Create Roles

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Users']")
    public WebElement usersButton; // Admin Dashboard >> Users

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Users']")
    public WebElement usersUsersButton; // Admin Dashboard >> Users >> Users

    @FindBy(xpath = "//a[normalize-space()='Create User']")
    public WebElement createUsersButton; // Admin Dashboard >> Users >> Create Users

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Bed managers']")
    public WebElement bedManagersButton; // Admin Dashboard >> Bed Managers

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Posts']")
    public WebElement bedManagersBedManagersButton; // Admin Dashboard >> Bed Managers >> Bed Managers

    @FindBy(xpath = "//a[normalize-space()='Create Bed managers']")
    public WebElement createBedManagersButton; // Admin Dashboard >> Bed Managers >> Create Bed Managers

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Settings']")
    public WebElement settingsButton; // Admin Dashboard Menu >> Settings

    @FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//div[1]//div[1]//h3[1]//span[1]")
    public WebElement youtubeSettingsInfo;  // Admin Dashboard Menu >> Settings >> youtube bilgisi




























}
