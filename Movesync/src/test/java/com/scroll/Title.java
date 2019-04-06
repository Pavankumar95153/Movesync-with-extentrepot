package com.scroll;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Title {
	
	static WebDriver driver1;
	
	
	
	ExtentTest logger;

	@BeforeTest
	
	public static void Launch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpavankumar\\eclipse-workspace\\Moviesync\\driver\\chrome driver\\chromedriver.exe");
		
		
		 driver1 = new ChromeDriver();
		driver1.get("https://dxc.moveinsync.com/DChe/employee.jsp#EmployeeLogin");
		driver1.manage().window().maximize();
		
		}
	
	@Test(dataProvider="DATAA")
	
	
	
	public void testdata( @Optional("ABV") String Userid,String Password) {
		
	WebElement a = driver1.findElement(By.xpath("//input[@id='username']"));
	a.sendKeys(Userid);
	
	WebElement b = driver1.findElement(By.xpath("//input[@name='j_password']"));
	b.sendKeys(Password);
	
	WebElement c = driver1.findElement(By.xpath("//input[@value='Login']"));
	c.click();
	
	
	
	
	
	File scr =((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
	
	try {
		
	
	FileUtils.copyFile(scr,new File( "Error1.jpg"));
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	@BeforeTest
	public void report() throws IOException {
			
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\tpavankumar\\eclipse-workspace\\Movesync\\extent report\\Report1.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger =extent.createTest("testdata");
		
		logger.log(Status.INFO, "Login to MoveSync");
		
		logger.log(Status.FAIL, "Invalid crenditials");
		
		logger.addScreenCaptureFromPath("file:///C:/Users/tpavankumar/eclipse-workspace/Movesync/Error.jpg");
		extent.flush();
		// extent.loadConfig(new file(System.setProperty(arg0, arg1)));
		 
		 
		
		
	}

@DataProvider(name ="DATAA")
public Object[][] testdata(){
	return new Object[][] {
	
	
	{"115234447", "Love@123"}
	
	
	};
	}
@AfterTest
public void stop() {
	driver1.quit();
}
}
