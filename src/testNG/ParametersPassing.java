package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersPassing {
	
	@Parameters("s")
	@Test
	public void parameterPass(String s)
	{
		System.out.println("Parameter value: "+s);
	}

}
