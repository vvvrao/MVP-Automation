package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.SeleniumUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class LoginPage extends SeleniumUtility {


    /**
     * Login Page
     **/

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usrName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwrd;

    @FindBy(xpath = "//*[@class='button-label']//..//*[text()='Login']")
    private WebElement loginbtn;



    public void login_application() throws Exception {

//        String usrname = readPropertyfile("test.properties", "username");
//        String paswrd = readPropertyfile("test.properties", "password");
        launchApplication();
        usrName.sendKeys("test_user");
        passwrd.sendKeys("test123");
        loginbtn.click();
    }



}

