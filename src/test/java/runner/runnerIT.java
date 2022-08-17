package runner;

import java.util.Arrays;
import java.util.function.Predicate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.Pickle;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources",
        tags="@TC_001",
        glue = "glue",
        plugin = {"json:target/cucumber-report/cucumber.json" })
public class runnerIT {

    /**
     * This Predicate (function) can define for each scenario (or iteration of a
     * Scenario Outline) if it has the tag @sequential.<br>
     * We use this Predicate to filter our scenarios in two groups: sequential and
     * parallel
     */
    private static final Predicate<Pickle> isSequential = pickle -> pickle.getTags().contains("@sequential");

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }


    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "parallelScenarios")
    public void runParallelScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider(parallel = true)
    public Object[][] parallelScenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        /**
         * All parallel scenarios are filtered using this method and our Predicate
         * (negated = not sequential = parallel)
         */
        return filter(testNGCucumberRunner.provideScenarios(), isSequential.negate());
    }


    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios in the Sequential group", dataProvider = "sequentialScenarios")
    public void runSequentialScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] sequentialScenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        /**
         * All sequential scenarios are filtered using this method and our Predicate
         */
        return filter(testNGCucumberRunner.provideScenarios(), isSequential);
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }

    /**
     * Filters all scenarios based on a Predicate<br>
     * You could also use this with other Predicates
     *
     * @param scenarios
     * @param accept
     * @return
     */
    private Object[][] filter(Object[][] scenarios, Predicate<Pickle> accept) {
        return Arrays.stream(scenarios).filter(objects -> {
            PickleWrapper candidate = (PickleWrapper) objects[0];
            return accept.test(candidate.getPickle());
        }).toArray(Object[][]::new);
    }

}
