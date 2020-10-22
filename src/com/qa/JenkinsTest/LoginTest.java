package com.qa.JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest {
	
	WebDriver driver;
	
	static ExtentTest test;
	static ExtentReports report;
	
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	
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
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		report.endTest(test);
		report.flush();
	}

}
