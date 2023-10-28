package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;

public class CommonStepDefs {
    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
    }
    @Then("user verifies page title contains {string}")
    public void user_verifies_page_title_contains(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
