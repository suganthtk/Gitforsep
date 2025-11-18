package testUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnerUtility implements ITestListener {

	String name;
	ExtentReports reports;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		name = result.getName();
		System.out.println(name + ":Testcase Started");
		test = reports.createTest(name);
		test.log(Status.INFO, "Testcase started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(name + ":Testcase Started and succeded");
		test.log(Status.PASS, "Testcase success");


	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(name + ":Testcase Failed");
		DriverUtility.getScreenShot(name);
		test.log(Status.FAIL, "Testcase failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(name + ":Testcase Started but Skipped");
		DriverUtility.getScreenShot(name);
		test.log(Status.SKIP, "Testcase Skipped");

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Automation project started");
		reports = ReportsUtility.generateReports();

		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Automation project finished");
		reports.flush();

		
	}
	
	

}
