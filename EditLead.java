package Steps;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EditLead extends Base
{
	public String BeforeDeleted;
	public String Updatevalue="";
	public static String actual;
	
	/*
	 * @Given("enter the usname as demosalesmanager") public void enterUserName() {
	 * driver.findElementById("username").sendKeys("demosalesmanager");
	 * 
	 * }
	 * 
	 * @Given("enter the psd as crmsfa") public void enter_passwords() {
	 * driver.findElementById("password").sendKeys("crmsfa"); }
	 * 
	 * @Then("click ond Login Button") public void click_on_Login_Buttons() throws
	 * InterruptedException { Thread.sleep(1000);
	 * driver.findElementByClassName("decorativeSubmit").click();
	 * 
	 * }
	 * 
	 * 
	 * @Given("click crmsfa") public void clicks_crmsfa() {
	 * driver.findElementByLinkText("CRM/SFA").click(); }
	 * 
	 * @Given("click on Lead tag") public void clicks_Lead_link() {
	 * driver.findElementByLinkText("Leads").click(); }
	 */
	@Given("Click on Find Lead")
	public void click_FindLeads() throws InterruptedException
	{
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(1000);
	}
	
	@Given("click on First name as Praveen")
	public void enter_Firstname()
	{
		
		driver.findElementByXPath("//input[@name='firstName'][@id='ext-gen248']").sendKeys("Praveen");
		//store the value in String variable to compare
		String actual=("//input[@name='firstName'][@id='ext-gen248']");
	}
	@Given("click on First cell")
	public void click_cell()
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	@Given("click on Edit Button")
	public void clickOn_Edit()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
	}
	@Given("click on Company clear and add value as Tcs")
	public void company_Edit() throws InterruptedException
	{
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").clear();
		Thread.sleep(2000);
		//enter new value in company name 
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").sendKeys("Tcs");

		
	}
	
	@And("click update button")
	public void click_submit()
	{
		System.out.println("EditLead successfull");
		driver.findElementByXPath("//input[@class='smallSubmit'and @name='submitButton']").click();
		
		
		//just get the title of the page and close the bowser
		String Title=driver.getTitle();
		System.out.println("The Title of Updated Page is : "+Title);
	}
}
