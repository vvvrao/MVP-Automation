package glue;


import io.cucumber.java.en.Given;

import library.InitializePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utility.SeleniumUtility;


public class LoginSteps  {

    private final LoginPage lp= new LoginPage();

//    public LoginSteps(LoginPage lp){
//
//        super();
//        this.lp=lp;
//    }

//    InitializePages init = new InitializePages(driver);

    @Given("user logs into Advantage bank")
    public void user_logs_into_Advantage_bank() throws Exception {

//        String users = readPropertyfile("test.properties", "username");
//        String password = readPropertyfile("test.properties", "password");
//
//
        lp.login_application();

//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(users);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//        driver.findElement(By.xpath("//*[@class='button-label'][contains(text(),'Login')]")).click();

    }
}