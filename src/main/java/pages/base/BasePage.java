package pages.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to a specific URL.
     */
    public void goToUrl(String url){
        driver.get(url);
    }


    /**
     * Waits for the visibility of an element in the DOM model.
     */
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /**
     * Check is auth frame is visible
     */
    public void isAuthWidgetPresent(){
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
}
