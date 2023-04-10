package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TextBox {
    static WebDriver driver;
    static WebDriverWait wait;
    static SoftAssert softAssert;

    static String fullName = "Test";
    static String email = "test@deneme.com";
    static String currentAddress = "Test, Test/Deneme";

    static By homePage = By.xpath("//div[@class='category-cards']");
    static By elementsButton = By.xpath("//h5[text()='Elements']");
    static By textBoxButton = By.xpath("//span[text()='Text Box']");
    static By fullNameLabel = By.id("userName");
    static By emailLabel = By.id("userEmail");
    static By currentAddressLabel = By.id("currentAddress");
    static By submitButton = By.id("submit");

    static By actualResultName = By.id("name");
    static By actualResultEmail = By.id("email");
    static By actualResultAddress = By.xpath("//p[@id='currentAddress']");

    public TextBox(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void homePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage));
        softAssert.assertTrue(driver.findElement(homePage).isDisplayed());
        System.out.println("User At Home Page");
    }
    public void clickElements(){
        driver.findElement(elementsButton).click();
    }
    public void clickTextBox(){
        driver.findElement(textBoxButton).click();
    }
    public void sendFullName(){
        driver.findElement(fullNameLabel).sendKeys(fullName);
    }
    public void sendEmail(){
        driver.findElement(emailLabel).sendKeys(email);
    }
    public void sendCurrentAddress(){
        driver.findElement(currentAddressLabel).sendKeys(currentAddress);
    }
    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
    public void assertInfo(){
        softAssert.assertEquals(driver.findElement(actualResultName).getText(), "Name:"+fullName);
        System.out.println("User Checked Full Name | " + driver.findElement(actualResultName).getText());

        softAssert.assertEquals(driver.findElement(actualResultEmail).getText(), "Email:"+email);
        System.out.println("User Checked Full Name | " + driver.findElement(actualResultEmail).getText());

        softAssert.assertEquals(driver.findElement(actualResultAddress).getText(), "Current Address :"+currentAddress);
        System.out.println("User Checked Full Name | " + driver.findElement(actualResultAddress).getText());

        softAssert.assertAll();
    }
}
