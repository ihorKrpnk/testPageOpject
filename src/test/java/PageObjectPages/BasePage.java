package PageObjectPages;

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

    protected void click(By locator) {
        getWebElement(locator).click();
    }

    protected void waitAfterClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected boolean isPresent(By locator){
        getWebElement(locator).isDisplayed();
        return true;
    }

    protected void sendKeys(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

}