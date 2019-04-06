package com.scroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Scroll2  extends Title {
	
	WebDriver driver;
	
	@BeforeTest
	public void report() throws IOException {
			
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\tpavankumar\\git\\Movesync-with-extentrepot\\Movesync\\extent report\\Report1.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger =extent.createTest("scroll");
		
		logger.log(Status.INFO, "Microsoft article dropdown test");
		
		logger.log(Status.PASS, "errorscreenshot");
		
		logger.addScreenCaptureFromPath("C:\\Users\\tpavankumar\\git\\Movesync-with-extentrepot\\Movesync\\Lastdragscr_shot.jpg");
		extent.flush();
		
	}
	
	
	
	@Test
	public void scroll() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpavankumar\\eclipse-workspace\\Moviesync\\driver\\chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("https://support.office.com/en-ie/article/sync-files-with-the-onedrive-sync-client-in-windows-615391c4-2bd3-4aae-a42a-858262e42a49");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js1.executeScript("window.scrollBy(0,10000)");
	        
	        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        try {
	    		
	        	
	        	FileUtils.copyFile(scr,new File( "Lastdragscr_shot.jpg"));
	        	}catch (IOException e) {
	        		// TODO Auto-generated catch block
	        		e.printStackTrace();
	        	}
	        
	        Thread.sleep(6000);
	        
	        driver.close();
	    }
	}


