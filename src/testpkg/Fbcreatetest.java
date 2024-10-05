package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbcreatetest extends Baseclass{
	
	 
	@Test
	public void createpagetest()
	{
		Createpagetest ctest =new Createpagetest(driver);
		ctest.createPageClick();
		ctest.textVerification();
	}
}