package meetSky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import meetSky.pages.LoginPage;
import meetSky.utilities.BrowserUtils;
import meetSky.utilities.ConfigurationReader;
import meetSky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;


public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();


    @Given("Navigate to login page")
    public void navigate_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky_url"));

    }


    @When("Enter  username {string} into username inputbox")
    public void enter_username_into_username_inputbox(String string) {
        loginPage.usernameInputbox.sendKeys(string);
    }

    @When("Enter  password {string} into password inputbox")
    public void enter_password_into_password_inputbox(String string) {
        loginPage.passwordInputbox.sendKeys(string);
    }

    @When("Click on the login button on the login page")
    public void click_on_the_login_button_on_the_login_page() {
        loginPage.loginButton.click();
    }

    @Then("Verify that user can login files page successfully")
    public void verify_that_user_can_login_files_page_successfully() {
        Assert.assertTrue(loginPage.fileIcon.isDisplayed());
    }
//----

    @Then("Verify that user can not login and see the Notice Message :Wrong username or password.")
    public void verify_that_user_can_not_login_and_see_the_notice_message_wrong_username_or_password() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }

    @When("Enter the  password  {string} into  password inputbox.")
    public void enter_the_password_into_password_inputbox(String string) {
        loginPage.passwordInputbox.sendKeys(string);
    }

    @Then("Verify that user can not login and see the notice message:Please fill out this field")
    public void verify_that_user_can_not_login_and_see_the_notice_message_please_fill_out_this_field() {
        BrowserUtils.sleep(4);
        String message = Driver.getDriver().findElement(By.name("password")).getAttribute("validationMessage");
        Assert.assertTrue(message.equalsIgnoreCase("Please fill in this field."));
    }


    @Then("check if password appeare in the form of dots")
    public void checkIfPasswordAppeareInTheFormOfDots() {
        String input = loginPage.passwordInputbox.getAttribute("type");
        System.out.println(input);
        Assert.assertTrue(input.equalsIgnoreCase("password"));
    }


    @And("Click on the eye sign after entering the password")
    public void clickOnTheEyeSignAfterEnteringThePassword() {
        loginPage.eyePassword.click();
    }

    @Then("Verify that user can see the password explicitly")
    public void verifyThatUserCanSeeThePasswordExplicitly() {
        String input = loginPage.passwordInputbox.getAttribute("type");
        System.out.println(input);
        Assert.assertEquals(input, "text");
    }
//----

    @When("Verify that user can see the Forgot password? link")
    public void verify_that_user_can_see_the_forgot_password_link() {
        loginPage.forgotPaswword.isDisplayed();
    }

    @When("Click on the Forgot password? link")
    public void click_on_the_forgot_password_link() {
        loginPage.forgotPaswword.click();
    }

    @Then("Verify that user can see the Reset Password button")
    public void verify_that_user_can_see_the_reset_password_button() {
        loginPage.resetPassword.isDisplayed();
    }

    //-----


    @When("Verify that user can see valid placeholders on Username inputbox")
    public void verify_that_user_can_see_valid_placeholders_on_username_inputbox() {
        Assert.assertTrue(loginPage.placeholderUsername.isDisplayed());
    }

    @Then("Verify that user can see valid placeholders on Password inputbox")
    public void verify_that_user_can_see_valid_placeholders_on_password_inputbox() {
        Assert.assertTrue(loginPage.placeholderPassword.isDisplayed());

    }


}








