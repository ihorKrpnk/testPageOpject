import org.testng.annotations.Test;

public class SecondTaskTest extends BaseTest {

    @Test
    public void secondTaskTest(){
        webDriver.get("https://shop.demoqa.com/");

        PackagePage packagePage = new PackagePage(webDriver);

        packagePage.clickPinkDropShoulderOversizedTShirt();
        packagePage.clickColorDropDown();
        packagePage.sendPinkText();
        packagePage.clickSizeDropDown();
        packagePage.sendSizeText();
        packagePage.clickQuantity();
        packagePage.clickAddToCartButton();
        packagePage.clickCartButton();
        packagePage.isPresentPinkDropShoulderInCart();

    }

}