package pages.telecommunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {

        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToCard = By.xpath("//button[@data-qa-node='submit']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");

    /**
     * Click on button 'My wallet'
     * @return MobilePhoneReplenishmentPage
     * */
    public MobilePhoneReplenishmentPage clickButtonWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter phone number
     * @param phoneNumber
     * */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String phoneNumber){
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    /**
     * Enter amount
     * @param amount
     * */
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).clear();
        driver.findElement(inputAmount).sendKeys(Keys.CONTROL + "a");
        driver.findElement(inputAmount).sendKeys(Keys.DELETE);
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter card from
     * @param card
     * */
    public MobilePhoneReplenishmentPage enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     * Enter card exp date
     * @param expDate
     * */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     * Enter card cvv
     * @param cvv
     * */
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    /**
     * Click on button 'Submit to card'
     * @return MobilePhoneReplenishmentPage
     * */
    public MobilePhoneReplenishmentPage clickButtonSubmitToCard(){
        driver.findElement(buttonSubmitToCard).click();
        return this;
    }

    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresent(String text){
        WebElement details = driver.findElement(paymentDetails);
        waitElementIsVisible(details);
        Assertions.assertEquals(text, details.getText());
        return this;
    }

}
