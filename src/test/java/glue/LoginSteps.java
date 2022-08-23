package glue;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Test;
import pages.LoginPage;
import utility.SeleniumUtility;

import static utility.SeleniumUtility.driver;

public class LoginSteps {



    LoginPage lp = new LoginPage();


    @Given("user navigates to advantage bank url")
    public void user_navigates_to_advantage_bank_url() throws Exception {

        lp.login_application();
    }


    @Given("click on Register tab")
    public void click_on_register_tab() {
        lp.clickregisterTab();
    }


    @Then("user enters all fields in the registration page")
    public void user_enters_all_fields_in_the_registration_page() {
        lp.entervaluesinregisterpage();
    }


    @Then("click on {string} button")
    public void click_on_button(String string) {
        lp.clickbutton(string);
    }


    @Then("User must be registered")
    public void user_must_be_registered() {
        //registeration not working
    }


    @Given("user logs into Advantage bank")
    public void user_logs_into_advantage_bank() throws Exception {
        lp.login_application();
    }


    @Then("A default Log in window of Advantage Bank Portal Should Open")
    public void a_default_log_in_window_of_advantage_bank_portal_should_open() {
        // Write code here that turns the phrase above into concrete actions
        lp.validate_logo();
    }



}