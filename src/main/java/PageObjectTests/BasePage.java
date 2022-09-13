package PageObjectTests;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    protected static Logger log = LogManager.getLogger();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        getWebElement(locator).click();
    }

    public void waitElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isPresent(By locator) {
        return getWebElement(locator).isDisplayed();
    }

    public void sendKeys(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

}