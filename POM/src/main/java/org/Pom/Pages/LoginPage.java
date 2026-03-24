package org.Pom.Pages;

import org.SeleniumBase.PomBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PomBase
	{
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	//Locators	
	public boolean getScenarioLabel(){
		return driver.findElement(By.xpath("//select[@id='scenario']")).isDisplayed();
	}
	public boolean getUsernameLabel(){
		return driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
	}
	public boolean getPasswordLabel(){
		return driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
	}
	public boolean getClickLabel(){
		return driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	}
	//Actions
	public LoginPage selectScenario(String lang){
		WebElement scenario=driver.findElement(By.xpath("//select[@id='scenario']"));
		new Select(scenario).selectByVisibleText(lang);
		return this;
	}

	public LoginPage enterUserName(String username){
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
		return this;
	}

	public LoginPage enterPassword(String password){
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		return this;
	}

	public DashBoardPage ClickLogin(){
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashBoardPage();
	}

	public void login(String username,String Pass) 
	{
		enterUserName(username);
		enterPassword(Pass);
		ClickLogin();
	}

}
