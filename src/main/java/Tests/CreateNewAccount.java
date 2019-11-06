package Tests;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import static Tests.TestSuite.driverFactory;



public class CreateNewAccount {
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
    public void register() {
        homepage.goTo();
        homepage.navigateToSignInPage();
        signInPage.enterNewEmail("yaseen3.ahmed@ten10.com");
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