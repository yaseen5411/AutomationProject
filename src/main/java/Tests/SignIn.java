package Tests;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Tests.TestSuite.driverFactory;

public class SignIn {
    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private CreateAccountPage createNewAccount = new CreateAccountPage(driver);


    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }


    @Test
    public void signIn(){
        homepage.navigateToSignInPage();
        signInPage.enterEmail("yaseen.ahmed@ten10.com");
        signInPage.enterPassword("password");
        signInPage.clickSignIn();
        signInPage.userHasSignedIn();


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
