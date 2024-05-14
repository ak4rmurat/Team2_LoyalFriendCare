package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminDashboardPage {

    public adminDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
}
