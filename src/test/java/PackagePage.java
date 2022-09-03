import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackagePage extends BasePage {

    /* private final By elementAddToFavoritesButton = By.xpath("//a[@data-product-id='704']");*/
    private final By elementAddToFavoritesButton = By.xpath("//a[@data-product-id='1162']");
    private final By elementMessage = By.xpath("//div[@id='yith-wcwl-message']");
    private final By elementWishlistButton = By.xpath("//a[normalize-space()='My Wishlist']");

    /*private final By elementTokyoTalkiesInWishlist = By.xpath("//a[normalize-space()='Tokyo Talkies']");*/

    private final By elementBlackCrossInWishlist = By.xpath("//a[normalize-space()='Black Cross Back Maxi Dress']");
    private final By elementPinkDropShoulderOversizedTShirt = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt']");
    private final By elementColorDropDown = By.xpath("//select[@id='pa_color']");
    private final By elementSizeDropDown = By.xpath("//select[@id='pa_size']");
    private final By elementQuantity = By.xpath("//i[@class='icon_plus']");
    private final By elementAddToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private final By elementCartButton = By.xpath("//i[@class='icon_bag_alt']");
    private final By elementPinkDropShoulderInCart = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt - Pink']");

    public PackagePage(WebDriver driver) {
        super(driver);
    }

    /*public void favoriteTokyoTalkies() {
        click(elementAddToFavoritesButton);
    }*/

    public void favoriteBlackCross() {
        click(elementAddToFavoritesButton);
    }

    public void waitMessage() {
        waitAfterClick(elementMessage);
        System.out.println("Message is displayed");
    }

    public void openWishlist() {
        click(elementWishlistButton);
        System.out.println("Wishlist is opened");
    }

    /*public void isPresentTokyoTalkies() {
        isPresent(elementTokyoTalkiesInWishlist);
        System.out.println(isPresent(elementTokyoTalkiesInWishlist));
    }*/
    public void isPresentBlackCross() {
        isPresent(elementBlackCrossInWishlist);
        System.out.println(isPresent(elementBlackCrossInWishlist));
    }


    public void clickPinkDropShoulderOversizedTShirt() {
        click(elementPinkDropShoulderOversizedTShirt);
    }

    public void clickColorDropDown() {
        click(elementColorDropDown);
    }

    public void sendPinkText() {
        sendKeys(elementColorDropDown, "pink\n");
    }

    public void clickSizeDropDown() {
        click(elementSizeDropDown);
    }

    public void sendSizeText() {
        sendKeys(elementSizeDropDown, "37\n");
    }

    public void clickQuantity() {
        for (int i = 0; i < 2; i++) {
            click(elementQuantity);
        }
    }

    public void clickAddToCartButton() {
        click(elementAddToCartButton);
    }

    public void clickCartButton() {
        click(elementCartButton);
    }

    public void isPresentPinkDropShoulderInCart() {
        isPresent(elementPinkDropShoulderInCart);
        System.out.println(isPresent(elementPinkDropShoulderInCart));
    }

}