package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckBox;
import utils.DriverUtils;

public class CheckBoxStepDefinitions {
    WebDriver driver = DriverUtils.getDriver();
    CheckBox checkBox = new CheckBox(driver);

    @Given("I am on the demoqa home page")
    public void iAmOnTheDemoqaHomePage() {

    }

    @And("user click elements page")
    public void userClickElementsPage(){


    }
        @And("user click check box page")
    public void userClickCheckBoxPage() {

    }

    @And("user click home check box")
    public void userClickHomeCheckBox() {

    }

    @Then("user check information")
    public void userCheckInformation() {

    }

    }
