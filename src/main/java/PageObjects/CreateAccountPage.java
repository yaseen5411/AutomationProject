package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }


    private static final By TITLE_MR_BUTTON = By.xpath("//*[@id=\"id_gender1\"]");
    private static final By FIRST_NAME_INPUT_BOX = By.xpath("//*[@id=\"customer_firstname\"]");
    private static final By LAST_NAME_INPUT_BOX = By.xpath("//*[@id=\"customer_lastname\"]");
    private static final By PASSWORD_INPUT_BOX = By.xpath("//*[@id=\"passwd\"]");
    private static final By DOB_DAYS = By.xpath("//*[@id=\"days\"]");
    private static final By DOB_MONTH = By.xpath("//*[@id=\"months\"]");
    private static final By DOB_YEAR = By.xpath("//*[@id=\"years\"]");
    private static final By STATE = By.xpath("//*[@id=\"id_state\"]");
    private static final By ADDRESS = By.xpath("//*[@id=\"address1\"]");

    private static final By CITY = By.xpath("//*[@id=\"city\"]");
    private static final By POSTCODE = By.xpath("//*[@id=\"postcode\"]");
    private static final By PHONE_NUMBER = By.xpath("//*[@id=\"phone_mobile\"]");
    private static final By REGISTER_BUTTON = By.xpath("//*[@id=\"submitAccount\"]/span");
    private static final By ACCOUNT_BUTTON = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");



    public void clickTitleMr() {
        waitAndClick(TITLE_MR_BUTTON);
    }


    public void enterFirstName(String firstName) {
        findAndType(FIRST_NAME_INPUT_BOX, firstName);
    }

    public void enterLastName(String lastName) {
        findAndType(LAST_NAME_INPUT_BOX, lastName);
    }

    public void enterPassword(String password) {
        findAndType(PASSWORD_INPUT_BOX, password);
    }

    public void enterDOBDays(int input){
        findAndSelectNum(DOB_DAYS,input);
    }

    public void enterDOBMonth(String input){
        findAndSelect(DOB_MONTH, input);
    }

    public void enterDOBYear(int input){
        findAndSelectNum(DOB_YEAR,input);
    }

    public void enterState(String input){
        findAndSelect(STATE,input);
    }


    public void enterAddress(String input){
        findAndType(ADDRESS,input);
    }
    public void enterCity(String input){
        findAndType(CITY, input);
    }

    public void enterPostcode(String input){
        findAndType(POSTCODE, input);
    }

    public void enterPhoneNum(String input){
        findAndType(PHONE_NUMBER, input);
    }

    public void clickRegister(){
        waitAndClick(REGISTER_BUTTON);
    }


    public void userHasSignedIn() {
        WebElement customerAccount = driver.findElement(ACCOUNT_BUTTON);
        Assert.assertTrue(elementIsVisible(customerAccount));
    }

}

