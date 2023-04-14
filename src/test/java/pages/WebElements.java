package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    //WebTables
    static String firstName = "Test";
    static String lastName = "Deneme";
    static String userEmail = "test@deneme.com";
    static String age = "25";
    static String salary = "12500";
    static String department = "Test Department";
    static boolean isEmptyWebTablesFifthRow;
    static By webTablesAddButton = By.id("addNewRecordButton");
    static By registrationFormFirstNameLabel = By.id("firstName");
    static By registrationFormLastNameLabel = By.id("lastName");
    static By registrationFormUserEmailLabel = By.id("userEmail");
    static By registrationFormAgeLabel = By.id("age");
    static By registrationFormSalaryLabel = By.id("salary");
    static By registrationFormDepartmentLabel = By.id("department");
    static By registrationFormSubmitButton = By.id("submit");
    static By webTablesFifthRow = By.xpath("(//div[@role='row'])[5]");




}
