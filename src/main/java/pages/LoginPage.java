package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {



    private WebDriver driver ; //private because we don't want to use it anywhere else


    private By usernameLogin = By.id("user"); //accessing the username field
    private By passwordLogin = By.id("pass"); //accessing the password field
    private By buttonLogin = By.id("button"); //accessing the login button

                               //Action functions


    public  LoginPage (WebDriver driver){

        this.driver = driver;
    }
    public void enterUsername(String username){
        driver.findElement(usernameLogin).clear(); //clearing the login field from any past texts
        driver.findElement(usernameLogin).sendKeys(username); //entering username

    }
    public void enterPassword(String password){
        driver.findElement(passwordLogin).clear(); //clearing the password field from any texts
        driver.findElement(passwordLogin).sendKeys(password); // entering password
    }

    public void pressLogin (){

        driver.findElement(buttonLogin).click();
    }


}
