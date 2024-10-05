package testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdemo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemethod");
	}
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(enabled=false,groups = {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftertest()
	{
		System.out.println("aftermthd");
	
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("browserclosing");
	}

}

