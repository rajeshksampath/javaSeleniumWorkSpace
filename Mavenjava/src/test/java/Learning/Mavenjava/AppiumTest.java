package Learning.Mavenjava;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest {
	
	@BeforeTest
	public void NativeAppAndroid()
	{
		System.out.println("NativeAppAndroid");
	}
	
	@Test
	public void iOS()
	{
		System.out.println("iOS");
	}

}
