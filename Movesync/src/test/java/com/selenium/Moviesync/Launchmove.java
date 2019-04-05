package com.selenium.Moviesync;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;


public class Launchmove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpavankumar\\eclipse-workspace\\Moviesync\\driver\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.rrbchennai.gov.in/");
		driver1.manage().window().maximize();
		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile1,new File("C:\\Users\\tpavankumar\\eclipse-workspace\\Movesync\\Screenshot\\Name2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://dxc.moveinsync.com/DChe/employee.jsp#EmployeeLogin");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println("Title of the page:" + a);
		
		//Enter input
		WebElement b = driver.findElement(By.xpath("//input[@name='j_username']"));
		b.clear();
		b.sendKeys("11523446");b.click();
		//Enter password
		
		WebElement c = driver.findElement(By.xpath("//input[@name='j_password']"));
		c.clear();c.sendKeys("March@123");c.click();
		
		//Click the login
		
		WebElement d = driver.findElement(By.xpath("//input[@value='Login']"));
		d.click();
		// Take Screenshot.
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile,new File("C:\\Users\\tpavankumar\\eclipse-workspace\\Movesync\\Screenshot\\Name1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//Title of the page
		
		String e = driver.getTitle();
		System.out.println("Title ot the second page:"+ e);
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*Select drop = new Select(driver.findElement( By.name("weekList")));
		drop.selectByIndex(2);*/
		 //driver.close();
		 driver1.close();
		 
		
		
		
	}

	private static void abn() {
		// TODO Auto-generated method stub
		
	}

}
