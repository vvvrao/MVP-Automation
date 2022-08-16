package library;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class InitializePages {


    public LoginPage o_login = null;


    public InitializePages(WebDriver driver) {

        o_login = new LoginPage();
    }
}
