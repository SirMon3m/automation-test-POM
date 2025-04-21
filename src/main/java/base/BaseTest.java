package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver  ;


    @BeforeMethod
    public void setup(){

        driver = new ChromeDriver(); //launches new Chrome window

        driver.manage().window().maximize(); //maximizing the browser window

        driver.get("https://www.bmw-egypt.com/en/configure.html"); // the tested website url



    }
    @AfterMethod

    public void tearDown(){

        if(driver != null){

//            driver.quit();
        }
    }


}
