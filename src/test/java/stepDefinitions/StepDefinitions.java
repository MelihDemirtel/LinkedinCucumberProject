package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckBox;
import pages.TextBox;
import utils.DriverUtils;

public class StepDefinitions {
    WebDriver driver = DriverUtils.getDriver();
    TextBox textBox = new TextBox(driver) ;
    CheckBox checkBox = new CheckBox(driver);

    @Given("I am on the demoqa home page")
    public void iAmOnTheDemoqaHomePage() {
        textBox.homePage();
    }

    @And("user click elements page")
    public void userClickElementsPage() {
        textBox.clickElements();
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
}
