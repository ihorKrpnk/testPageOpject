import org.testng.annotations.Test;

public class FirstTaskTest extends BaseTest {

    @Test
    public void firstTaskTest() {
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);

        packagePage.favoriteBlackCross();
        packagePage.waitMessage();
        packagePage.openWishlist();
        packagePage.isPresentBlackCross();

    }

}
