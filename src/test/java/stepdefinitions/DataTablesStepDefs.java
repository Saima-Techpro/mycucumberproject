package stepdefinitions;

import io.cucumber.java.en.*;

import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("user clicks on new button")
    public void user_clicks_on_new_button() {
        dataTablesPage.newButton.click();
    }
    @Given("user enters first name as {string}")
    public void user_enters_first_name_as(String string) {
        dataTablesPage.firstName.sendKeys(string);
    }
    @Given("user enters last name as {string}")
    public void user_enters_last_name_as(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }
    @Given("user enters position as {string}")
    public void user_enters_position_as(String string) {
        dataTablesPage.position.sendKeys(string);
    }
    @Given("user enters office as {string}")
    public void user_enters_office_as(String string) {
        dataTablesPage.office.sendKeys(string);
    }
    @Given("user enters extension as {string}")
    public void user_enters_extension_as(String string) {
        dataTablesPage.extension.sendKeys(string);
    }
    @Given("user enters start date as {string}")
    public void user_enters_start_date_as(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }
    @Given("user enters salary as {string}")
    public void user_enters_salary_as(String string) {
        dataTablesPage.salary.sendKeys(string);
    }
    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablesPage.createButton.click();
    }
    @When("use searches for the {string}")
    public void use_searches_for_the(String string) {
        dataTablesPage.searchField.sendKeys(string);
    }
    @Then("verify the name fields contains the first name {string}")
    public void verify_the_name_fields_contains_the_first_name(String string) {
        Assert.assertTrue(dataTablesPage.nameField.getText().contains(string));
    }
}
