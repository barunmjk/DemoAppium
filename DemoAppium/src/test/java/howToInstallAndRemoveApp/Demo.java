package howToInstallAndRemoveApp;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Demo extends BaseClass {
	@Test
     public void installApk() throws InterruptedException{
		 driver.terminateApp("io.appium.android.apis");
		 Thread.sleep(3000);
    	 driver.installApp("C:\\Users\\Fleek IT\\Downloads\\ApiDemos-debug.apk");
    	 Thread.sleep(4000);
    	 ExtentTest test=report.createTest("ReportOfDemo");
    	 test.pass("Test case is pass");
     }
	@Test
	public void terminateApk() throws InterruptedException {
		driver.terminateApp("io.appium.android.apis");
		Thread.sleep(3000);
		ExtentTest test=report.createTest("ReportOfDemo2");
		test.pass("Test case is pass");
	}
}
