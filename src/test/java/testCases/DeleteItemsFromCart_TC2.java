package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShoppingCartPage;
import pages.TeesPage;
import pages.WomenPage;
import utils.Utils;

public class DeleteItemsFromCart_TC2 extends TestBase {
    @Test()
    public void deleting_items_from_cart() throws InterruptedException {
    test = extent.createTest("delete items from cart", "Case 2: User is able to delete items from cart")
            .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

    openURL("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
    test.log(Status.INFO, "Open URL");
    logger.info("Open URL");

    utils.waitForElementToBeClickable(HomePage.WomenBtn);
    utils.clickOnButton(HomePage.WomenBtn);
    test.log(Status.INFO, "Click  Women Button(Homepage)");
    logger.info("Click Women Button(Homepage)");

        utils.waitForElementToBeClickable(WomenPage.TeesBtn);
        utils.clickOnButton(WomenPage.TeesBtn);
        test.log(Status.INFO, "Click on the Tees button(WomenPage)");
        logger.info("Click on the Tees button(WomenPage)");

        utils.waitForElementVisible(TeesPage.GwynEnduranceTeeImage);
        utils.hoverOverElements(TeesPage.GwynEnduranceTeeImage);
        test.log(Status.INFO, "Hover over the Gwyn Endurance Tee(TeesPage)");
        logger.info("Hover over the Gwyn Endurance Tee(TeesPage)");

        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeMSize);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeMSize);
        test.log(Status.INFO, "Select the M size of the Gwyn Endurance Tee(TeesPage)");
        logger.info("Select the M size of the Gwyn Endurance Tee(TeesPage)");

        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeBlackColour);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeBlackColour);
        test.log(Status.INFO, "Select the black colour of the Gwyn Endurance Tee(TeesPage)");
        logger.info("Select the black colour of the Gwyn Endurance Tee(TeesPage)");



        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeAddToCartBtn);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeAddToCartBtn);
        test.log(Status.INFO, "Add to cart the Gwyn Endurance Tee(TeesPage)");
        logger.info("Add to cart the Gwyn Endurance Tee(TeesPage)");
        Thread.sleep(5000);

        utils.waitForElementVisible(TeesPage.CartBtn);
        utils.scrollDown(TeesPage.CartBtn);
        Thread.sleep(5000);

        utils.waitForElementLocated(TeesPage.CartBtn);
        utils.clickOnButton(TeesPage.CartBtn);


        utils.waitForElementVisible(TeesPage.QuantityField);
        utils.clearText(TeesPage.QuantityField);
        Thread.sleep(3000);

        utils.waitForElementVisible(TeesPage.QuantityField);
        utils.enterText(TeesPage.QuantityField, "5");
        Thread.sleep(3000);

        utils.waitForElementToBeClickable(TeesPage.UpdateQuantityBtn);
        utils.clickOnButton(TeesPage.UpdateQuantityBtn);

        utils.waitForElementToBeClickable(TeesPage.ViewAndEditCartBtn);
        utils.clickOnButton(TeesPage.ViewAndEditCartBtn);


        utils.waitForElementToBeClickable(ShoppingCartPage.DeleteBtn);
        utils.clickOnButton(ShoppingCartPage.DeleteBtn);

        utils.waitForElementVisible(ShoppingCartPage.NoItemsMessage);
        utils.assertText(ShoppingCartPage.NoItemsMessage, "no items");
    }
}
