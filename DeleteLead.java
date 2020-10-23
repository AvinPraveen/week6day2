package Steps;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DeleteLead extends Base
{
	public String BeforeDeleted;

	/*
	 * @Given("enter the user_name as demosalesmanager") public void
	 * enter_Username()throws InterruptedException {
	 * driver.findElementById("username").sendKeys("demosalesmanager");
	 * 
	 * }
	 * 
	 * @Given("enter the pass_word as crmsfa") public void enter_password() {
	 * driver.findElementById("password").sendKeys("crmsfa"); }
	 * 
	 * @Then("click on Login_Button") public void click_on_Login_Button() throws
	 * InterruptedException { Thread.sleep(1000);
	 * driver.findElementByClassName("decorativeSubmit").click();
	 * 
	 * }
	 * 
	 * 
	 * @Given("click link crmsfa") public void click_crmsfa() {
	 * driver.findElementByLinkText("CRM/SFA").click(); }
	 * 
	 * @Given("Click on Lead_Link Tap") public void click_Lead_link() {
	 * driver.findElementByLinkText("Leads").click(); }
	 */   
	
	
	@Given("Click on Find_Lead")
	public void click_FindLead()
	{
		driver.findElementByXPath("//a[text()='Find Leads']").click();
	}
	@Given("Click on phonenumber")
	public void click_phonenumber()
	{
		driver.findElementByXPath("//span[text()='Phone']/..").click();
	}
	@Given("enter on phonenumber as 99")
	public void enter_number()
	{
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	}
	@Given("select the first row coloum")
	public void select_firstrow()
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	
	
	
	@And("click on Delete Button")
	public void clickOn_deleteButton()
	{
		 driver.findElementByXPath("//a[text()='Delete']").click();
	}


}
