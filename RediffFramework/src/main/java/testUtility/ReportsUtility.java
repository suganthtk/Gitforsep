package testUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportsUtility {
	
	public static ExtentReports generateReports() {
		
		ExtentSparkReporter SparkReporter = new ExtentSparkReporter("reports/ExtentReports" + System.currentTimeMillis() +".html");
		SparkReporter.config().setDocumentTitle("Rediff Automation Script");
		SparkReporter.config().setEncoding("UTF-8");
		SparkReporter.config().setReportName("Rediff Report Generation");
		SparkReporter.config().setTheme(Theme.DARK);
		SparkReporter.config().setTimeStampFormat("dd:mm:yyyy hh:mm:ss a EE");
		
		
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(SparkReporter);
		return extentReports;
		
	}

}
