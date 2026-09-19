package testng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersDemo implements ITestListener{ 
	
	//ITestListener is a inheritance
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;
	
	//Alt+Shift+S - select the override implements methods option
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		
		Date myDate=new Date();
		//SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyyhhmmss");// this is for fully date format
		SimpleDateFormat sdf=new SimpleDateFormat("hhmmss");// this is for timestamp
		//String dateStamp= sdf.format(myDate);
		String timeStamp= sdf.format(myDate);
		//System.out.println(dateStamp);
		System.out.println(timeStamp);
		//String reportPath = System.getProperty("user.dir")+"/ TestReports/ExtentReport.html";
		String reportPath = System.getProperty("user.dir")+"/ TestReports/ExtentReport"+timeStamp+".html";
		sparkReporter=new ExtentSparkReporter(reportPath);
		
		
		sparkReporter.config().setReportName("STAD Selenium Test Automation");
		sparkReporter.config().setDocumentTitle("QA Document");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Team", "STAD QA");
		extent.setSystemInfo("Tester", "MR. ABC");
		extent.setSystemInfo("Enviornment", "QA");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("User", System.getProperty("user.name"));
		
		
		}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
		
	 test=extent.createTest(result.getName());
	 test.log(Status.INFO, "The Method" + result.getName()+" started.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		test.log(Status.PASS, "The Method" + result.getName()+" passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		test.log(Status.FAIL, "The Method" + result.getName()+" failed.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		test.log(Status.SKIP, "The Method" + result.getName()+" skipped.");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		extent.flush(); // this is compulsory without this report will display blank
	}

	
	

}
