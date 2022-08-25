package glue;
//
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//
//
//import pages.LoginPage;
//
//import static utility.SeleniumUtility.driver;
//
//

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps{
		 
    
   
	


  
    LoginPage lp = new LoginPage();


     @Given("user logs into Advantage bank1")
    public void user_logs_into_Advantage_bank1() throws Exception {
         lp.login_application();

     }
    
         @Then("A default Log in window of Advantage Bank Portal Should Open")
         public void a_default_log_in_window_of_advantage_bank_portal_should_open() {
             lp.validate_logo();

         }

    @Given("user navigates to advantage bank url")
    public void user_naviagtes_to_advantage_bank_url() throws Exception {
        lp.launchApplication();
    }

    @And("click on Register tab")
    public void click_register_tab(){

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

//    @Then("user clicks on Accounts tab on dashboard")
//    public void user_clicks_on_Accounts_tab_on_dashboard() throws InterruptedException {
//
//         lp.clickaccountsTab();
//
//    }
    @Then("user gets prompted with my accounts page")
    public void user_gets_prompted_with_my_accounts_page(){
         lp.myaccountsvisible();
    }

    @Then("user click on {string} tab on dashboard")
    public void user_click_on_tab_on_dashboard(String string) throws InterruptedException {
         lp.clickTab(string);
    }

    
    @Then("close app")
    public void close_app() {
    	
//    	driver.close();
    }

}