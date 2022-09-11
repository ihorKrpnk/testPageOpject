package PageObjectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PinkDropShoulderPageObject extends BasePage {

    private final By elementPinkDropShoulderOversizedTShirt = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt']");
    private final By elementColorDropDown = By.xpath("//select[@id='pa_color']");
    private final By elementSizeDropDown = By.xpath("//select[@id='pa_size']");
    private final By elementQuantity = By.xpath("//i[@class='icon_plus']");
    private final By elementAddToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private final By elementCartButton = By.xpath("//i[@class='icon_bag_alt']");

    public PinkDropShoulderPageObject(WebDriver driver) {
        super(driver);
    }

    public void clickPinkDropShoulderOversizedTShirt() {
        click(elementPinkDropShoulderOversizedTShirt);
    }

    public void waitBeforeColorDropDown(){
        waitElement(elementColorDropDown);
    }

    public void clickColorDropDown() {
        click(elementColorDropDown);
    }

    public void sendPinkText() {
        sendKeys(elementColorDropDown, "pink\n");
    }

    public void waitSizeDrop() {
        waitElement(elementSizeDropDown);
    }

    public void clickSizeDropDown() {
        click(elementSizeDropDown);
    }

    public void sendSizeText() {
        sendKeys(elementSizeDropDown, "37\n");
    }

    public void waitQuantity() {
        waitElement(elementQuantity);
    }

    public void clickQuantity() {
        for (int i = 0; i < 2; i++) {
            click(elementQuantity);
        }
    }

    public void waitBeforeAddToCart() {
        waitElement(elementAddToCartButton);
    }

    public void clickAddToCartButton() {
        click(elementAddToCartButton);
    }

    public void waitBeforeClickCart() {
        waitElement(elementCartButton);
    }

    public void clickCartButton() {
        click(elementCartButton);
    }

}