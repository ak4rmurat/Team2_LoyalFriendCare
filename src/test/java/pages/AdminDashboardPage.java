package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPage {

    public AdminDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
}
