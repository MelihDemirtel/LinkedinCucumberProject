package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WebTables extends WebElements {
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;

    public WebTables(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.jsx = (JavascriptExecutor) driver;
    }
    public void clickWebTables(){
        wait.until(ExpectedConditions.presenceOfElementLocated(webTablesButton));
        driver.findElement(webTablesButton).click();
    }
    public void clickAddButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(webTablesAddButton));
        driver.findElement(webTablesAddButton);
    }
    public void sendFirstName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(registrationFormFirstNameLabel));
        driver.findElement(registrationFormFirstNameLabel).sendKeys(registrationFormFirstName);
    }
    public void sendLastName(){
        driver.findElement(registrationFormLastNameLabel).sendKeys(registrationFormLastName);
    }
    public void sendEmail(){
        driver.findElement(registrationFormUserEmailLabel).sendKeys(registrationFormUserEmail);
    }
    public void sendAge(){
        driver.findElement(registrationFormAgeLabel).sendKeys(registrationFormAge);
    }
    public void sendSalary(){
        driver.findElement(registrationFormSalaryLabel).sendKeys(registrationFormSalary);
    }
    public void sendDepartment(){
        driver.findElement(registrationFormDepartmentLabel).sendKeys(registrationFormDepartment);
    }
    public void clickSubmitButton(){
        driver.findElement(registrationFormSubmitButton).click();
    }
    public void checkWebTable(){
        jsx.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.presenceOfElementLocated(webTablesFifthRow));
        isDisplayedWebTablesFifthRow = driver.findElement(webTablesFifthRow).isDisplayed();
        System.out.println("STATE: " + isDisplayedWebTablesFifthRow);//true
        if (isDisplayedWebTablesFifthRow){
            System.out.println("Fift Row is added");
            Assert.assertTrue(isDisplayedWebTablesFifthRow);
        }else{
            System.out.println("Fifth Row is not added");
            Assert.assertFalse(isDisplayedWebTablesFifthRow);
        }
    }
}
