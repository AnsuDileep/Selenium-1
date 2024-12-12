package webProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title:" +actualTitle);
		
		String expectedTitle="Facebook";
		System.out.println("Expected Title:" +expectedTitle);
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}

	}

}
