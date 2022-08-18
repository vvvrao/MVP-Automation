package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.SeleniumUtility;


public class LoginPage extends SeleniumUtility  {

     /* Login Page
     **/

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usrName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwrd;

    @FindBy(xpath = "//*[@class='button-label']//..//*[text()='Login']")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[contains(text(),'Registration')]")
    private WebElement registerTab;


    @FindBy(xpath = "//input[contains(@name,'firstName')]")
    private WebElement firstnameTxt;

    @FindBy(xpath = "//input[contains(@name,'lastName')]")
    private WebElement lastnameTxt;

    @FindBy(xpath = "//input[contains(@name,'email')]")
    private WebElement emailTxt;

    @FindBy(xpath = "//input[contains(@name,'username')]")
    private WebElement usernameTxt;


    @FindBy(xpath = "//input[contains(@name,'password')]")
    private WebElement passwordTxt;


    @FindBy(xpath = "//input[contains(@name,'confirmPass')]")
    private WebElement confirmPassTxt;


    public WebElement btnclick(String btnname) {

        angularwait();
        return driver.findElement(By.xpath("  //*[contains(@class,'button-label')]//..//*[text()='"+btnname+"']"));

    }

    public void login_application() throws Exception {

        String usrname = readPropertyfile("test.properties", "username");
        String paswrd = readPropertyfile("test.properties", "password");
        SeleniumUtility.launchApplication();

        SendtexttoElement(usrName,usrname);
        SendtexttoElement(passwrd,paswrd);

        clickElement(loginbtn);
    }


    public void clickregisterTab(){

            clickElement(registerTab);
    }


    public void clickbutton(String btnname){
     clickElement(btnclick(btnname));
    }


    public void entervaluesinregisterpage(){

        SendtexttoElement(firstnameTxt,"vandhi");
        SendtexttoElement(lastnameTxt,"rao");
        SendtexttoElement(emailTxt,"vandhita.rao@dxc.com");
        SendtexttoElement(usernameTxt,"van_r");
        SendtexttoElement(passwordTxt,"test123");
        SendtexttoElement(confirmPassTxt,"test123");

    }

    public void validate_logo(){
    // steps not added as login feature breaks

    }


}

