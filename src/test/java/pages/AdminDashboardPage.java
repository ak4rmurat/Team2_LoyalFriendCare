package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.logging.XMLFormatter;

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

    @FindBy(xpath = "//div[@class='card-title']")
    public WebElement tableMedicinesText; // Admin Dashboard >> Medicines >> Medicines

    @FindBy(xpath = "//div[@id='tableWithSearch_info']")
    public WebElement showingMedicinesNumberText; // Admin Dashboard >> Medicines >> Medicines

    @FindBy(xpath = "//input[@id='Title_en']")
    public WebElement medicinesTitleTextArea; // Admin Dashboard >> Medicines >> Create Medicines

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createMedicinesSaveButton; // Admin Dashboard >> Medicines >> Create Medicines

    @FindBy(xpath = "button[type='submit']")
    public WebElement deleteMedicinesButton; // Admin Dashboard >> Medicines >> Create Medicines

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

    // Admin Dashboard Bed Managers Menusu
    @FindBy(xpath = "//span[@class='title'][normalize-space()='Bed managers']")
    public WebElement bedManagersButton; // Admin Dashboard >> Bed Managers

    @FindBy(xpath = "//a[@href='https://qa.loyalfriendcare.com/Dashboard/Posts']")
    public WebElement bedManagersBedManagersButton; // Admin Dashboard >> Bed Managers >> Bed Managers

    @FindBy(xpath = "//a[normalize-space()='Create Bed managers']")
    public WebElement createBedManagersButton; // Admin Dashboard >> Bed Managers >> Create Bed Managers

    @FindBy(xpath = "//*[@class='btn btn-tag btn-success btn-tag-rounded']")
    public WebElement addBedManagersButton;  // Admin Dashboard >> Bed Managers >> Add Bed Managers Button

    @FindBy(xpath = "//*[@id=\"Title_en\"]")
    public WebElement bedManagersTitleButton;  // Admin Dashboard >> Bed Managers >> Bed Managers Title Button

    @FindBy(xpath = "(//*[@class=\"select2-selection__rendered\"])[1]")
    public WebElement bedManagersDropdownMenu;  // Admin Dashboard >> Bed Managers >> Bed Managers Dropdown Menu

    @FindBy(xpath = "//*[@class=\"select2-results__option select2-results__option--highlighted\"]")
    public WebElement bedManagersDermatology; // Admin Dashboard >> Bed Managers >> Bed Managers >> Dermatology

    @FindBy(xpath = "(//*[@class=\"select2-selection__rendered\"])[2]")
    public WebElement createdDoctorDropdownMenu; // Admin Dashboard >> Bed Managers >> Created Doctors Dropdown Menu

    @FindBy(xpath = "//*[@class=\"select2-results__option select2-results__option--highlighted\"]")
    public WebElement drOliviaBennet;  // Admin Dashboard >> Bed Managers >> Created Doctors >> Dr Olivia Bennet

    @FindBy(xpath = "(//*[@class=\"select2-selection__rendered\"])[3]")
    public WebElement createdMedicinesDropdownMenu; // Admin Dashboard >> Bed Managers >> Created Medicines Dropdown Menu

    @FindBy(xpath = "(//*[@class='form-control'])[5]")
    public WebElement bedManagersPriceDropdownMenu; // Admin Dashboard >> Bed Managers >> Bed Managers Price Dropdown Menu

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement bedManagersSaveButton;  // Admin Dashboard >> Bed Managers >> Bed Managers Save Button

    @FindBy(xpath = "//*[@id=\"tableWithSearch\"]/tbody/tr[1]/td[5]/a/span")
    public WebElement bedManagersEditButton; // Admin Dashboard >> Bed Managers >> Bed Managers Edit Button

    @FindBy(xpath = "//*[@id=\"tableWithSearch\"]/tbody/tr[1]/td[6]/form")
    public WebElement bedManagersDeleteButton; // Admin Dashboard >> Bed Managers >> Bed Managers Delete Button

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Settings']")
    public WebElement settingsButton; // Admin Dashboard Menu >> Settings

    @FindBy(xpath = "(//*[@class=\"text-white no-margin\"])[1]")
    public WebElement welcomeSettingsText; // Admin Dashboard Menu >> Settings  >> Welcome Text

    @FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//div[1]//div[1]//h3[1]//span[1]")
    public WebElement youtubeSettingsInfo;  // Admin Dashboard Menu >> Settings >> youtube bilgisi

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Settings']")
    public WebElement adminDashboardSettingButton; // Admin Dashboard >> Setting

    @FindBy(xpath = "//div[@class='card-title']")
    public WebElement tableRolesText; // Admin Dasboard >> Roles >> Roles

    @FindBy(xpath = "//div[@id='tableWithSearch_info']")
    public WebElement numberOfRolesText; // Admin Dasboard >> Roles >> Roles

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/Dashboard/Messages']")
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

   // Admin Resim
   @FindBy(xpath = "//*[@class=\"thumbnail-wrapper d32 border-5  inline\"]")
    public WebElement adminResim; // Admin Resim Dropdown

    @FindBy(xpath = "(//*[@class=\"dropdown-item\"])[1]")
    public WebElement adminSettings;    // Admin Resim Dropdown >> Settings

    @FindBy(xpath = "(//*[@class=\"dropdown-item\"])[2]")
    public WebElement adminEditProfile;    // Admin Resim Dropdown >> Edit Profile

    @FindBy(xpath = "//*[@class=\"clearfix bg-master-lighter dropdown-item\"]")
    public WebElement adminLogout;    // Admin Resim Dropdown >> Logout

    @FindBy(xpath = "//*[@class=\"fa fa-user\"]")
    public WebElement editProfilePage;  // Admin Resim Dropdown >> Edit Profile

   @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm  btn-rounded m-r-10'])[1]")
    public WebElement createPetsImageEkle;

   @FindBy(xpath = "(//*[@class='form-control '])[3]")
    public WebElement createPetsImageDowloand;

   @FindBy(xpath = "//*[text()='save']")
    public WebElement createPetsSaveButton;

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

    @FindBy(xpath = "//span[normalize-space()='Role Store successfully.']")
    public WebElement roleStoreSuccessfullyAlert; // Admin Dasboard >> Roles >> Create Roles >> Save Button
    // Role Store Successfully Text

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]" +
            "/div[1]/table[1]/tbody[1]/tr[7]/td[4]/form[1]/button[1]")
    public WebElement roleDeleteButton; // Dinamik değildir.

    @FindBy(xpath = "//span[normalize-space()='Role deleted successfully']")
    public WebElement roleDeletedSuccessfullyAlert; // Admin Dasboard >> Roles >> Create Roles >> Save Button
    // Delete Button >> Role Deleted Successfully

    @FindBy(xpath = "//input[@id='name']")
    public WebElement createRolesNameTextArea; // Admin Dasboard >> Roles >> Create Roles

     @FindBy(xpath = "//button[@type='submit']")
    public WebElement createRoleSaveButton;// Admin Dasboard >> Roles >> Create Roles

    @FindBy(xpath = "(//*[text()='Delete'])[3]")
    public WebElement createPetsImageDelete;

    @FindBy(xpath = "//*[@width='32']")
    public WebElement adminButonu;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement getAdminLogoutButonu;

    @FindBy(xpath = "//h2[@class='semi-bold']")
    public WebElement notFound404;

    @FindBy(xpath = "//*[text()='PowerPoint Presentation']")
    public WebElement ppPresentationText;

    @FindBy(xpath = "//th[@aria-label='Edit: activate to sort column ascending']")
    public WebElement doctorsTableEditText; //admin dashboard> doctors> doctors> tablo edit baslıgı

    @FindBy(xpath = "//th[@aria-label='DELETE: activate to sort column ascending']")
    public WebElement doctorsTableDeleteText; //admin dashboard> doctors> doctors> tablo delete baslıgı

    @FindBy(xpath = "//p[normalize-space()='Dr. Alejandro Martinez']")
    public WebElement doctorsNameText; //admin dashboard> doctors> doctors> tablo delete baslıgı

    @FindBy(xpath = "//a[@class='btn btn-tag btn-success btn-tag-rounded']")
    public WebElement doctorsTableAddDoctorsButton; //admin dashboard> doctors> doctors> add doctors buton

    @FindBy(xpath = "//h3[normalize-space()='New Doctors']")
    public WebElement newDoctorsText; //admin dashboard> doctors> create dcotors> new doctor yazisi

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement departmetntsList;

    @FindBy(xpath = "//input[@name='parent_id']")
    public WebElement createDepartmentsBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createDepartmentsDeleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createDepartmentsSaveButton;

    @FindBy(xpath = "//tbody/tr[9]/td[1]")
    public WebElement newDepartments;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement departmentsSuccessDeleteText;

    @FindBy(xpath = "//a[@class='btn btn-complete btn-cons btn-animated from-left fa fa-edit']")
    public WebElement createDepartmentsEditButton;

    @FindBy(xpath = "//h3[contains(text(),'Edit')]")
    public WebElement editDepartmentsEditText;

    @FindBy(xpath = "//input[@name='parent_id']")
    public WebElement editDepartmentsParentsBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editSaveDepartmentsButton;

    @FindBy(xpath = "(//p[@class='bold text-white no-margin fs-10 font-montserrat lh-normal'])[2]")
    public WebElement dashboardAdminText;

    //Admin Dashboard>> Vaccinations Menu
    @FindBy(xpath ="(//span[@class='arrow'])[10]")
    public WebElement vaccinationsAltMenuArrow;//Admin Dashboard>> Vaccinations Menu>>vaccinationsAltMenuArrow

    @FindBy(id = "tableWithSearch_info")
    public WebElement asiSayisiYazisi;//Admin Dashboard>> Vaccinations Menu>>asi Sayisi yazisi

    @FindBy(xpath = "//a[@class='btn btn-tag btn-success btn-tag-rounded']")
    public WebElement addVaccinationsButton;//Admin Dashboard>> Vaccinations Menu>> addVaccinationsButton

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement addVaccinationTitleTextBox;//Admin Dashboard>> Vaccinations Menu>> addVaccinationsButton>>

    @FindBy(xpath = "//*[text()='save']")
    public WebElement addVaccinationSaveButton;//Admin Dashboard>> Vaccinations Menu>> addVaccinationTitleTextBox

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> asiElemanlariListesi;//Admin Dashboard>> Vaccinations Menu>> addVaccinationsButton>>asiElemanlariListesi

    @FindBy(xpath = "(//tbody/tr/td[4])[9]")
    public WebElement asiEditButton;//Admin Dashboard>> Vaccinations Menu>> asiEditButton

    @FindBy(xpath = "//input[@id='button']")
    public WebElement dontChangeImageRadyoButton;//Admin Dashboard>> Vaccinations Menu>> asiEditButton>> dontChangeImageRadyoButton

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement asiDeleteButton;//Admin Dashboard>> Vaccinations Menu>> asiDeleteButton

    @FindBy(xpath = "//input[@id='Title_en']")
    public WebElement doctorsTitleTextBox; //admin dashboard> doctors> create doctors> doctors title textbox

    @FindBy(xpath = "//input[@id='body_en']")
    public WebElement doctorsContentEnglishTextBox; //admin dashboard> doctors> create doctors> doctors content english textbox

    @FindBy(xpath = "//h5[@class='text-white no-margin']")
    public WebElement ourTicketsText; //Admin Dashboard >> Tickets >> Our Tickets

    @FindBy(xpath = "//*[@src='https://qa.loyalfriendcare.com/images/6628e613c44309475.jpg']")
    public WebElement adminLogo; //Admindashboard

    @FindBy(xpath = "//*[@class='pull-left']")
    public WebElement logoutButton; // Admindashboard


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement doctorsSaveeButton; //admin dashboard> doctors> create doctors> doctors save buton

    @FindBy(xpath = "//span[text()='Doctors Store successfully.']")
    public WebElement doctorsStoreSuccessfullyAlert;










}
