package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandling {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		 driver = new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();//current window
		//System.out.println("Parent Window Title" +d.getTitle());
		//D.findElement(By.XPath(""))
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		for (String handle: allWindowHandles) {
			if (!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}
