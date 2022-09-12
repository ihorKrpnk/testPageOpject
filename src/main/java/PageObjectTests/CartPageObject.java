package PageObjectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageObject extends BasePage {
    private final By elementPinkDropShoulderInCart = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt - Pink']");

    public CartPageObject(WebDriver driver) {
        super(driver);
    }

    public void waitBeforeCheck() {
        waitElement(elementPinkDropShoulderInCart);
    }

    public boolean isPresentPinkDropShoulderInCart() {
        return isPresent(elementPinkDropShoulderInCart);
    }
}
