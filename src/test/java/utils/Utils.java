package utils;

import common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;


public class Utils extends TestBase{

    public void clickOnButton(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void hoverOverElements(By locator) {
            Actions builder = new Actions(driver);
            WebElement element = driver.findElement(locator);
            builder.moveToElement(element).build().perform();
        }

     public void waitForElementVisible(By locator)   {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
     }

     public void scrollDown(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);}



    public void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public void clearText(By locator) {

        WebElement element = driver.findElement(locator);
        element.clear();
    }
    public void assertText(By locator, String textToAssert){
        WebElement element = driver.findElement(locator);
        String text = element.getText();
        assertTrue(text.contains(textToAssert));
    }

    }

