package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RadioButton extends WebElements{
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.jsx = (JavascriptExecutor) driver;
    }
    public void homePage() {
        jsx.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage));
        System.out.println("User At Home Page");
    }

    public void clickElements(){
        driver.findElement(elementsButton).click();
    }

    public void radioButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(radioButton));
        driver.findElement(radioButton).click();
    }
    public void clickYesRadioButton(){
        driver.findElement(yesRadioButton).click();
    }
    public void checkYesMessages(){
        wait.until(ExpectedConditions.presenceOfElementLocated(actualRadioButtonMessages));
        Assert.assertEquals(driver.findElement(actualRadioButtonMessages).getText(), expectedYesRadioButtonMessages);
    }
    public void clickImpressiveRadioButton(){
        driver.findElement(impressiveRadioButton).click();
    }
    public void checkImpressiveMessages(){
        wait.until(ExpectedConditions.presenceOfElementLocated(actualRadioButtonMessages));
        Assert.assertEquals(driver.findElement(actualRadioButtonMessages).getText(), expectedImpressiveRadioButtonMessages);
    }
    public void clickNoRadioButton(){
        isClickableNoRadioButton = driver.findElement(noRadioButton).isEnabled();
        System.out.println("STATE: " + isClickableNoRadioButton);
    }
    public void checkNoRadioButtonEnabled(){
        if (isClickableNoRadioButton){
            System.out.println("No radio button is not clickable");
        }else{
            System.out.println("No radio button is clickable");
            Assert.assertTrue(isClickableNoRadioButton);
        }
    }
}


