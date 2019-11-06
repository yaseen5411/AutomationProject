package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private static final By CART_BUTTON = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    private static final By CART_TEXT = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]");

    public void checkIfCartIsEmpty(){
        WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]"));
        String textFromCartButton=cartButton.getText();
        System.out.println(textFromCartButton);

        boolean passed = true;
        if (textFromCartButton.equals("(empty)")){
            passed=false;
        }
        System.out.println(passed);
        Assert.assertTrue(passed);
    }




}
