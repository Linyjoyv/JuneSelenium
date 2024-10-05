package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesourcepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();  //open browser
		driver.get("https://www.google.com");    //open google
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("not present");
		}
		//driver.close();


	}

}
