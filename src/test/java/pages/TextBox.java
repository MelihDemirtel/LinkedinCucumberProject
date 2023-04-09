package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class TextBox {
    private WebDriver driver;
    private SoftAssert softAssert;

    private String fullName = "Test";
    private String email = "test@deneme.com";
    private String currentAddress = "Test, Test/Deneme";

    private By elementsButton = By.xpath("//h5[text()='Elements']");
    private By textBoxButton = By.xpath("//span[text()='Text Box']");
    private By fullNameLabel = By.id("userName");
    private By emailLabel = By.id("userEmail");
    private By currentAddressLabel = By.id("currentAddress");
    private By submitButton = By.id("submit");

    private By actualResultName = By.id("name");
    private By actualResultEmail = By.id("email");
    private By actualResultAddress = By.xpath("//p[@id='currentAddress']");

    public TextBox(WebDriver driver) {
        this.driver = driver;
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
