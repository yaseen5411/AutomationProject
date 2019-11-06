package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




abstract class BasePage{


    protected WebDriver driver;
    protected WebDriverWait wait;
    Actions builder;


    BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        builder = new Actions(driver);
    }

    void waitAndClick(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    boolean elementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (ElementNotVisibleException e) {
            return false;
        }
    }

    void findAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.sendKeys(inputString);
    }



    void findAndSelectNum(By elementSelector, int input){
        Select element = new Select(driver.findElement(elementSelector));

        element.selectByIndex(input);
    }

    void findAndSelect(By elementSelector, String input){
        Select element = new Select(driver.findElement(elementSelector));
        element.selectByVisibleText(input);
    }

    void hoverOverElement(By elementSelector){
        Action mouseOverElement = builder.moveToElement(driver.findElement(elementSelector)).build();
        mouseOverElement.perform();
    }

}



