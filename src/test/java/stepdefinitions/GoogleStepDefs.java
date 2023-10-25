package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefs {

    GoogleHomePage googleHomePage = new GoogleHomePage();

    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
//        try{
//            googleHomePage.cookiePopUp.click();
//        }catch (Exception e){
//        }

    }
    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomePage.googleSearchBox.sendKeys("iPhone" + Keys.ENTER);

    }
    @Then("verify the result contains iPhone")
    public void verify_the_result_contains_i_phone() {
       assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }

    @Given("search for porcelain tea pot")
    public void search_for_porcelain_tea_pot() {
        googleHomePage.googleSearchBox.sendKeys("porcelain tea pot" + Keys.ENTER);
    }
    @Then("verify the result contains porcelain tea pot")
    public void verify_the_result_contains_porcelain_tea_pot() {
        assertTrue(Driver.getDriver().getTitle().contains("porcelain tea pot"));
    }
}
