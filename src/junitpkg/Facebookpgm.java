package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://facebook.com");
		
	}
	@Test
	public void fb()
	{
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
	}

}
