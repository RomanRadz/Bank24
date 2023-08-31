package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.telecommunications.MobilePhoneReplenishmentPage;

public class CarLoansPage extends BasePage {
    public CarLoansPage(WebDriver driver) {

        super(driver);
    }

    public final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");

    public final By tabOrder = By.xpath("//div[contains(text(), 'Order')]");
    public final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    public final By prepaidAmount = By.xpath("//input[@data-qa-node='prepaid']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By buttonSubmitToCard = By.xpath("//button[contains(text(), 'Submit an application')]");


    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreements).click();
        return this;
    }

    public CarLoansPage selectOrderTab() {
        driver.findElement(tabOrder).click();
        return this;
    }

    /**
     * Enter amount
     *
     * @param amount
     */
    public CarLoansPage enterAmount(String amount) {
        driver.findElement(inputAmount).clear();
//        driver.findElement(inputAmount).sendKeys(Keys.CONTROL + "a");
//        driver.findElement(inputAmount).sendKeys(Keys.DELETE);
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter prepaid amount
     *
     * @param prepamount
     */
    public CarLoansPage enterPrepaidAmount (String prepamount){
        driver.findElement(prepaidAmount).clear();
        driver.findElement(prepaidAmount).sendKeys(Keys.CONTROL + "a");
        driver.findElement(prepaidAmount).sendKeys(Keys.DELETE);
        driver.findElement(prepaidAmount).sendKeys(prepamount);
        return this;
    }

    /**
     * Enter phone number
     *
     * @param phoneNumber
     */
    public CarLoansPage enterPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    /**
     * Click on button 'Submit to card'
     * @return MobilePhoneReplenishmentPage
     * */
    public CarLoansPage clickButtonSubmitAnApplication(){
        driver.findElement(buttonSubmitToCard).click();
        return this;
    }


}

