package PageObjectTests;

import org.testng.annotations.Test;

public class SecondTask extends BaseTest {

    @Test
    public void secondTaskTest() {
        webDriver.get("https://shop.demoqa.com/");


        PinkDropShoulderPageObject pinkDropShoulderPageObject = new PinkDropShoulderPageObject(webDriver);

        pinkDropShoulderPageObject.clickPinkDropShoulderOversizedTShirt();
        pinkDropShoulderPageObject.clickColorDropDown();
        pinkDropShoulderPageObject.sendPinkText();
        pinkDropShoulderPageObject.clickSizeDropDown();
        pinkDropShoulderPageObject.sendSizeText();
        pinkDropShoulderPageObject.clickQuantity();
        pinkDropShoulderPageObject.clickAddToCartButton();
        pinkDropShoulderPageObject.clickCartButton();

        CartPageObject cartPageObject = new CartPageObject(webDriver);

        cartPageObject.isPresentPinkDropShoulderInCart();

    }

}