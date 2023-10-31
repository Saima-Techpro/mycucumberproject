package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BlueRentalLoginPage;

import java.util.List;

import static utilities.WaitUtils.waitFor;

public class BlueRentalStepDefs {
    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    @When("user enters the admin email and password")
    public void user_enters_the_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials = dataTable.row(1);//index starts at 0
//        credentials = {jack1@gmail.com,12345 }
        blueRentalLoginPage.email.sendKeys(credentials.get(0));
        blueRentalLoginPage.password.sendKeys(credentials.get(1));
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        blueRentalLoginPage.loginButton.click();
    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {
        waitFor(2);
        Assert.assertTrue(blueRentalLoginPage.profile.isDisplayed());
    }


}
