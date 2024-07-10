package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("CloseBrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
		driver.get("https://online.actitime.com/hpriya/login.do");
		LoginPage l=new LoginPage(driver);
		l.setLogin("harideeps96@gmail.com", "Hari@123acti");
		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		et.setLogout();
	}

}
