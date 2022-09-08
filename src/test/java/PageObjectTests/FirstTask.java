package PageObjectTests;



import org.testng.annotations.Test;

public class FirstTask extends BaseTest {

    @Test
    public void firstTaskTest() {
        webDriver.get("https://shop.demoqa.com/");

        HomePageObject homePageObject = new HomePageObject(webDriver);

        homePageObject.favoriteBlackCross();
        homePageObject.waitMessage();
        homePageObject.openWishlist();

        WishlistPageObject wishlistPageObject = new WishlistPageObject(webDriver);

        wishlistPageObject.isPresentBlackCross();
    }
}