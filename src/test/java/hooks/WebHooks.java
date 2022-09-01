package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utility.SeleniumUtility.driver;

public class WebHooks {


    @Before(order = 1)
    public void setTestname(Scenario scenario) {

        System.out.println("in before");
    }

    @After(order=2)
    public void afterRestScenario(Scenario scenario) {

            driver.quit();
        }
    }


