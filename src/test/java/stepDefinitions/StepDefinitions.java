package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckBox;
import pages.ElementsPagesBackground;
import pages.RadioButton;
import pages.TextBox;
import utils.DriverUtils;

public class StepDefinitions {
    WebDriver driver = DriverUtils.getDriver();
    ElementsPagesBackground elementsPagesBackground = new ElementsPagesBackground(driver);
    TextBox textBox = new TextBox(driver) ;
    CheckBox checkBox = new CheckBox(driver);
    RadioButton radioButton = new RadioButton(driver);

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

    @And("user click web tables")
    public void userClickWebTables() {
    }

    @And("user click add button")
    public void userClickAddButton() {
    }

    @And("user send first name")
    public void userSendFirstName() {
    }

    @And("user send last name")
    public void userSendLastName() {
    }

    @And("user send email")
    public void userSendEmail() {
    }

    @And("user send age")
    public void userSendAge() {
    }

    @And("user send salary")
    public void userSendSalary() {
    }

    @And("user send department")
    public void userSendDepartment() {
    }

    @When("user click submit button")
    public void userClickSubmitButton() {
    }

    @Then("user check last row in the table")
    public void userCheckLastRowInTheTable() {
    }
}
