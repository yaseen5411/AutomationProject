package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = "http://automationpractice.com/index.php";

    private static final By SIGN_IN_BUTTON = By.cssSelector("a.login");
    private static final By DRESSES_BUTTON = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");


    public void goTo(){
        driver.get(URL);
    }

    public void navigateToSignInPage(){
        waitAndClick(SIGN_IN_BUTTON);
    }

    public void navigateToDressesPage(){
        waitAndClick(DRESSES_BUTTON);
    }




}
