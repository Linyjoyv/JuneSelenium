package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediffpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logodisplay()
	{
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		
		
	}
}
