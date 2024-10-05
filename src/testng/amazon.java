package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class amazon {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String actualtile= driver.getTitle();
		String expectedtitle="Amazon.in:mobilephones";
		if (actualtile.equals(expectedtitle))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.findElement(By.xpath("//*[@id=\"CardInstanceC6_HE2uQVaP8g2pjpTo6Rg\"]/div/div/div[1]/div/div[1]/div/div[2]/div/a/span/span[2]").click();
		
				
		
	}

}
