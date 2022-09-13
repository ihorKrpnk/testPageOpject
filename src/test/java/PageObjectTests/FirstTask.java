package PageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static PageObjectTests.BasePage.log;

public class FirstTask extends BaseTest {


    @Test
    public void firstTaskTest() {

        webDriver.get("https://shop.demoqa.com/");
        allureLog("Opening \"https://shop.demoqa.com/\" ");

        HomePageObject homePageObject = new HomePageObject(webDriver);

        homePageObject.favoriteBlackCross();
        log.info("Product is added to favorites");
        allureLog("Product is added to favorites");

        homePageObject.waitMessage();
        log.info("Confirmation message is displayed");
        allureLog("Confirmation message is displayed");

        homePageObject.openWishlist();
        log.info("Wishlist button is clicked");
        allureLog("Wishlist button is clicked");

        WishlistPageObject wishlistPageObject = new WishlistPageObject(webDriver);

        Assert.assertTrue(wishlistPageObject.isPresentBlackCross());
        /* Assert.assertFalse(wishlistPageObject.isPresentBlackCross());*/
        log.info("Product is displayed in Wishlist");
        allureLog("Product is displayed in Wishlist");
    }
}