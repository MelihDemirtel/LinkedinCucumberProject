package pages;

import org.openqa.selenium.By;

public class WebElements {

    //GeneralDatas
    static By homePage = By.xpath("//div[@class='category-cards']");
    static By elementsButton = By.xpath("//h5[text()='Elements']");
    static By textBoxButton = By.xpath("//span[text()='Text Box']");

    //TextBox
    static String fullName = "Test";
    static String email = "test@deneme.com";
    static String currentAddress = "Test, Test/Deneme";
    static By fullNameLabel = By.id("userName");
    static By emailLabel = By.id("userEmail");
    static By currentAddressLabel = By.id("currentAddress");
    static By submitButton = By.id("submit");
    static By actualResultName = By.id("name");
    static By actualResultEmail = By.id("email");
    static By actualResultAddress = By.xpath("//p[@id='currentAddress']");

    //CheckBox
    static By checkBoxButton = By.xpath("//span[text()='Check Box']");
    static By homeCheckBoxButton = By.className("rct-title");
    static By actualResult = By.id("result");

    //RadioButton
    static String expectedYesRadioButtonMessages = "Yes";
    static String expectedImpressiveRadioButtonMessages = "Impressive";
    static boolean isClickableNoRadioButton;
    static By radioButton = By.xpath("//span[text()='Radio Button']");
    static By yesRadioButton = By.xpath("//label[@for='yesRadio']");
    static By impressiveRadioButton = By.xpath("//label[@for='impressiveRadio']");
    static By noRadioButton = By.xpath("//label[@for='noRadio']");
    static By actualRadioButtonMessages = By.xpath("//span[@class='text-success']");




}
