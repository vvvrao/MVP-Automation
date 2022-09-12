package hooks;




import io.cucumber.java.After;
import io.cucumber.java.Before;



//import org.junit.After;
//import org.junit.Before;

import static utility.SeleniumUtility.driver;


public class WebHooks {

    @Before
    public void setTestname() {

        System.out.println("in before");
    }


    @After
    public void afterRestScenario() {

            driver.quit();
        }


}


