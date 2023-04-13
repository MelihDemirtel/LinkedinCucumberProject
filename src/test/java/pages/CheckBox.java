package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckBox extends WebElements{
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.jsx = (JavascriptExecutor) driver;
    }

    public void clickCheckBox(){

        wait.until(ExpectedConditions.presenceOfElementLocated(checkBoxButton));
        driver.findElement(checkBoxButton).click();
    }

    public void clickHomeCheckBox(){
        driver.findElement(homeCheckBoxButton).click();
    }

    public void assertInfo(){
        Assert.assertTrue(driver.findElement(actualResult).isDisplayed());
        System.out.println(driver.findElement(actualResult).getText());
    }
}
