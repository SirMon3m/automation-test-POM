package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

 @Test
    public void testValidLogin(){


        LoginPage logintest = new LoginPage(driver);

        logintest.enterUsername("admin@yourstore.com");
        logintest.enterPassword("admin");
        logintest.pressLogin();

    }
}
