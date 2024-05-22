package utilities;

import org.testng.annotations.AfterMethod;

public class TestBaseCross {

    @AfterMethod
    public void tearDown(){

        Driver.quitDriver();
    }
}
