package org.Pom.Test;

import org.Pom.Pages.LoginPage;
import org.SeleniumBase.PomBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001Login extends PomBase {
	@Test
	
	public void LoginTest() 
	{
		LoginPage LP=new LoginPage(driver);
		
		boolean ScenarioLabel=LP.getScenarioLabel();
		Assert.assertEquals(ScenarioLabel, true);
		boolean usernameLabel=LP.getUsernameLabel();
		Assert.assertEquals(usernameLabel, true);
		boolean passLabel=LP.getPasswordLabel();
		Assert.assertEquals(passLabel, true);
		boolean ClickLabel=LP.getClickLabel();
		Assert.assertTrue(ClickLabel);
		
		
		new LoginPage(driver)
		.selectScenario("✅ Successful Login")
		.enterUserName("testuser")
		.enterPassword("password123")
		.ClickLogin();
	}

}
