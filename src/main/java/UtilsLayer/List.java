package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class List extends BaseClass implements ITestListener {
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	public void onStart(ITestContext context) {
		extentReport = ExtendReportsSetup.extentSetup(context.getSuite().getName());
	}
	
	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "This test case is Pass" + result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(ExtendReportsSetup.passScreenshot(result.getMethod().getMethodName()));
		}

	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "this test case is fail" + result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(ExtendReportsSetup.failScreenshot(result.getMethod().getMethodName()));
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "This test case is skip" + result.getMethod().getMethodName());
		
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}
	
}
