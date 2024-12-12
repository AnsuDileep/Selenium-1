package testNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

public class ExtentReport {
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports report;
	String baseUrl="https://www.facebook.com";
	
@BeforeTest
public void extentReport()
{
	reporter=new ExtentHtmlReporter("./reports2/report2.html");
	reporter.config().setDocumentTitle("Automation Report");
	reporter.config().setReportName("Functional test");
	reporter.config().setTheme(Theme.DARK);
	
	report=new ExtentReports();
	report.attachReporter(reporter);
	//report.setSystemInfo("host name", "local host");
	//report.setSystemInfo("OS", "Windows10");
	//report.setSystemInfo("Tester name", "Ansu");
	//report.setSystemInfo("Browser name", "Chrome");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

@BeforeMethod
public void beforeMethod()
{
	driver.get(baseUrl);
}

@Test
public void titleVerification()
{
	test=report.createTest("Facebook Title Veriifcation");
	@Nullable
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	String expTitle = "Facebook – log in or sign up";
	Assert.assertEquals(expTitle, actualTitle);	
}

@Test
public void faceBookLogotest()
{
	test=report.createTest("Facebook Logo Verification");
	boolean b = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);
	
}

@AfterTest
public void tearDown()
{
	report.flush();
}

@AfterMethod
public void browserClose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "Failed Test Case : "+result.getName());
		test.log(Status.FAIL, "Failed Test case : "+result.getThrowable());
		
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "Skipped test Case : "+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "Passed Test Case : "+result.getName());
	}
}

}