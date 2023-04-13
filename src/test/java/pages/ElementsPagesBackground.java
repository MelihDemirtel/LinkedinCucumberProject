package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsPagesBackground extends WebElements {
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jsx;

    public ElementsPagesBackground(WebDriver driver) {
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
}
