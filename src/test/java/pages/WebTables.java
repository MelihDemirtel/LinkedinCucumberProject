package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    }
}
