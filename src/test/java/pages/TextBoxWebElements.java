package pages;

import org.openqa.selenium.By;

public class TextBoxWebElements {

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
}
