package PageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static PageObjectTests.BasePage.log;

public class SecondTask extends BaseTest {

    @Test
    public void secondTaskTest() {
        webDriver.get("https://shop.demoqa.com/");
        allureLog("Opening \"https://shop.demoqa.com/\" ");

        PinkDropShoulderPageObject pinkDropShoulderPageObject = new PinkDropShoulderPageObject(webDriver);

        pinkDropShoulderPageObject.clickPinkDropShoulderOversizedTShirt();
        log.info("Product link is clicked");
        allureLog("Product link is clicked");

        pinkDropShoulderPageObject.waitBeforeColorDropDown();

        pinkDropShoulderPageObject.clickColorDropDown();
        log.info("'Choose a color' dropdown is clicked");
        allureLog("'Choose a color' dropdown is clicked");

        pinkDropShoulderPageObject.sendPinkText();
        log.info("The color is selected");
        allureLog("The color is selected");

        pinkDropShoulderPageObject.waitSizeDrop();

        pinkDropShoulderPageObject.clickSizeDropDown();
        log.info("'Choose a size' dropdown is clicked");
        allureLog("'Choose a size' dropdown is clicked");

        pinkDropShoulderPageObject.sendSizeText();
        log.info("The size is selected");
        allureLog("The size is selected");

        pinkDropShoulderPageObject.waitQuantity();

        pinkDropShoulderPageObject.clickQuantity();
        log.info("The quantity is selected");
        allureLog("The quantity is selected");

        pinkDropShoulderPageObject.waitBeforeAddToCart();

        pinkDropShoulderPageObject.clickAddToCartButton();
        log.info("'Add to cart' button is clicked");
        allureLog("'Add to cart' button is clicked");

        pinkDropShoulderPageObject.waitBeforeClickCart();

        pinkDropShoulderPageObject.clickCartButton();
        log.info("'Cart' button is clicked");
        allureLog("'Cart' button is clicked");

        CartPageObject cartPageObject = new CartPageObject(webDriver);

        cartPageObject.waitBeforeCheck();

        Assert.assertTrue(cartPageObject.isPresentPinkDropShoulderInCart());
      /*  Assert.assertFalse(cartPageObject.isPresentPinkDropShoulderInCart());*/
        log.info("Product is displayed on the 'Cart' page");
        allureLog("Product is displayed on the 'Cart' page");

    }

}