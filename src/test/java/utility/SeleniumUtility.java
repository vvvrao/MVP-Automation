package utility;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.io.File;

//import runner.ScenarioLogger;

import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;


public class SeleniumUtility {

    public static WebDriver driver;
    public static String webURL;



    public static String password = generateRandomString(10);
    public SeleniumUtility() {
    	
    	
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("/usr/bin/google-chrome/chromedriver");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("headless");
//        
//        System.setProperty("webdriver.chrome.driver","C:\\Utils\\Selenium\\chromedriver.exe"); 
        
        
//        final String CHROMEDRIVER_EXE = "chromedriver";
        
//        ClassLoader classLoader = getClass().getClassLoader();
//        String filePath = classLoader.getResource(CHROMEDRIVER_EXE).getFile();
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        ChromeDriverService service = new ChromeDriverService.Builder()
//                .usingDriverExecutable(new File(filePath))
//                .build();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
//        options.addArguments("--headless");
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.addArguments("start-maximized"); // open Browser in maximized mode
//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
////        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.merge(capabilities);
//        this.driver = new ChromeDriver(service, options);ChromeOptions ChromeOptions = new ChromeOptions();
    	
    	
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().proxyUser(System.getenv("HTTPS_PROXY_USER"));
//        WebDriverManager.chromedriver().proxyPass(System.getenv("HTTPS_PROXY_PASS"));
//        WebDriverManager.chromedriver().proxy(System.getenv("HTTPS_PROXY")).setup();
//         options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-gpu");   
//        options.addArguments("--disable-dev-shm-usage");
//        options.setExperimentalOption("useAutomationExtension", false);
//      options.addArguments("start-maximized"); // open Browser in maximized mode
//      options.addArguments("disable-infobars"); // disabling infobars
//      options.addArguments("--disable-extensions"); 
        	
    	
//    	System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/jobs/MVP-Automation/workspace/AOB_Automation/src/test/java/resources/chromedriver.exe");
//    	ChromeDriverService service = new ChromeDriverService.Builder()
//    	                .usingDriverExecutable(new File("/usr/bin/google-chrome/chromedriver"))
//    	                .usingAnyFreePort()
//    	                .build();
//    	        try {
//    	            service.start();
//    	        } catch (IOException e) {
//    	            e.printStackTrace();
//    	        }
//    	        return new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        
//        driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());

//    	WebDriverManager.chromedriver().setup();
    	 ChromeOptions options = new ChromeOptions();    	 
    	 options.setBinary("/usr/bin/chromedriver");
    	 
    	 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	 options.addArguments("--headless");
    	 options.addArguments("--no-sandbox");
    	 options.addArguments("--disable-dev-shm-usage");
    	 
    	 
    	driver = new ChromeDriver(options);
        this.driver= driver;
        // Initialize Ajax page initialisation
        PageFactory.initElements(driver, this);

    }


    public static void launchApplication() throws Exception {

        webURL = readPropertyfile("test.properties", "web_URL");
        System.out.println(webURL);

//        driver.manage().window().maximize();
        driver.get(webURL);
    }

