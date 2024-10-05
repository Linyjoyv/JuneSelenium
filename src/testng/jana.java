package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class jana {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/collections/new-arrival");
	}	

}
