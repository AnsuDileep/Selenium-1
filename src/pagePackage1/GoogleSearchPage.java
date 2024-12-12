package pagePackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPage {
	
	WebDriver driver;
	
	By textboxSearch=By.name("q");
	By buttonLogin=By.name("btnK");
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterSearch(String searchText)
	{
		driver.findElement(textboxSearch).sendKeys(searchText);
	}
	
	public void clickSearch()
	{
		driver.findElement(buttonLogin).click();
	}
	
	
}
