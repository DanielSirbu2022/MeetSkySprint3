package meetSky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import meetSky.pages.LoginPage;
import meetSky.pages.LogoutPage;
import meetSky.utilities.Driver;
import org.junit.Assert;


public class Logout_StepDefinitions {
     LogoutPage logoutPage= new LogoutPage();
     LoginPage loginPage = new LoginPage();

    @When("Click on the profile icon")
    public void click_on_the_profile_icon() {
    logoutPage.profileIcon.click();
    }
    @When("Verify that user can see the Log out link")
    public void verify_that_user_can_see_the_log_out_link() {
    logoutPage.logoutLink.isDisplayed();
    }
    @When("Click on the Log out link")
    public void click_on_the_log_out_link() {
logoutPage.logoutLink.click();
    }
    @Then("Verify that user can log out on the files page and see log in page")
    public void verify_that_user_can_log_out_on_the_files_page_and_see_log_in_page() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @And("Click on the step back button")
    public void clickOnTheStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("Verify that user can NOT go to home page again")
    public void verifyThatUserCanNOTGoToHomePageAgain() {
Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
}
