package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extendreports {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentSparkReporter("./reports/report1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	    extent.setSystemInfo("hostname","localhost");
	    extent.setSystemInfo("os","windows 8");
	    extent.setSystemInfo("testername","liny");
	    extent.setSystemInfo("browsername","chrome");
	    driver=new ChromeDriver();
	    
	}
	@BeforeMethod
	public void setUp() {
		driver.get(baseurl);
	}
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("Fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp,actual);
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			//String screenshotpath=screenshotMethod(driver,result.getName());
			//test.addScreenCaptureFromPath(screenshotpath);
			
		}else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
}
