package glue;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static utility.SeleniumUtility.driver;
import static utility.SeleniumUtility.jswait;


public class LoginSteps{


  
    LoginPage lp = new LoginPage();


     @Given("user logs into Advantage bank")
    public void user_logs_into_Advantage_bank() throws Exception {
         lp.login_application();

        assertTrue(true);

     }

         @Then("A default Log in window of Advantage Bank Portal Should Open")
         public void a_default_log_in_window_of_advantage_bank_portal_should_open() throws InterruptedException {
             lp.validate_logo();
             jswait();
             Thread.sleep(3000);

             assertTrue(true);

         }

    @Given("user navigates to advantage bank url")
    public void user_naviagtes_to_advantage_bank_url() throws Exception {
        lp.launchApplication();

        assertTrue(true);
    }

    @And("click on Register tab")
    public void click_register_tab(){

         lp.clickregisterTab();

        assertTrue(true);
    }

    @Then("user enters all fields in the registration page")
    public void user_enters_all_fields_in_the_registration_page() {
        lp.entervaluesinregisterpage();
    }

    @Then("click on {string} button")
    public void click_on_button(String string) {

         lp.clickbutton(string);

        assertTrue(true);
    }

 
    @Then("user gets prompted with my accounts page")
    public void user_gets_prompted_with_my_accounts_page(){
         lp.myaccountsvisible();

        assertTrue(true);
    }



    @Then("user click on {string} tab on dashboard")
    public void user_click_on_tab_on_dashboard(String string) throws InterruptedException {
         lp.clickTab(string);

        assertTrue(true);
    }
    
    @Given("user logs into Advantage bank using registeration credentials")
    public void loginwith_registercred() throws Exception {

    	lp.login_application_withglobaluser();

        assertTrue(true);

    }
    
    
    @Then("User must be registered")
    public void user_must_be_registered() {
        
    	 lp.validate_logo();

        assertTrue(true);
    }
    
    @Then("close app")
    public void close_app() {
    	
    	driver.close();

        assertTrue(true);
    }

    @Given("user navigates to advantage bank url for social media login")
    public void user_navigates_to_advantage_bank_url_for_social_media_login() throws Exception {
        lp.launchApplicationforsocialMedia();
        assertTrue(true);
    }

    @And("User click on Google tab")
    public void User_click_on_Google_tab(){
         lp.clickloginwithGoogle();
         assertTrue(true);
    }

    @And("user enters their respective Gmail address and password and click on next")
    public void user_enters_their_respective_Gmail_address_and_password_and_click_on_next() throws Exception {
         Thread.sleep(9000);
         Set <String> windows = driver.getWindowHandles();
         Iterator <String> it = windows.iterator();
         String p = it.next();
         String c = it.next();
         driver.switchTo().window(c);
         jswait();
         lp.login_with_google();
//         lp.clickonemail();
         assertTrue(true);
         jswait();
         driver.switchTo().window(p);
    }


    @Then("user clicks on profile icon")
    public void userClicksOnProfileIcon() {
        lp.clickonprofileicon();
        assertTrue(true);

    }

    @Then("user clicks on Management Console in the list")
    public void userClicksOnManagementConsoleInTheList() throws InterruptedException {
        lp.clickonmanagementconsole();
        Thread.sleep(3000);
        assertTrue(true);
    }

    @Then("a new tab should open")
    public void aNewTabShouldOpen(){
         lp.switchTab(1);
         lp.clickonmerchantusermanagement();

    }

    @Then("user clicks on merchants")
    public void userClicksOnMerchants() throws InterruptedException {
        lp.clickonmerchants();
        assertTrue(true);
        Thread.sleep(3000);
    }

    @Then("a list of merchants should appear for the user")
    public void aListOfMerchantsShouldAppearForTheUser() throws InterruptedException {
         lp.validateelements();
         Thread.sleep(3000);
    }
}