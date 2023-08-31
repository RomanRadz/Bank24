package common;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonActions {
	
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM){
            case "CHROME_WINDOWS" :
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\udemy-course\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "MOZILLA_WINDOWS" :
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\udemy-course\\src\\main\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assertions.fail("INCORRECT BROWSER NAME" + BROWSER_AND_PLATFORM);
                }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;

}
}
