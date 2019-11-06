package AutomationTests;

import PageObjects.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class CartStillVisible {
    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private CreateAccountPage createNewAccount = new CreateAccountPage(driver);
    private DressesPage dressesPage = new DressesPage(driver);
    private AccountPage accountPage = new AccountPage(driver);


    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }


    @Test
    public void cartStillVisible(){
        homepage.navigateToSignInPage();
        signInPage.enterEmail("yaseen.ahmed@ten10.com");
        signInPage.enterPassword("password");
        signInPage.clickSignIn();
        signInPage.userHasSignedIn();
        homepage.navigateToDressesPage();
        dressesPage.hoverOverImage();
        dressesPage.addToCart();
        dressesPage.itemAddedToCart();
        dressesPage.closeCartWindow();
        dressesPage.signOut();
        dressesPage.signIn();
        signInPage.enterEmail("yaseen.ahmed@ten10.com");
        signInPage.enterPassword("password");
        signInPage.clickSignIn();
        accountPage.checkIfCartIsEmpty();




    }

    @After
    public void individualTearDown(){
        //driver.quit();
        driver.manage().deleteAllCookies();

    }


    @AfterClass
    public static void mainTearDown(){

    }
}
