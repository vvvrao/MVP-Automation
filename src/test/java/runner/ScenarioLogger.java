package runner;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.LocalDateTime;

import static utility.SeleniumUtility.driver;

public class ScenarioLogger {

    private static ThreadLocal<Scenario> scenarios = new ThreadLocal<>();


    public static void setScenario(Scenario scenario) {
        scenarios.set(scenario);
    }


    public static void attachScreenshot(String name) {

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        scenarios.get().attach(String.valueOf(SrcFile), "image/png", scenarios.get().getName()+" "+ LocalDateTime.now());
            }

//    public static void attachScreenshot(byte[] screenshot) {
//        scenarios.get().attach(screenshot, "image/png", scenarios.get().getName()+" "+ LocalDateTime.now());
//    }

    public static void log(String logMessage) {
        scenarios.get().log(logMessage);
    }
}
