package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
}

    private static final By CREATE_ACCOUNT_EMAIL_INPUT = By.xpath("//*[@id=\"email_create\"]");
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    private static final By EMAIL_INPUT = By.xpath("//*[@id=\"email\"]");
    private static final By PASSWORD_INPUT = By.xpath("//*[@id=\"passwd\"]");
    private static final By SIGN_IN_BUTTON = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    private static final By ACCOUNT_BUTTON = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");


    public void enterNewEmail(String email){
        findAndType(CREATE_ACCOUNT_EMAIL_INPUT, email);

    }

    public void clickCreateAccountButton(){
        waitAndClick(CREATE_ACCOUNT_BUTTON);
    }


    public void enterEmail(String email){
        findAndType(EMAIL_INPUT, email);

    }

    public void enterPassword(String password){
        findAndType(PASSWORD_INPUT, password);
    }

    public void clickSignIn(){
        waitAndClick(SIGN_IN_BUTTON);
    }

    public void userHasSignedIn() {
        WebElement customerAccount = driver.findElement(ACCOUNT_BUTTON);
        Assert.assertTrue(elementIsVisible(customerAccount));
    }
}

