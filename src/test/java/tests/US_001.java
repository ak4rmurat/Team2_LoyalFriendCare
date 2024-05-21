package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001 {
    @Test
    public void TC01(){
        UserHomePage userHomePage = new UserHomePage();

        //Ziyaretçi, belirtilen URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Anasayfa'nin goruntulendiği dogrulanır
        Assert.assertTrue(userHomePage.loyalFriendCareHeaderLogo.isDisplayed());
        Driver.quitDriver();

    }


}
