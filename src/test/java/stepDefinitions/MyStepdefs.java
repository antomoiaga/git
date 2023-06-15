package stepDefinitions;

import common.TestBase;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.HoodiesSweatshirtsPage;
import pages.WomenPage;
import pages.TeesPage;
import pages.CirceHoodiePage;
import utils.Utils;

import java.io.IOException;

import static common.TestBase.utils;


public class MyStepdefs {
    @Given("that I will open the page")
    public void thatIWillOpenThePage() throws IOException {
        TestBase.propertiesLoad();
        TestBase.openBrowser();
        TestBase.openURL("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
    }

    @Then("I will click on Hoodies and Sweatshirts button from homepage")
    public void iWillClickOnHoodiesAndSweatshirtsButtonFromHomePage() {
        utils.waitForElementVisible(HomePage.WomenBtn);
        utils.hoverOverElements(HomePage.WomenBtn);
        utils.waitForElementVisible(HomePage.TopsBtn);
        utils.hoverOverElements(HomePage.TopsBtn);
        utils.waitForElementVisible(HomePage.HoodiesSweatshirts);
        utils.clickOnButton(HomePage.HoodiesSweatshirts);
    }

    @Then("I will click on the Circe hoodie from the Hoodies and Sweatshirts page")
    public void iWillClickOnTheCirceHoodieFromTheHoodiesAndSweatshirtsPage() {
        utils.waitForElementVisible(HoodiesSweatshirtsPage.CirceHoodie);
        utils.clickOnButton(HoodiesSweatshirtsPage.CirceHoodie);
    }

    @And("I will click on the M size of the Circe hoodie from the CirceHoodie page")
    public void iWillClickOnTheMSizeOfTheCirceHoodieFromTheCirceHoodiePage(){
        utils.waitForElementToBeClickable(CirceHoodiePage.CirceHoodieSizeM);
        utils.clickOnButton(CirceHoodiePage.CirceHoodieSizeM);
    }

    @And("I will click on the green colour of the Circe hoodie from the CirceHoodie page")
    public void iWillClickOnTheGreenColourOfTheCirceHoodieFromTheCirceHoodiePage() {
        utils.waitForElementToBeClickable(CirceHoodiePage.CirceHoodieGreenColour);
        utils.clickOnButton(CirceHoodiePage.CirceHoodieGreenColour);
    }

    @Then("I will click on the Add to Cart button from the CirceHoodie page")
    public void iWillClickOnTheAddToCartButtonFromTheCirceHoodiePage() {
        utils.scrollDown(CirceHoodiePage.AddToCartBtnCirce);
        utils.clickOnButton(CirceHoodiePage.AddToCartBtnCirce);
    }

    @Then("I will click on the Tees page from the CirceHoodie page")
    public void iWillClickOnTheTeesPageFromTheCirceHoodiePage() {
        utils.scrollDown(CirceHoodiePage.WomenPageBtn);
        utils.clickOnButton(CirceHoodiePage.WomenPageBtn);
        utils.waitForElementToBeClickable(WomenPage.TeesBtn);
        utils.clickOnButton(WomenPage.TeesBtn);
    }

    @Then("I will hover over the Gwyn Endurance Tee Image from the Tees page")
    public void iWillHoverOverTheGwynEnduranceTeeImageFromTheTeesPage(){
        utils.waitForElementVisible(TeesPage.GwynEnduranceTeeImage);
        utils.hoverOverElements(TeesPage.GwynEnduranceTeeImage);
    }

    @And("I will click on the M size of the Gwyn Endurance Tee from the Tees page")
    public void iWillClickOnTheMSizeOfTheGwynEnduranceTeeFromTheTeesPage(){
        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeMSize);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeMSize);
    }

    @And("I will click on the black colour of the Gwyn Endurance Tee from the Tees page")
    public void iWillClickOnTheBlackColourOfTheGwynEnduranceTeeFromTheTeesPage(){
        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeBlackColour);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeBlackColour);
    }

    @Then("I will click on the Add to Cart button of the Gwyn Endurance Tee")
    public void iWillClickOnTheAddToCartBtnOfTheGwynEnduranceTee(){
        utils.waitForElementToBeClickable(TeesPage.GwynEnduranceTeeAddToCartBtn);
        utils.clickOnButton(TeesPage.GwynEnduranceTeeAddToCartBtn);
    }

    @Then("I will hover over the Radiant Tee image from the Tees page")
    public void iWillHoverOverTheRadiantTeeImageFromTheTeesPage(){
        utils.waitForElementVisible(TeesPage.RadiantTeeImage);
        utils.hoverOverElements(TeesPage.RadiantTeeImage);
    }

    @And("I will click on the L size of the Radiant Tee from the Tees page")
    public void iWillClickOnTheLSizeOfTheRadiantTeeFromTheTeesPage(){
        utils.waitForElementToBeClickable(TeesPage.RadiantTeeSizeL);
        utils.clickOnButton(TeesPage.RadiantTeeSizeL);
    }

    @And("I will click on the purple colour of the Radiant Tee from the Tees page")
    public void iWillClickOnThePurpleColourOfTheRadiantTeeFromTheTeesPage(){
        utils.waitForElementToBeClickable(TeesPage.RadiantTeePurple);
        utils.clickOnButton(TeesPage.RadiantTeePurple);
    }

    @Then("I will click on the Add to cart button of the Radiant Tee from the Tees page")
    public void iWillClickOnTheAddToCartBtnOfTheRadiantTeeFromTheTeesPage(){
        utils.waitForElementToBeClickable(TeesPage.RadiantTeeAddToCart);
        utils.clickOnButton(TeesPage.RadiantTeeAddToCart);
    }
    @Given("that I will open the pagesds")
    public void thatIWillOpenThePagesds() {

    }
}
