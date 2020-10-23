package LoginStep;



import Steps.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login extends Base {
	
	/*
	 * @Given("open the chrome browser") public void open_the_chrome_browser() {
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
	 * 
	 * @Given("load the application Url") public void load_the_application_Url() {
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 */

	@Given("enter the username as (.*)")
	public void enter_Username(String uname) throws InterruptedException 
	{
		driver.findElementById("username").sendKeys(uname);
	   Thread.sleep(1000);
	}

	@Given("enter the password as (.*)")
	public void enter_password(String pwd) 
	{
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click on Login Button")
	public void click_on_Login_Button() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElementByClassName("decorativeSubmit").click();
		
	}

	@Then("homepage will appear")
	public void homepage_will_appear() throws InterruptedException 
	{
		//driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		System.out.println("**********************************");
		System.out.println(driver.getTitle());
		System.out.println("**********************************");
	}

}
