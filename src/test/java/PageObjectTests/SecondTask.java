package PageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTask extends BaseTest {

    @Test
    public void secondTaskTest() {
        webDriver.get("https://shop.demoqa.com/");

        PinkDropShoulderPageObject pinkDropShoulderPageObject = new PinkDropShoulderPageObject(webDriver);

        pinkDropShoulderPageObject.clickPinkDropShoulderOversizedTShirt();
       /* log("Product link is clicked");*/

        pinkDropShoulderPageObject.waitBeforeColorDropDown();
      /*  log("The wait is happened");*/

        pinkDropShoulderPageObject.clickColorDropDown();
      /*  log("'Choose a color' dropdown is clicked");*/

        pinkDropShoulderPageObject.sendPinkText();
       /* log("The color is selected");*/

        pinkDropShoulderPageObject.waitSizeDrop();
      /*  log("The wait is happened");*/

        pinkDropShoulderPageObject.clickSizeDropDown();
       /* log("'Choose a size' dropdown is clicked");*/

        pinkDropShoulderPageObject.sendSizeText();
       /* log("The size is selected");*/

        pinkDropShoulderPageObject.waitQuantity();
      /*  log("The wait is happened");*/

        pinkDropShoulderPageObject.clickQuantity();
      /*  log("The quantity is selected");*/

        pinkDropShoulderPageObject.waitBeforeAddToCart();
      /*  log("The wait is happened");*/

        pinkDropShoulderPageObject.clickAddToCartButton();
       /* log("'Add to cart' button is clicked");*/

        pinkDropShoulderPageObject.waitBeforeClickCart();
        /*log("The wait is happened");*/

        pinkDropShoulderPageObject.clickCartButton();
       /* log("'Cart' button is clicked");*/

        CartPageObject cartPageObject = new CartPageObject(webDriver);

        cartPageObject.waitBeforeCheck();
       /* log("The wait is happened");*/

        Assert.assertTrue(cartPageObject.isPresentPinkDropShoulderInCart());
      /*  Assert.assertFalse(cartPageObject.isPresentPinkDropShoulderInCart());*/
       /* log("Product is displayed on the 'Cart' page");*/

    }

}