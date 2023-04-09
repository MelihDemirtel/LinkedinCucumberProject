package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;

    @Before
    public void before(){
        properties = ConfigReader.initialize_Properties();
        driver = DriverUtils.initialize_Driver();
    }
    @After
    public void after(){
        driver.quit();
    }
}
