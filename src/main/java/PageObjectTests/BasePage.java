package PageObjectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        getWebElement(locator).click();
    }

    public void waitAfterClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void isPresent(By locator) {
        getWebElement(locator).isDisplayed();
    }

    public void sendKeys(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

}