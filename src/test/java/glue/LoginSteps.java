package glue;

import io.cucumber.java.en.Given;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.*;
import pages.LoginPage;


public class LoginSteps  {

    private final LoginPage lp= new LoginPage();


    @Test
     @Given("user logs into Advantage bank")
    public void user_logs_into_Advantage_bank() throws Exception {
        lp.login_application();
        Reporter.log("user logged in successfully");

    }



}