package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


















    @FindBy(xpath = "//span[@class='title'][normalize-space()='Settings']")
    public WebElement adminDashboardSettingButton; // Admin Dashboard >> Setting

    @FindBy(xpath = "//div[@class='card-title']")
    public WebElement tableRolesText; // Admin Dasboard >> Roles >> Roles

    @FindBy(xpath = "//div[@id='tableWithSearch_info']")
    public WebElement numberOfRolesText; // Admin Dasboard >> Roles >> Roles

    @FindBy(xpath = "//span[text()='Tickets']")
    public WebElement ticketsButton;// Admin Dashboard >> tickets
  
    @FindBy(xpath = "//span[text()='Consultation']")
    public WebElement consultationButton;//Admin Dashboard >> Consultation
  
    @FindBy(xpath = "//a[text()='Consultation']")
    public WebElement consultationAltMenuButton;//Admin Dashboard >> Consultation>> Consultation
  
    @FindBy(xpath = "//div[@class='gallery-item']")
    public List<WebElement> consultationAudioImagesList;//Admin Dashboard >> Consultation>> Consultation>>AudiosResimleri Listesi
  
    @FindBy(xpath = "//h5[text()='consultation']")
    public WebElement consultationTitleH5;//Admin Dashboard >> Consultation>> Consultation>>consultation h5 baslik
  
    @FindBy(xpath = "//div[@class='cover-photo']")
    public WebElement consultationBaslikImage;
  
    @FindBy(xpath = "//a[text()='LoyalFriendCare']")
    public WebElement loyalFriendCareFooterLink;//Admin Dashboard >>Footer>LoyalFriendCare linki,anasayfaya donus
  
    @FindBy(xpath = "//a[@class='pull-left bold text-white fs-14 p-t-10']")
    public List<WebElement> consultationAudioLinksList;//Admin Dashboard >> Consultation>> Consultation>>Audios linkleri Listesi

    //AdminDashboard Pets Adsense DropDown Menusu

  @FindBy(xpath = "//*[@class='bg-primary icon-thumbnail']")
    public WebElement admindasboard;

   @FindBy(xpath = "//*[text()='Pets adsense'][1]")
    public WebElement petsButton;

   @FindBy(xpath = "//a[text()='Pets adsense']")
    public WebElement petManagerPetsButton;

   @FindBy(xpath = "//a[text()='Create Pets adsense']")
    public  WebElement createPetsManagersButton;

   @FindBy(xpath = "//*[@class='select2-selection__rendered'][1]")
    public WebElement createPetsHome;

   @FindBy(xpath = "//*[@class='switchery switchery-default']")
    public WebElement ActivePets;

   @FindBy(xpath = "//*[@title='Code']")
    public WebElement createPetsType;

   @FindBy(xpath = "//*[@role='treeitem'][2]")
    public WebElement createPetsImage;

   @FindBy(xpath = "//a[contains(@class,'btn btn-tag btn-success btn-tag-rounded')]")
    public WebElement departmentsAddDepartmentsButton; //Admin Dashboard >> Admin Dashboard Menu >> Departments >> Departments

    @FindBy(xpath = "//a[normalize-space()='Create Departments']")
    public WebElement departmentCreateDepartments; //Admin Dashboard >> Admin Dashboard Menu >> Departments >> Create Departments

    @FindBy(xpath = "//h3[normalize-space()='New Departments']")
    public WebElement newCreateDepartmentsText;

    @FindBy(xpath = "//div[@id='tableWithSearch_info']")
    public WebElement departmentsAdetText;



   @FindBy(xpath = "//img[@src='https://qa.loyalfriendcare.com/images/6628e613c44309475.jpg']")
    public WebElement adminKullaniciResmi;

   @FindBy(xpath = "//span[text()='Logout']")
    public WebElement adminLogoutButonu;


    @FindBy(xpath = "//div[@id='tableWithSearch_info']")
    public WebElement doctorCountText;

    @FindBy(xpath = "//a[text()='Add Doctors']")
    public  WebElement addDoctorsButton;

    @FindBy(xpath = "//*[text()='Doctors save']")
    public WebElement doctorsSaveButton;

    @FindBy(xpath = "//input[@id='search-table']")
    public WebElement searchDoctorsTextbox;









}
