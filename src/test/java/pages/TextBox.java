package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TextBox extends WebElements {
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;

    public TextBox(WebDriver driver) {
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
    public void clickTextBox(){
        wait.until(ExpectedConditions.presenceOfElementLocated(textBoxButton));
        driver.findElement(textBoxButton).click();
    }
    public void sendFullName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(fullNameLabel));
        driver.findElement(fullNameLabel).sendKeys(fullName);
    }
    public void sendEmail(){
        driver.findElement(emailLabel).sendKeys(email);
    }
    public void sendCurrentAddress(){
        driver.findElement(currentAddressLabel).sendKeys(currentAddress);
    }
    public void clickSubmit(){
        jsx.executeScript("window.scrollBy(0,300)");
        driver.findElement(submitButton).click();
    }
    public void assertInfo(){
        jsx.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.presenceOfElementLocated(actualResultName));
        Assert.assertEquals(driver.findElement(actualResultName).getText(), "Name:"+fullName);
        System.out.println("User Checked Full Name | " + driver.findElement(actualResultName).getText());

        Assert.assertEquals(driver.findElement(actualResultEmail).getText(), "Email:"+email);
        System.out.println("User Checked Email | " + driver.findElement(actualResultEmail).getText());

        Assert.assertEquals(driver.findElement(actualResultAddress).getText(), "Current Address :"+currentAddress);
        System.out.println("User Checked Current Address | " + driver.findElement(actualResultAddress).getText());
    }
}
