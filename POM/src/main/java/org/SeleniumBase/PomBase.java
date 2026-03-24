package org.SeleniumBase;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PomBase {
	
	String URL="https://techbeamers.com/practice-test-login/";
	
	protected RemoteWebDriver driver=null;
	
	@BeforeMethod
	public void StartApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
	}
	@AfterMethod
	public void EndApp()
	{
		driver.quit();
	}
	
}
