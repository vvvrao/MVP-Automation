//package hooks;
//
//import java.time.LocalDateTime;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
////import runner.ScenarioLogger;
//
//import static utility.SeleniumUtility.driver;
//
//public class WebHooks {
//
////    @After(order = 99998, value = "not @nonGUI")
////    public void afterSeleniumScenario(Scenario scenario) {
////
//////        if (scenario.isFailed()) {
//////            scenario.attach(Camera.takeScreenshotOfWholePage(saveAndReturnImage(), "image/png", "scenario failed" + LocalDateTime.now());
//////        }
////        //DriverManagers.destroyBothDriverManagers();
////    }
//
//    @Before(order = 1, value = "not @nonGUI")
//    public void setTestname(Scenario scenario) {
//
////        ScenarioLogger.setScenario(scenario);
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("name", scenario.getName());
////        driver.getOptions().merge(caps);
//    }
//
//    @After("@nonGUI")
//    public void afterRestScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
//            scenario.log("scenario failed" + scenario.getName() + "_" + LocalDateTime.now());
//            driver.quit();
//        }
//    }
//
////    @Before("@nonGUI")
////    public void setTestname1(Scenario scenario) {
//////        ScenarioLogger.setScenario(scenario);
////    }
//}
