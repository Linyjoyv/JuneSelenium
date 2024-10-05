package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void createPageclick()
	{
		driver.findElement(createpage).click();
	}
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Create a page"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
	
}




