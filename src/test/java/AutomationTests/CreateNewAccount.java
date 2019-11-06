package AutomationTests;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class CreateNewAccount {
    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private CreateAccountPage createNewAccount = new CreateAccountPage(driver);



    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }

        public static String randomAlphaNumeric(int count) {
            final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder builder = new StringBuilder();
            while (count-- != 0) {
                int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
                builder.append(ALPHA_NUMERIC_STRING.charAt(character));
            }
            return builder.toString();
        }

    @Test
    public void register() {
        homepage.goTo();
        homepage.navigateToSignInPage();
        signInPage.enterNewEmail(randomAlphaNumeric(10) +"@ten10.com");
        signInPage.clickCreateAccountButton();
        createNewAccount.clickTitleMr();
        createNewAccount.enterFirstName("yaseen");
        createNewAccount.enterLastName("ahmed");
        createNewAccount.enterPassword("password");
        //createNewAccount.enterDOBDays(5);
        // createNewAccount.enterDOBMonth("January");
        //createNewAccount.enterDOBYear(1997);
        createNewAccount.enterAddress("Street");
        createNewAccount.enterCity("Leeds");
        createNewAccount.enterState("Alaska");
        createNewAccount.enterPostcode("00000");
        createNewAccount.enterPhoneNum("017095566");
        createNewAccount.clickRegister();
        createNewAccount.userHasSignedIn();


    }


    @After
    public void individualTearDown(){
        //driver.quit();
        driver.manage().deleteAllCookies();

    }


    @AfterClass public static void mainTearDown(){

    }



}