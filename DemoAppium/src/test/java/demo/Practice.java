package demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Practice {
	 
		             @Test
		            public void reporting() {
	            ExtentSparkReporter spark= new ExtentSparkReporter("C:\\Users\\Fleek IT\\git\\repository\\DemoAppium\\htmlfile\\dummy.html");
	               spark.config().setDocumentTitle("demo appium");
	               spark.config().setTheme(Theme.STANDARD);
	               spark.config().setReportName("Testing leads module status");
//	               spark.config().setTheme(Theme.STANDARD);
	               
	               ExtentReports report =new ExtentReports();
	               report.attachReporter(spark);
	               report.setSystemInfo("Window", "11");
	               report.setSystemInfo("Browser", "chrome");
	               
	               ExtentTest test= report.createTest("reporting");
	               test.log(Status.PASS, "pass");
	               test.fail("fghjkl;");
	               
	               report.flush();
		            }
	}

