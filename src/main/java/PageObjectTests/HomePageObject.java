package PageObjectTests;

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

    public void favoriteBlackCross() {
        click(elementAddToFavoritesButton);
    }

    public void waitMessage() {
        waitElement(elementMessage);
        System.out.println("Message is displayed");
    }

    public void openWishlist() {
        click(elementWishlistButton);
        System.out.println("Wishlist is opened");
    }
}