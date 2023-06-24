package org.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TimeoutTest {
	public static WebDriver driver;
	long starttime;
	@BeforeSuite
	public void browserlaunch() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\TestngNew\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test()
	public void facebook() {

		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void insta() {
		
		driver.get("https://www.instagram.com/");
		
	}
	@Test
	public void indianbank() {
		
		driver.get("https://www.netbanking.indianbank.in/jsp/startIBPreview.jsp");
	
	}
	@AfterSuite
	public void quite() {
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println(totaltime);
	}
}
