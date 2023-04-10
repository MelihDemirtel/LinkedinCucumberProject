package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxWebElements {
    static WebDriver driver;

    static By homePage = By.xpath("//div[@class='category-cards']");
    static WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
    static WebElement checkBoxButton = driver.findElement(By.xpath("//span[text()='Check Box']"));
    static WebElement homeCheckBoxButton = driver.findElement(By.className("rct-title"));

    static WebElement actualResult = driver.findElement(By.id("result"));
}
