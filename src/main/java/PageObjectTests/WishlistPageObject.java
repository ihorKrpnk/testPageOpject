package PageObjectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPageObject extends BasePage {
    private final By elementBlackCrossInWishlist = By.xpath("//a[normalize-space()='Black Cross Back Maxi Dress']");
    /* By elementTokyoTalkiesInWishlist = By.xpath("//a[normalize-space()='Tokyo Talkies']");*/

    public WishlistPageObject(WebDriver driver) {
        super(driver);
    }

    public void isPresentBlackCross() {
        System.out.println(isPresent(elementBlackCrossInWishlist));
    }
}