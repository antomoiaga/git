package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
//import org.junit.Test;
import org.testng.annotations.Test;
import pages.*;


public class AddItemsToCart_TC1 extends TestBase {

    @Test()
    public void adding_items_to_cart() {
        test = extent.createTest("adding items to cart", "Case 1: User is able to add items to cart")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");


       utils.waitForElementVisible(HomePage.WomenBtn);
       utils.hoverOverElements(HomePage.WomenBtn);
       test.log(Status.INFO, "Hover over  Women Button(Homepage)");
       logger.info("Hover over Women Button(Homepage)");

       utils.waitForElementVisible(HomePage.TopsBtn);
       utils.hoverOverElements(HomePage.TopsBtn);
        test.log(Status.INFO, "Hover over Tops Button(Homepage)");
        logger.info("Hover over Tops Button(Homepage)");

        utils.waitForElementVisible(HomePage.HoodiesSweatshirts);
        utils.clickOnButton(HomePage.HoodiesSweatshirts);
        test.log(Status.INFO, "Click on Hoodies and Sweatshirts(Homepage)");
        logger.info("Click on Hoodies and Sweatshirts(Homepage)");

        utils.waitForElementVisible(HoodiesSweatshirtsPage.CirceHoodie);
        utils.clickOnButton(HoodiesSweatshirtsPage.CirceHoodie);
        test.log(Status.INFO, "Click on the Circe Hooded Ice Fleece(HoodiesSweatshirtsPage)");
        logger.info("Click on the Circe Hooded Ice Fleece(HoodiesSweatshirtsPage)");

        utils.waitForElementToBeClickable(CirceHoodiePage.CirceHoodieSizeM);
        utils.clickOnButton(CirceHoodiePage.CirceHoodieSizeM);
        test.log(Status.INFO, "Select the M size of the Circe hoodie(CirceHoodiePage)");
        logger.info("Select the M size of the Circe hoodie(CirceHoodiePage)");

        utils.waitForElementToBeClickable(CirceHoodiePage.CirceHoodieGreenColour);
        utils.clickOnButton(CirceHoodiePage.CirceHoodieGreenColour);
        test.log(Status.INFO, "Select the green colour of the Circe hoodie(CirceHoodiePage)");
        logger.info("Select the green colour of the Circe hoodie(CirceHoodiePage)");

        utils.scrollDown(CirceHoodiePage.AddToCartBtnCirce);
        utils.clickOnButton(CirceHoodiePage.AddToCartBtnCirce);
        test.log(Status.INFO, "Add to cart the Circe hoodie(CirceHoodiePage)");
        logger.info("Add to cart the Circe hoodie(CirceHoodiePage)");

        utils.scrollDown(CirceHoodiePage.WomenPageBtn);
        utils.clickOnButton(CirceHoodiePage.WomenPageBtn);
        test.log(Status.INFO, "Click the Women button(CirceHoodiePage)");
        logger.info("Click the Women button(CirceHoodiePage)");

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

        utils.waitForElementVisible(TeesPage.RadiantTeeImage);
        utils.hoverOverElements(TeesPage.RadiantTeeImage);
        test.log(Status.INFO, "Hover over the Radiant Tee Image(TeesPage)");
        logger.info("Hover over the Radiant TeeImage (TeesPage)");

        utils.waitForElementToBeClickable(TeesPage.RadiantTeeSizeL);
        utils.clickOnButton(TeesPage.RadiantTeeSizeL);
        test.log(Status.INFO, "Select the M size of the Radiant Tee(TeesPage)");
        logger.info("Select the M size of the Radiant Tee(TeesPage)");

        utils.waitForElementToBeClickable(TeesPage.RadiantTeePurple);
        utils.clickOnButton(TeesPage.RadiantTeePurple);
        test.log(Status.INFO, "Select the purple colour of the Radiant Tee(TeesPage)");
        logger.info("Select the purple colour of the Radiant Tee(TeesPage)");

        utils.waitForElementToBeClickable(TeesPage.RadiantTeeAddToCart);
        utils.clickOnButton(TeesPage.RadiantTeeAddToCart);
        test.log(Status.INFO, "Add to cart the Radiant Tee(TeesPage)");
        logger.info("Add to cart the Radiant Tee(TeesPage)");

    }


}
