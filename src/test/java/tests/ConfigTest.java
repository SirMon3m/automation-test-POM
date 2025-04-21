package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ConfigPage;
import pages.LoginPage;

@Test
public class ConfigTest extends BaseTest {
public void checkNav() {


    ConfigPage logintest = new ConfigPage(driver);
    logintest.PressNav();
   logintest.PressModel();


}
}
