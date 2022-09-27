package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.SeleniumUtility;


public class LoginPage extends SeleniumUtility  {

     /* Login Page
     **/
	
		public static String password = generateRandomString(10);
	    public static String username = generateRandomString(10);
	    public static String email = generateRandomString(10) + "@gmail.com";
	    public static String firstname = generateRandomString(5);
	    public static String lastname = generateRandomString(3);

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usrName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwrd;

    @FindBy(xpath = "//*[@class='button-label']//..//*[text()='Sign-In']")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[contains(text(),'Registration')]")
    private WebElement registerTab;

    @FindBy(xpath = "//*[@class='sc-dwfUuu cQtbsq']//..//*[contains(text(),'Login')]")
    private WebElement LoginWithGoogle;

    @FindBy(xpath = "//*[@class='w1I7fb']//..//*[text()='Aob user']")
    private WebElement clickonEmail;

    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'Acc')]")
    private WebElement accountsTab;

    @FindBy(xpath = "//*[contains(@class,'MuiTypography-root sc-dlfnuX jnNLSi card-title MuiTypography-h5 MuiTypography-gutterBottom')]")
    private WebElement myaccountvisible;

//    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'New')]")
//    private WebElement newTransfertab;

    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'Loan')]")
    private WebElement loan;

    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'Card')]")
    private WebElement card;

    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'Forecast')]")
    private WebElement forecast;

    @FindBy(xpath = "//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'Stock')]")
    private WebElement stock;

    @FindBy(xpath="//img[@alt='Advantage Bank logo']")
    private WebElement companyLogo;


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

    @FindBy(xpath = "//input[@name='identifier']")
    private WebElement EnterGmailaddress;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement EnterGmailPassword;

    @FindBy(xpath = "//*[@class='VfPpkd-RLmnJb']//..//*[text()='Next']")
    private WebElement NextButtononGmail;


    public WebElement btnclick(String btnname) {

        jswait();
        return driver.findElement(By.xpath("  //*[contains(@class,'button-label')]//..//*[text()='"+btnname+"']"));

    }

    public WebElement tabclick(String tabname){
        jswait();
        return driver.findElement(By.xpath("//*[contains(@class,'sc-idOiZg bwAMjs nav-link')]//..//*[contains(text(),'"+tabname+"')]"));
    }

    public void login_application() throws Exception {

        java.lang.String usrname = readPropertyfile("test.properties", "username");
        java.lang.String paswrd = readPropertyfile("test.properties", "password");
        SeleniumUtility.launchApplication();

        SendtexttoElement(usrName,usrname);
        SendtexttoElement(passwrd,paswrd);

        clickElement(loginbtn);
    }

    public void login_with_google() throws Exception{
        java.lang.String gmailusername = readPropertyfile("test.properties", "gmail_Username");
        java.lang.String Gmailpassword = readPropertyfile("test.properties", "gmail_Password");
        SendtexttoElement(EnterGmailaddress,gmailusername);
        Thread.sleep(3000);
        clickElement(NextButtononGmail);
        Thread.sleep(3000);
        SendtexttoElement(EnterGmailPassword,Gmailpassword);
        Thread.sleep(3000);
        clickElement(NextButtononGmail);
    }

    
   public void login_application_withglobaluser() throws Exception {
	   
	   SeleniumUtility.launchApplication();

       SendtexttoElement(usrName,username);
       SendtexttoElement(passwrd,password);

       clickElement(loginbtn);
   }

    public void clickregisterTab(){

            clickElement(registerTab);
    }

    public void clickloginwithGoogle(){
        clickElement(LoginWithGoogle);
    }

    public void clickonemail(){
        clickElement(clickonEmail);
    }

//    public void clickaccountsTab() throws InterruptedException {
//
//
//        Thread.sleep(3000);
//        clickElement(accountsTab);
//    }
//
////    public void clicknewtransferTab() throws InterruptedException {
////        Thread.sleep(3000);
////        clickElement(newTransfertab);
////    }
//
//    public void clickloanTab() throws InterruptedException {
//        Thread.sleep(3000);
//        clickElement(loan);
//    }
//
//    public void clickcardsTab() throws InterruptedException {
//        Thread.sleep(3000);
//        clickElement(card);
//    }
//
//    public void clickforecastTab() throws InterruptedException {
//        Thread.sleep(3000);
//        clickElement(forecast);
//    }
//
//    public void clickstocksTab() throws InterruptedException {
//        Thread.sleep(3000);
//        clickElement(stock);
//    }

    public void myaccountsvisible(){
        iselementDisplayed(myaccountvisible);
    }


    public void clickbutton(String btnname){
     clickElement(btnclick(btnname));
    }

    public void clickTab(String tabname) throws InterruptedException {
        Thread.sleep(3000);
        clickElement(tabclick(tabname));
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

    
   
    
    
    public void entervaluesinregisterpage(){

    	SendtexttoElement(firstnameTxt,firstname);
    	SendtexttoElement(lastnameTxt,lastname);
    	SendtexttoElement(emailTxt,email);
    	SendtexttoElement(usernameTxt,username);
    	SendtexttoElement(passwordTxt,password);
    	SendtexttoElement(confirmPassTxt,password);

    }

    public void validate_logo(){
    // steps not added as login feature breaks
        clickElement(companyLogo);

    }


}

