package Steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MergeLead extends Base{
	
	public String leadID="";
	public String leadID2="";
	
	
	/*
	 * @Given("enter user_name as demosalesmanager") public void enter_userName() {
	 * driver.findElementById("username").sendKeys("DemoSalesManager"); }
	 * 
	 * @Given("enter pass_word as crmsfa") public void password() {
	 * driver.findElementById("password").sendKeys("crmsfa"); }
	 * 
	 * @Given("click on Submit Button") public void submit_button() {
	 * driver.findElementByClassName("decorativeSubmit").click(); }
	 * 
	 * @Given("click crmsfa link") public void crm_link() {
	 * driver.findElementByLinkText("CRM/SFA").click(); }
	 * 
	 * @Given("Click Lead_Link Tap") public void lead_tap() {
	 * driver.findElementByLinkText("Leads").click(); }
	 */
	@When("click on Merge_Lead Tap")
	public void Merge()
	{
		driver.findElementByLinkText("Merge Leads").click();
	}
	@Then("click on first window icon")
	public void first_win()
	{
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Given("goto the windows and select the First Name as (.*)")
	public void enter_FirstName(String fname)
	{
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fname);
		
	}
	@When("You click on Find Lead Button")
	public void click_findLead() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	@And("select the first cell in row")
	public void first_cell()
	{
		
		 leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(0));
	}
	@Then("Click on second Window icon")
	public void click_second_window()
	{
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}
	@Given("goto the windows and select the Second Name as (.*)") 
	public void enter_firstNameas(String sName) throws InterruptedException
	{
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(sName);
		Thread.sleep(2000);
	}
	@When("you click on Find_lead")
	public void Click_button() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	@Then("Select the First_Cell in row")
	public void selectfirst_row()
	{
		leadID2 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
	}
	
	@When("you click on Merge Button")
	public void MergeButton()
	{
		driver.findElementByXPath("//a[text()='Merge']").click();
	}
	@And("click ok on Alert Box")
	public void click_alert() throws InterruptedException 
	{
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	@Given("click on findLead")
	public void lead_find() throws InterruptedException
	{
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	@Given ("Enter Lead id")
	public void EnterLeadid() throws InterruptedException {
		//Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"ext-gen246\"]").sendKeys(leadID);
	}
	@When("click on FindLead to check")
	public void check()
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
