package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {



    private WebDriver driver ; //private because we dont want to use it anywhere else


    private By usernameLogin = By.id("user"); //accessing the username field
    private By passwordLogin = By.id("pass"); //accessing the password field
    private By buttonLogin = By.id("button"); //accessing the login button


}
