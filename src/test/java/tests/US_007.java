package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_007 {
    UserHomePage userHomePage = new UserHomePage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String emailAdress = faker.internet().emailAddress();
    String password = "Team2.13555";
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void TC_001() {
        // 1 - Ziyaretci hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));


        // 2 - "Sign Up" butonuna tiklar
        userHomePage.signUpButton.click();

        // 3 - "Name"," E-Mail Address", "Password" ve "Confirm Password" bolumlerine kriterlere uygun bilgileri girer
        userHomePage.userNameKayitTextBox.sendKeys(name);
        userHomePage.emailAddressKayitTextBox.sendKeys(emailAdress);
        userHomePage.newpasswordKayitTextBox.sendKeys(password);
        userHomePage.passwordConfirmKayitTextBox.sendKeys(password);

        // 4 - "Sign Up" butonuna tiklar
        userHomePage.signUpKayitButton.click();
        // 5 - Anasayfada "Sign Out" butonu goruntuler
        Assert.assertTrue(userHomePage.signOutButton.isDisplayed());

    }

    @Test
    public void TC_002(){
       // 1 - Ziyaretci hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       // 2 - "Sign In" butonuna tiklar
        userHomePage.signInButton.click();
       // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
       // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
       // 5 - Acilan sayfada bulunan "Sign out" butonuna tiklar.
        userHomePage.signOutButton.click();
    }
    @Test
    public void TC_003(){
        // 1 - Ziyaretci hedef URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // 2 - "Sign In" butonuna tiklar
        userHomePage.signInButton.click();
        // 3 - " Sıgn In" ve "Password" bolumlerine kayitli kullanici bilgilerini girer
        userHomePage.emailTextBox.sendKeys(ConfigReader.getProperty("userMail"));
        userHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        // 4 - "Sign In" butonuna tiklar
        userHomePage.loginButton.click();
        ReusableMethods.wait(2);
        // 5 - Acilan sayfada bulunan "Sign out" butonuna tiklar.
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(userHomePage.signOutButton).perform();
    }
}
