package PageObjectTests;

import org.testng.annotations.Test;

public class SecondTask extends BaseTest {

    @Test
    public void secondTaskTest() {
        webDriver.get("https://shop.demoqa.com/");

        PinkDropShoulderPageObject pinkDropShoulderPageObject = new PinkDropShoulderPageObject(webDriver);

        pinkDropShoulderPageObject.clickPinkDropShoulderOversizedTShirt();
        pinkDropShoulderPageObject.waitBeforeColorDropDown();
        pinkDropShoulderPageObject.clickColorDropDown();
        pinkDropShoulderPageObject.sendPinkText();
        pinkDropShoulderPageObject.waitSizeDrop();
        pinkDropShoulderPageObject.clickSizeDropDown();
        pinkDropShoulderPageObject.sendSizeText();
        pinkDropShoulderPageObject.waitQuantity();
        pinkDropShoulderPageObject.clickQuantity();
        pinkDropShoulderPageObject.waitBeforeAddToCart();
        pinkDropShoulderPageObject.clickAddToCartButton();
        pinkDropShoulderPageObject.waitBeforeClickCart();
        pinkDropShoulderPageObject.clickCartButton();

        CartPageObject cartPageObject = new CartPageObject(webDriver);

        cartPageObject.waitBeforeCheck();
        cartPageObject.isPresentPinkDropShoulderInCart();

    }

}