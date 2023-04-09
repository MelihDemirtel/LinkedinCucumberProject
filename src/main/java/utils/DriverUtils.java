package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Properties;

public class DriverUtils {
    private static WebDriver driver;
    private static Properties properties;

    public static WebDriver initialize_Driver() {
        properties = ConfigReader.getProperties();
        String browser = properties.getProperty("browser");

        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageWait));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));

        return getDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}

