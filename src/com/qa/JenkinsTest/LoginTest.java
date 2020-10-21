package com.qa.JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	int a;
	String test="123";
	
	@BeforeTest
	public void initObj() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testLogin() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Google Launch successfully");
	}

}
