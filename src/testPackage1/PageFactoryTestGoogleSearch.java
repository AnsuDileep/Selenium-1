package testPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pagePackage1.PageFactoryGoogleSearch;

public class PageFactoryTestGoogleSearch {

	WebDriver driver;
	
	ExtentHtmlReporter reporter;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void generateReport()
	{
		reporter=new ExtentHtmlReporter("./report/report4.html");
		reporter.config().setDocumentTitle("Google Search Functionality Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName(null);
		
		report=new ExtentReports();
		report.attachReporter(reporter);	
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	@Test
	public void googleSearchTest()
	{
		test=report.createTest("Google Search Functionality Test");
		PageFactoryGoogleSearch gs=new PageFactoryGoogleSearch(driver);
		gs.textSearch("Java Tutorial");
		gs.clickSearch();
	}
	
	@AfterMethod
	public void browserClose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Failed Test Case : "+result.getName());
			test.log(Status.FAIL, "Failed Reason: "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Passes Test Case : "+result.getName());
		}
	}
	@AfterTest
	public void tearDown()
	{
		report.flush();
	}
		
}
