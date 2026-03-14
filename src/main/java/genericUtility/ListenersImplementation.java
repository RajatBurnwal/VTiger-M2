package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	ExtentReports reports;
	ExtentTest test;
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - On Test Start executed");
		
		//Creating a field in Extent Reports
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - On Test Success executed");
		
		//Logging the status as PASS
		test.log(Status.PASS, methodName+" - successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - On Test Failure executed");
		
		//Logging the status as FAIL
		test.log(Status.FAIL, methodName+" - Failed");
		test.log(Status.INFO, result.getThrowable());
		
		//Capturing screenshot
		String screenshotName = methodName+" - "+dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path = sUtil.captureScreenshot(BaseClass.sDriver, screenshotName);
			//Attaching screenshot to report
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - On Test Skipped executed");
		
		//Logging the status as SKIP
		test.log(Status.SKIP, methodName+" - Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start executed");
		
		//Configuration of Extent Reports
		ExtentSparkReporter reporter = new ExtentSparkReporter
				(".\\Extent Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Generate empty report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Rajat");	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish executed");
		
		//Flushing the report
		reports.flush();
	}
	
}
