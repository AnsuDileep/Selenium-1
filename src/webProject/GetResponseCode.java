package webProject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class GetResponseCode {

 String link="https://www.facebook.com/";
 
 @Test
 public void responseCode()
 {
	 try {	
		@SuppressWarnings("deprecation")
		URL u=new URL(link);
		 

HttpURLConnection l = (HttpURLConnection)u.openConnection();

int code = l.getResponseCode();

if(code==200)
{
	System.out.println("Sucess");
}
else
{
	System.out.println("Not sucess");
}
	 
	 } 
	 catch(Exception e)
	 {
		 
	 }
 }
}
