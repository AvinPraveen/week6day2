package BeforeLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Steps.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginHook extends Base{
	@Before
	public void logIn() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
//	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Thread.sleep(1000);
	}
	@After
	public void close()
	{
		driver.close();
	}
}
