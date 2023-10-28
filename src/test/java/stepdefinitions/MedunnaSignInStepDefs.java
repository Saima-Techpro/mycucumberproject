package stepdefinitions;

import io.cucumber.java.en.*;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.Driver;
import utilities.WaitUtils;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

    @Given("user is on {string} page")
    public void userIsOnPage(String url) {
        Driver.getDriver().get(url);
    }

    @When("click on user icon")
    public void click_on_user_icon() {
        WaitUtils.waitFor(1);
        medunnaHomePage.userIcon.click();
    }

    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        WaitUtils.waitFor(1);
        medunnaHomePage.signInOption.click();
    }

    @When("enter {string} in Username input")
    public void enter_in_username_input(String username) {
        WaitUtils.waitFor(1);
        medunnaLoginPage.usernameInput.sendKeys(username);
    }

    @When("enter {string} in Password input")
    public void enter_in_password_input(String password) {
        WaitUtils.waitFor(1);
        medunnaLoginPage.passwordInput.sendKeys(password);
    }

    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {
        WaitUtils.waitFor(1);
        medunnaLoginPage.rememberMeCheckbox.click();
    }
    @When("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
        WaitUtils.waitFor(1);
        medunnaLoginPage.signInSubmitButton.click();
    }


}


