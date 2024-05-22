package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

import javax.swing.*;

import static utilities.Driver.driver;

public class US_025 extends TestBaseCross {



    @Test
    public void TC_2501(){

        UserHomePage userHomePage = new UserHomePage();
        AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
        Actions actions=new Actions(driver);


        // 1 - Kayitli Kullanici hedef Url ile Anasayfaya gider.

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());


        // 2 - Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.

        userHomePage.signInButton.click();


        // 3 - Admin Kayitli Kullanici Adi'ni ve Password'unu girerek sign in butonuna tiklar.

        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("adminMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        userHomePage.loginButton.click();


        // 4 - Anasayfanin goruntulendigini gorur ve Header bolumundeki
        //     Admin Kullanici Adi'nin oldugu butona tiklayarak Admin dashboard'a ulasir.

        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isEnabled());
        adminDashboardPage.adminLoginButton.click();


        // 5 - Sol acilir menuden Bed Managers tiklanir ve alt menulerin aktif ve dogru calistiklari goruntulenir.

        adminDashboardPage.dashBoardMenu.click();
        ReusableMethods.wait(2);


        // 6 - Alt menude Bed Managers tiklanarak var olan yatakli oda sayisi ve yatakli odalar goruntulenir.

        adminDashboardPage.bedManagersButton.click();
        adminDashboardPage.bedManagersBedManagersButton.click();


        // 7 - Yeni oda olusturmak icin "Add Bed managers" butonuna tiklanir,
        // Bed Managers Title, Bed Managers, Bed Doctor, Bed Medicines, Price
        // ogeleri doldurularak "Bed managers save" butonuna tiklar.

        adminDashboardPage.addBedManagersButton.click();
        adminDashboardPage.bedManagersTitleButton.sendKeys("Deneme");


        adminDashboardPage.bedManagersDropdownMenu.click();
        adminDashboardPage.bedManagersDermatology.click();
        ReusableMethods.wait(2);


        adminDashboardPage.createdDoctorDropdownMenu.click();
        adminDashboardPage.drOliviaBennet.click();
        ReusableMethods.wait(2);

        adminDashboardPage.createdMedicinesDropdownMenu.click();
        actions.sendKeys(Keys.ARROW_DOWN).click();


        adminDashboardPage.bedManagersPriceDropdownMenu.sendKeys("5");

        ReusableMethods.wait(2);

        adminDashboardPage.bedManagersSaveButton.click();
        ReusableMethods.wait(1);


        // 8 - Acilan sayfada"Edit" butonuna tiklanarak ilgili sayfaya gidilir ve
        //     olusturulan odanin bilgileri duzenlenir, "Delete" butonu ile oda silinebilir.

        adminDashboardPage.bedManagersEditButton.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();

        adminDashboardPage.bedManagersDeleteButton.click();



        ReusableMethods.wait(2);



    }
}
