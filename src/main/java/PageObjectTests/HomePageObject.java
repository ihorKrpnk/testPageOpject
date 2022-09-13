package PageObjectTests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {

    /*By elementAddToFavoritesButton = By.xpath("//a[@data-product-id='704']");*/
    private final By elementAddToFavoritesButton = By.xpath("//a[@data-product-id='1162']");
    private final By elementMessage = By.xpath("//div[@id='yith-wcwl-message']");
    private final By elementWishlistButton = By.xpath("//a[normalize-space()='My Wishlist']");

    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Click on a product image")
    public void favoriteBlackCross() {
        click(elementAddToFavoritesButton);
    }

    @Step("Confirmation pop-up should be displayed")
    public void waitMessage() {
        waitElement(elementMessage);
    }

    @Step
    public void openWishlist() {
        click(elementWishlistButton);
    }
}