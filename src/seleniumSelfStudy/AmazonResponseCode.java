package seleniumSelfStudy;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;


public class AmazonResponseCode {
	
	
		
	@Test
	public void respCode()
	{
		String amazonLink = "https://www.amazon.in";
		
		try {
		
		@SuppressWarnings("deprecation")
		URL u=new URL(amazonLink);
		HttpURLConnection httpURL = (HttpURLConnection)u.openConnection();
		int resCode = httpURL.getResponseCode();
		
		System.out.println(resCode);	
	}
		catch(Exception e)
		{
			
		}

	}
	
}

