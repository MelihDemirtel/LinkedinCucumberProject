package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Buttons extends WebElements{
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;
    static Actions actions;

    public Buttons(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.jsx = (JavascriptExecutor) driver;
        this.actions = new Actions(driver);
    }
    public void clickButtons(){
        jsx.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.presenceOfElementLocated(buttonsButton));
        driver.findElement(buttonsButton).click();
    }
    public void clickDoubleClickButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(doubleClickBtn));
        actions.moveToElement(driver.findElement(doubleClickBtn)).doubleClick().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(actualDoubleClickMessage));
    }
    public void clickRightClickButton(){
        actions.moveToElement(driver.findElement(rightClickBtn)).contextClick().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(actualRightClickMessage));
    }
    public void clickClickMeButton(){
        actions.moveToElement(driver.findElement(dynamicClickBtn)).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(actualClickMeMessage));
    }
    public void checkButtonsMessages(){
        Assert.assertEquals(driver.findElement(actualDoubleClickMessage).getText(), expectedDoubleClickMessage);
        Assert.assertEquals(driver.findElement(actualRightClickMessage).getText(), expectedRightClickMessage);
        //Assert.assertEquals(driver.findElement(actualClickMeMessage).getText(), expectedClickMeMessage);

    }
}
