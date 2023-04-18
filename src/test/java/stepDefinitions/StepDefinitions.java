package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.DriverUtils;

public class StepDefinitions {
    WebDriver driver = DriverUtils.getDriver();
    ElementsPagesBackground elementsPagesBackground = new ElementsPagesBackground(driver);
    TextBox textBox = new TextBox(driver) ;
    CheckBox checkBox = new CheckBox(driver);
    RadioButton radioButton = new RadioButton(driver);
    WebTables webTables = new WebTables(driver);
    Buttons buttons = new Buttons(driver);

    //-----------------------------------------------------------------------------------------------------
    //TextBox
    @Given("I am on the demoqa home page")
    public void iAmOnTheDemoqaHomePage() {
        elementsPagesBackground.homePage();
    }

    @And("user click elements page")
    public void userClickElementsPage() {
        elementsPagesBackground.clickElements();
    }

    @And("user click text box page")
    public void userClickTextBoxPage() {
        textBox.clickTextBox();
    }

    @And("user write full name")
    public void userWriteFullName() {
        textBox.sendFullName();
    }

    @And("user write email")
    public void userWriteEmail() {
        textBox.sendEmail();
    }

    @And("user write current address")
    public void userWriteCurrentAddress() {
        textBox.sendCurrentAddress();
    }

    @When("user click submit")
    public void userClickSubmit() {
        textBox.clickSubmit();
    }

    @Then("user check information")
    public void userCheckInformation() {
        textBox.assertInfo();
    }

    //-----------------------------------------------------------------------------------------------------
    //CheckBox
    @And("user click check box page")
    public void userClickCheckBoxPage() { checkBox.clickCheckBox();
    }

    @And("user click home check box")
    public void userClickHomeCheckBox() { checkBox.clickHomeCheckBox();
    }

    @Then("user checked boxes")
    public void userCheckedBoxes() {
        checkBox.assertInfo();
    }

    //-----------------------------------------------------------------------------------------------------
    //RadioButton
    @And("user click radio button page")
    public void userClickRadioButtonPage() { radioButton.radioButton(); }

    @And("user click yes button")
    public void userClickYesButton() { radioButton.clickYesRadioButton(); }

    @Then("user check yes messages")
    public void userCheckYesMessages() {
        radioButton.checkYesMessages();
    }

    @And("user click impressive button")
    public void userClickImpressiveButton() {
        radioButton.clickImpressiveRadioButton();
    }

    @Then("user check impressive messages")
    public void userCheckImpressiveMessages() {
        radioButton.checkImpressiveMessages();
    }

    @And("user tries to click no button")
    public void userTriesToClickNoButton() {
        radioButton.clickNoRadioButton();
    }

    @Then("user sees that the button cannot be clicked")
    public void userSeesThatTheButtonCannotBeClicked() {
        radioButton.checkNoRadioButtonEnabled();
    }

    //-----------------------------------------------------------------------------------------------------
    //WebTables - Scenario-1
    @And("user click web tables")
    public void userClickWebTables() { webTables.clickWebTables(); }

    @And("user click add button")
    public void userClickAddButton() { webTables.clickAddButton(); }

    @And("user send first name")
    public void userSendFirstName() { webTables.sendFirstName(); }

    @And("user send last name")
    public void userSendLastName() { webTables.sendLastName(); }

    @And("user send email")
    public void userSendEmail() { webTables.sendEmail(); }

    @And("user send age")
    public void userSendAge() { webTables.sendAge(); }

    @And("user send salary")
    public void userSendSalary() { webTables.sendSalary(); }

    @And("user send department")
    public void userSendDepartment() { webTables.sendDepartment(); }

    @When("user click submit button")
    public void userClickSubmitButton() { webTables.clickSubmitButton(); }

    @Then("user check last row in the table")
    public void userCheckLastRowInTheTable() { webTables.checkWebTable(); }

    //WebTables - Scenario-2
    @When("user click delete button")
    public void userClickDeleteButton() {
        webTables.clickDeleteButton();
    }

    @Then("user check first row in the table")
    public void userCheckFirstRowInTheTable() {
        webTables.checkDeletedData();
    }

    //-----------------------------------------------------------------------------------------------------
    //Buttons - Scenario-1
    @And("user click buttons page")
    public void userClickButtonsPage() {
        buttons.clickButtons();
    }

    @And("user click double click me button with left mouse click twice")
    public void userClickDoubleClickMeButtonWithLeftMouseClickTwice() {
        buttons.clickDoubleClickButton();
    }

    @And("user click right click me button with right mouse click once")
    public void userClickRightClickMeButtonWithRightMouseClickOnce() {
        buttons.clickRightClickButton();
    }

    @And("user click click me button with left mouse click once")
    public void userClickClickMeButtonWithLeftMouseClickOnce() {
        buttons.clickClickMeButton();
    }

    @Then("user checked messages")
    public void userCheckedMessages() {
        buttons.checkButtonsMessages();
    }
}
