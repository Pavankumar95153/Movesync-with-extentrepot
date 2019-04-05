package com.Movesync.Listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(com.Movesync.Listner.TestNGListner.class)
public class Verifytitle_ByListner {
	
	WebDriver driver;
	
	@Test
	public void title() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpavankumar\\eclipse-workspace\\Moviesync\\driver\\chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://dxc.moveinsync.com/DChe/employee.jsp#EmployeeLogin");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}
}
