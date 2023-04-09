package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TextBox;
import utils.DriverUtils;

public class StepDefinitions {
    WebDriver driver = DriverUtils.getDriver();
    TextBox textBox = new TextBox(driver) ;

    @Given("I am on the demoqa home page")
    public void iAmOnTheDemoqaHomePage() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        textBox = new TextBox(driver);
    }

    @When("user click elements page")
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
}
