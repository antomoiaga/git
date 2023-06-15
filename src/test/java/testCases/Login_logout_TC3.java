package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import utils.Utils;
public class Login_logout_TC3 extends TestBase {

    @Test()
    public void logging_in_and_out() throws InterruptedException {
        test = extent.createTest("delete items from cart", "Case 2: User is able to delete items from cart")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        utils.waitForElementToBeClickable(HomePage.SignInBtn);
        utils.clickOnButton(HomePage.SignInBtn);
        test.log(Status.INFO, "Click  on Sign In Button(Homepage)");
        logger.info("Click  on Sign In Button(Homepage)");

        utils.waitForElementToBeClickable(SignInPage.EmailField);
        utils.enterText(SignInPage.EmailField, "roni_cost@example.com");

        utils.waitForElementToBeClickable(SignInPage.PassField);
        utils.enterText(SignInPage.PassField, "roni_cost3@example.com");

        Thread.sleep(3000);
        utils.waitForElementToBeClickable(SignInPage.SignInWithEmailAndPassBtn);
        utils.clickOnButton(SignInPage.SignInWithEmailAndPassBtn);
    }

}
