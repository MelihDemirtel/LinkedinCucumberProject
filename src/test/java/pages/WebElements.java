package pages;

import org.openqa.selenium.By;

public class WebElements {

    //GeneralDatas
    static By homePage = By.xpath("//div[@class='category-cards']");
    static By elementsButton = By.xpath("//h5[text()='Elements']");
    static By textBoxButton = By.xpath("//span[text()='Text Box']");
    static By webTablesButton = By.xpath("//span[text()='Web Tables']");
    static By buttonsButton = By.xpath("//span[text()='Buttons']");

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
    static String registrationFormFirstName = "Test";
    static String registrationFormLastName = "Deneme";
    static String registrationFormUserEmail = "test@deneme.com";
    static String registrationFormAge = "25";
    static String registrationFormSalary = "12500";
    static String registrationFormDepartment = "Test Department";
    static String expectedWebTablesFirstRowFirstColumnData = "Cierra";
    static boolean isDisplayedWebTablesFifthRow;
    static By webTablesAddButton = By.id("addNewRecordButton");
    static By webTablesRegistrationForm = By.id("userForm");
    static By registrationFormFirstNameLabel = By.id("firstName");
    static By registrationFormLastNameLabel = By.id("lastName");
    static By registrationFormUserEmailLabel = By.id("userEmail");
    static By registrationFormAgeLabel = By.id("age");
    static By registrationFormSalaryLabel = By.id("salary");
    static By registrationFormDepartmentLabel = By.id("department");
    static By registrationFormSubmitButton = By.id("submit");
    static By webTablesFifthRow = By.xpath("(//div[@role='row'])[5]");
    static By actualWebTablesFirstRowFirstColumnLocator = By.xpath("(//div[@class='rt-td'])[1]");
    static By webTablesFirstDeleteButton = By.id("delete-record-1");

    //Buttons
    static String expectedDoubleClickMessage = "You have done a double click";
    static String expectedRightClickMessage = "You have done a right click";
    static String expectedClickMeMessage = "You have done a dynamic click";
    static By actualDoubleClickMessage = By.id("doubleClickMessage");
    static By actualRightClickMessage = By.id("rightClickMessage");
    static By actualClickMeMessage = By.id("dynamicClickMessage");
    static By doubleClickBtn = By.id("doubleClickBtn");
    static By rightClickBtn = By.id("rightClickBtn");
    static By dynamicClickBtn = By.xpath("(//button[@type='button'])[4]");




}
