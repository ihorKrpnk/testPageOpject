package PageObjectTests;



import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTask extends BaseTest {

    @Test
    public void firstTaskTest() {
        webDriver.get("https://shop.demoqa.com/");

        HomePageObject homePageObject = new HomePageObject(webDriver);

        homePageObject.favoriteBlackCross();
       /* log("Add Product to favorites");*/

        homePageObject.waitMessage();
       /* log("Confirmation message is displayed");*/

        homePageObject.openWishlist();
        /*log("Wishlist button is clicked");*/

        WishlistPageObject wishlistPageObject = new WishlistPageObject(webDriver);

        Assert.assertTrue(wishlistPageObject.isPresentBlackCross());
       /* Assert.assertFalse(wishlistPageObject.isPresentBlackCross());*/
       /* log("Product is displayed in Wishlist");*/
    }
}