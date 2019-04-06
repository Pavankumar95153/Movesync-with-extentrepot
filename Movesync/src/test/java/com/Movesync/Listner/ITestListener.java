package com.Movesync.Listner;

import org.testng.ITestContext;
import org.testng.ITestResult;

public interface ITestListener {
	
	public void finsh(ITestContext arg0);
	
	public void onStart(ITestContext arg0);
	
	public void onTestFailedButWithSucessPerscentage(ITestResult arg0);
	
	
	
	public void onTestfailure(ITestResult arg0);
	
	public void onTestSkipped(ITestResult arg0);
	
	public void onTestSuccess(ITestResult arg0);
	
	
	

}
