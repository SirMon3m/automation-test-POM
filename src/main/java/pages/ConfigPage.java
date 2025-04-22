package pages;

import base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfigPage extends BaseTest {


    private WebDriver driver;

    private By navButton = By.cssSelector("button.cmp-contentnavigation__list-link[data-anchor='#x']");
    private By ModelButton =By.cssSelector("a.cmp-modelcard__con-link[href=\"https://configure.bmw-egypt.com/en_EG/configure/G06/41EXMPERFORMANCE\"]");
   


    public ConfigPage (WebDriver driver){

        this.driver = driver;

    }

    public void PressNav(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(navButton)).click();

    }
    public void PressModel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement modelElement = wait.until(ExpectedConditions.presenceOfElementLocated(ModelButton));

        // Scroll to element, then scroll up a little to avoid sticky header overlap
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({behavior: 'instant', block: 'start'});", modelElement);


        // Small extra scroll to make sure it's not hidden


        wait.until(ExpectedConditions.elementToBeClickable(modelElement)).click();
    }



    }






