package tests.loans.positive;

import org.junit.jupiter.api.Test;
import pages.loans.CarLoansPage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.MOBILE_PAYMENT_PHONE_NUMBER;
import static constants.Constant.Urls.CAR_LOANS_URL;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void checkMinimumCarPrice (){
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("150000")
                .enterPrepaidAmount("15000")
                .clickButtonSubmitAnApplication();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void selectAgreementsTabInPublicSession(){
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();

    }
}

