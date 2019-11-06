package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DressesPage extends BasePage{

    public DressesPage(WebDriver driver) {
        super(driver);
    }

    private static final By ADD_TO_CART_BUTTON = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span");
    private static final By ADD_TO_CART_CONFIRMATION = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    private static final By CLOSE_CART_WINDOW = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    private static final By SIGN_OUT_BUTTON = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
    private static final By SIGN_IN_BUTTON = By.cssSelector("a.login");
    private static final By DRESS_IMAGE = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");



    public void hoverOverImage(){
        hoverOverElement(DRESS_IMAGE);
    }


    public void addToCart(){
        waitAndClick(ADD_TO_CART_BUTTON);
    }

    public void itemAddedToCart() {
        WebElement customerAccount = wait.until(ExpectedConditions.elementToBeClickable(ADD_TO_CART_CONFIRMATION));
        Assert.assertTrue(elementIsVisible(customerAccount));
    }

    public void closeCartWindow(){
        waitAndClick(CLOSE_CART_WINDOW);
    }

    public void signOut(){
        waitAndClick(SIGN_OUT_BUTTON);
    }

    public void signIn(){
        waitAndClick(SIGN_IN_BUTTON);
    }

}
