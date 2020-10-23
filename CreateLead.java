package Steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CreateLead extends Base 
{
	
	
	/*
	 * @Given("enter the uname as demosalesmanager") public void
	 * enter_Username()throws InterruptedException {
	 * driver.findElementById("username").sendKeys("demosalesmanager");
	 * Thread.sleep(1000); }
	 * 
	 * @Given("enter the passwords as crmsfa") public void enter_password() {
	 * driver.findElementById("password").sendKeys("crmsfa"); }
	 * 
	 * @Then("click Login Button") public void click_on_Login_Button() throws
	 * InterruptedException { Thread.sleep(1000);
	 * driver.findElementByClassName("decorativeSubmit").click();
	 * 
	 * }
	 * 
	 * 
	 * @Given("click on crmsfa link") public void click_crmsfa() {
	 * driver.findElementByLinkText("CRM/SFA").click(); }
	 * 
	 * @Given("click on Lead links") public void click_Lead_link() {
	 * driver.findElementByLinkText("Leads").click(); }
	 */
	@Given("Click on CreateLink")
	public void click_CreateLink()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@Given("enter the company name as TestLeaf")
	public void enter_companyName()
	{
		WebElement company= driver.findElementById("createLeadForm_companyName");
		 company.sendKeys("TestLeaf");
	}
	@Given("enter the Forename as (.*)")
	public void enter_firsName(String fname)
	{
		 driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	@Given("enter the sureName as (.*)")
	public void enter_sureName(String sname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(sname);
	}public CreateLead() {
		// TODO Auto-generated constructor stub
	}
	@Given("select the Source as Employee")
	public void source_dropdown() throws InterruptedException
	{
		 WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
		 Select source= new Select(dropdown1);
		 source.selectByVisibleText("Employee");
		 //Thread.sleep(5000);
	}
	@Given("select the Marketing Campaign as CATRQ_CAMPAIGNS")
	public void marketing_dropdown()
	{
		WebElement marketingcompain = driver.findElementById("createLeadForm_marketingCampaignId");
		 Select dropdown =new Select(marketingcompain);
		 dropdown.selectByValue("CATRQ_CAMPAIGNS");
	
	}
	@Given("select the Industry as Telecommunications")
	public void industry_dropdown() throws InterruptedException
	{
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		 Select dropdown3=new Select(industry);

		 List<WebElement> options = dropdown3.getOptions();
		 int size= options.size();
		 dropdown3.selectByIndex(size-2);
		 //Thread.sleep(5000);
	}
	@Given("select the Ownership as Corporation")
	public void occupation_dd() throws InterruptedException
	{
		WebElement occupation = driver.findElementById("createLeadForm_ownershipEnumId");
		 Select drowoccupation=new Select(occupation);

		 drowoccupation.selectByValue("OWN_CCORP");
		// Thread.sleep(1000);
	}
	@Given("select the Country as India")
	public void country_dropdown() throws InterruptedException
	{
		 WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		 Select dropcountry= new Select(country);
		 dropcountry.selectByVisibleText("India");
		// Thread.sleep(8000);
	}
	@Given("click on Submit button for CreateLead")
	public void submit_button()
	{
		driver.findElementByName("submitButton").click();
		 System.out.println("the title of the page: "+driver.getTitle());
		 System.out.println("the current url of the page: "+driver.getCurrentUrl());
	}

}
