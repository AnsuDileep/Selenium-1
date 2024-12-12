package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGProcedure {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser Loading");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test(priority=2,invocationCount=3)   //to repeat multiple times
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=3,enabled=false)   //method will disable 
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=1,dependsOnMethods="test1")  //test3 will depend on test1 to run
	public void test3()
	{
		System.out.println("test 3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}

	@AfterTest
	public void tearDown()
	{
		System.out.println("Quit browser");
	}
}