    /*
     * method to get property value from key-value pair and specify the relative
     * path for properties file
     */
    public synchronized String getPropertyFile(String PropertyFilePath, String key) throws NoSuchFieldException {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(PropertyFilePath));
            return properties.getProperty(key).trim();
        } catch (Exception e) {
            throw new NoSuchFieldException("Cannot find key: " + key + " in property file.");
        }
    }

    /*
     * We have only test.properties in the project so we can use this method to get
     * value from given key
     */
    public static synchronized String readPropertyfile(String filename, String key) throws NoSuchFieldException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/resources/properties/" + filename;
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(filePath));
            return properties.getProperty(key).trim();
        } catch (Exception e) {
            throw new NoSuchFieldException("Cannot find key: " + key + " in property file.");
        }
    }

    public static void SendtexttoElement(WebElement ele, String value){

        try {
            ele.sendKeys(value);
        }
        catch(ElementNotInteractableException e)

        {
            throw e;
        }

    }

    public static void sendpasswordtoregistration(WebElement ele){
        try{
//            ele.gener
            ele.sendKeys(password);
        } catch (ElementNotInteractableException e) {

            throw e;

        }
    }
    public static void  sendtexttoregistration(WebElement ele){
        try{
            ele.sendKeys(generateRandomString(10));
        }catch(ElementNotInteractableException e){
            throw e;
        }
    }

    public static void sendemailtoregistration(WebElement ele){
        try{
            ele.sendKeys(generateRandomString(10)+"@gmail.com");
        } catch(ElementNotInteractableException e){
            throw e;
        }
    }

    public static String generateRandomString(int n) {

       // n = 10;

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345" + "abcdefghijklmnopqrstuvxyz67890" + "1234567890";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    public void switchTab(int i){
        List<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println("Windiows are" +tabs1);
        driver.switchTo().window(tabs1.get(i));
    }


    public static void switchtoNewwindow() {
        String parentWinHandle = driver.getWindowHandle();
        // System.out.println(parentWinHandle);
        Set<String> winHandles = driver.getWindowHandles();
        // Loop through all handles
        for (String handle : winHandles) {
            System.out.println(handle);
            if (!handle.equals(parentWinHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }


    public static  void clickElement(WebElement element) {
        try {

            element.click();
//            ScenarioLogger.log("Screen:" + element);
        }
        catch(ElementNotInteractableException e)
        {
//            ScenarioLogger.log("Screen:" + element);
            e.getMessage();

        }
    }

    public static  void clickElement1(WebDriver driver1, WebElement element) {
        try {

            element.click();
//            ScenarioLogger.log("screen");
        }
        catch(ElementNotInteractableException e)
        {
//            ScenarioLogger.log( "screen");
            e.getMessage();

        }
    }



    protected void sendTextToElement(WebElement element, String text) throws InterruptedException {

        try {
            jswait();
            element.clear();
            element.sendKeys(text);
//            ScenarioLogger.log(text);
        }

        catch(NoSuchElementException e) {
//            ScenarioLogger.log(text);
            throw e;

        }
    }


    protected void sendTextToElementwithoutAngular(WebElement element, String text) throws InterruptedException {

        try {

            Thread.sleep(5000);

            element.clear();
            element.sendKeys(text);
        }

        catch(ElementNotInteractableException e) {
//            ScenarioLogger.log(text);
            throw e;

        }
    }
    protected void sendTab(WebElement element)
    {
        jswait();
        element.sendKeys(Keys.TAB);
    }

    protected static void actionClickAndType(WebElement element, String elementName, String Value)
            throws Exception {

        try {

            Actions action = new Actions(driver);
            action.click(element).sendKeys(Value, Keys.TAB).build().perform();

        } catch (AssertionError error) {

            Assert.fail("unable to click and type " + "\'" + elementName + "\'");


            throw error;
        } catch (Exception e) {

            throw e;
        }

    }

    protected static void actionClick(WebElement element)
            throws Exception {

        try {

            Actions action = new Actions(driver);
            action.click(element).build().perform();

        } catch (AssertionError error) {

            Assert.fail("unable to click");


            throw error;
        } catch (Exception e) {

            throw e;
        }

    }

    protected void refreshPg()
    {
        driver.navigate().refresh();
    }

    protected void selectDropdownValue_Text(WebElement element, String selectVal) {
        jswait();

        Select selectelement = new Select(element);
        selectelement.selectByVisibleText(selectVal);
    }


    public static void selectValueInDropDown(String value)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String jsCmd = "document.getElementsByName('show')[0].value='" + value + "'";
        js.executeScript(jsCmd);
    }
    protected boolean iselementDisplayed(WebElement element) {
        jswait();

        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean iselementnotDisplayed(WebElement element) {
        jswait();
        boolean flag=false;
        try {

            boolean b= element.isDisplayed();
            if (b) {

                flag= false;
            }

        } catch (Exception e) {
            flag= true;
        }
        return flag;
    }

    protected boolean iselementdisabled(WebElement element) {
        jswait();

        try {
            element.isEnabled();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    protected boolean iselementenabled(WebElement element) {
        jswait();

        try {
            element.isEnabled();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean iselementsDisplayed(List<WebElement> elements) {
        jswait();
        try {
            if (elements.size() > 0) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    protected static void enterValueWithDelay(String value, long delayInMilliseconds,WebElement ele)
    {
        try {
            if (value != null && value.length() > 0 &&
                    delayInMilliseconds > 0)
            {

                int charIndex = 0;
                char[] valueCharsArray = value.toCharArray();


                for (charIndex=0 ; charIndex < valueCharsArray.length ; charIndex++)

                {
                    char val= value.charAt(charIndex);

                    ele.sendKeys(val + "");
//                    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(delayInMilliseconds))
//                            .pollingEvery(Duration.ofMillis(delayInMilliseconds)).ignoring(NoSuchElementException.class);
                }
                ele = null;
                valueCharsArray = null;

            }
        }
        catch(NoSuchElementException e )
        {

            throw e;
        }


    }


    protected String getTextfromelement(WebElement element) throws InterruptedException {
        jswait();
        String textVal = element.getText();
        return textVal;

    }

    public static boolean isTextVisibleonScreen(String text) throws InterruptedException {
        jswait();
        try {
            return driver.getPageSource().contains(text);
        } catch (Exception e) {
            return false;
        }

    }


    protected String getTextfromAttribute(WebElement element, String attributeName) throws InterruptedException {
        jswait();
        String textVal = element.getAttribute(attributeName);
        return textVal;

    }

    protected void sendValuetoElement(WebElement element, String text) {
        try {
            jswait();
            Actions builder = new Actions(driver);
            Action seriesOfActions = builder.moveToElement(element).build();
            seriesOfActions.perform();
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].value= arguments[1];", element, text);
//            ScenarioLogger.log("Screen:" + element);
        }

        catch(ElementNotInteractableException e) {
//            ScenarioLogger.log("Screen:" + element);
            throw e;
        }

    }



    public static void mouseOverOnElement(WebElement element) throws IOException {
        try {
            jswait();
            Actions act = new Actions(driver);
            act.moveToElement(element).build().perform();

        } catch (Exception e) {

//            ScenarioLogger.log("unable to move");
        }
    }


    public static void scrollIntoView(WebElement ele) throws IOException {
        try {
            jswait();
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", ele);
        } catch (Exception e) {
//            ScenarioLogger.log("unable to move");
        }
    }



//


    public void validatetextinElement1(WebElement agentele,String expr) throws InterruptedException, IOException {
        jswait();


        try {

            String ac=agentele.getText();
//            ScenarioLogger.log("Actual is " +ac);
//            ScenarioLogger.log("Expected is " +expr);

            boolean b = ac.contains(expr);

//            ScenarioLogger.log("Screen:" );

            Assert.assertEquals(b, true);
            ac=null;
            expr=null;
            agentele= null;
        }
        catch(InvalidElementStateException e)
        {
            throw e;
        }


    }




    public void validatetextinElement2(WebElement agele,String exprn) throws InterruptedException, IOException {
        jswait();


        try {
            String ac2=agele.getText();
//            ScenarioLogger.log("Actual is " +ac2);
//            ScenarioLogger.log("Expected is " +exprn);

            boolean b = ac2.contains(exprn);

//            ScenarioLogger.log("Screen:" );

            Assert.assertEquals(b, true);
            ac2=null;
            agele=null;
            exprn=null;

        }
        catch(InvalidElementStateException e)
        {
            throw e;
        }


    }

    public void validatenotextinElement(WebElement ele,String exp) throws InterruptedException, IOException {
        jswait();
        String actual=ele.getText();
//        ScenarioLogger.log("Actual is " +actual);
//        ScenarioLogger.log("Expected is " +exp);
//        Assert.assertEquals(actual.contains(exp), false, "status is updated");
        Assert.assertEquals(actual.contains(exp),false);
        ele=null;
        exp=null;
    }

    public void actionValidatetextinElement(WebElement e,String ex) throws InterruptedException, IOException {
        jswait();
        String actual=e.getAttribute("value");
//        ScenarioLogger.log(actual);
//        ScenarioLogger.log(logex);

        boolean b = actual.contains(ex);
        Assert.assertEquals(actual.contains(ex), false);

        e=null;
        e=null;
    }

    public static void clickelebytext(String txt) throws InterruptedException, IOException {
        jswait();
        WebElement eleName = driver.findElement(By.xpath("//*[contains(text(),'"+txt+"')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(eleName).click(eleName);
        actions.perform();
//        ScenarioLogger.log(
//                "Screen:" + eleName);

    }


    public static void waitTillPageLoad(WebDriver driver, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;

        // Wait for Javascript to load
//        ExpectedCondition<Boolean> jsLoad = wd -> ((JavascriptExecutor) driver)
//                .executeScript("return document.readyState").toString().equals("complete");

        // Get JS is Ready
        boolean jsReady = (Boolean) jsExec.executeScript("return document.readyState").toString().equals("complete");

        // Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("JS in NOT Ready!");

            // Wait for Javascript to load
//            wait.until(jsLoad);

        } else {
            System.out.println("JS is Ready!");

        }
        System.out.println(" page is in ready state ");
    }



    public static void waitForElement(WebElement element, String eleName, int seconds)
            throws Exception {
        try {
//			ScenarioLogger.log("---------Waiting for visibility of element---------" + element);

            waitTillPageLoad(driver, 30);
//            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
//                    .pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
//            Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);

////			ScenarioLogger.log("---------Element is visible---------" + element);
//            ScenarioLogger.log("Screen:" + eleName);
        } catch (Exception e) {


//            ScenarioLogger.log("Screen:" + eleName);
            throw e;
        } catch (AssertionError e) {

//            ScenarioLogger.log("Screen:" + eleName);
            throw e;
        }



    }

    public static void jswait()  {


        WebDriverWait wait = new WebDriverWait(driver, 500);
        wait.until(webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));

    }












}


