package pagePackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryGoogleSearch {
	
	WebDriver driver;
	
	@FindBy (name="q")
	WebElement textbox_search;
	
	@FindBy (name="btnK")
	WebElement button_search;
	
	public PageFactoryGoogleSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void textSearch(String searchText)
	{
		textbox_search.sendKeys(searchText);
		
	}
	
	public void clickSearch()
	{
		button_search.click();
	}
	
	

}
