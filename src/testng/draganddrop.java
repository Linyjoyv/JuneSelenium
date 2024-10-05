package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void drag()
	{
	WebElement amount=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
	WebElement account=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
	

}
}