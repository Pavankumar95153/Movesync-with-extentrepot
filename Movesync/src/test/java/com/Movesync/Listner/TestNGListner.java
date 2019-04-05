package com.Movesync.Listner;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{
	
	

	public void finsh(ITestContext result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithSucessPerscentage(ITestResult result) {
		
		
	}

	public void onTestfailure(ITestResult result) {
		
		System.out.println("Test case failed:" + result.getName() );
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case skipped:" + result.getName() );
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case Success:" + result.getName() );
	}
	
}
