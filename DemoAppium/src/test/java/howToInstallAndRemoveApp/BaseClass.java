package howToInstallAndRemoveApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;

 class BaseClass {
	 public static  AndroidDriver driver;
	public static ExtentReports  report;
   @BeforeSuite
   public void bSuite() {
	   ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Fleek IT\\git\\repository\\DemoAppium\\htmlfile\\demo.html");
	   spark.config().setDocumentTitle("InstallReport");
	   spark.config().setReportName("InstallDemoReport");
	   spark.config().setTheme(Theme.DARK);
	   
	    report=new ExtentReports();
	    report.attachReporter(spark);
	    report.setSystemInfo("Window", "11");
	    
   }
   @BeforeTest
 public void bTest() {
	   
   }
   @BeforeClass
 public void bClass() throws MalformedURLException {
	   DesiredCapabilities dc=new DesiredCapabilities();
	   dc.setCapability("appium:platformName", "Android");
	   dc.setCapability("appium:automationName", "uiAutomator2");
	   dc.setCapability("deviceName", "emulator-5554");
	   dc.setCapability("appium:platformVersion", "16");
	   URL url=new URL("http://127.0.0.1:4723/");
	    driver=new AndroidDriver(url,dc);
	   
   }
   @BeforeMethod
   public void bMethod() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   
   }   
   @AfterMethod
   public void aMethod() {
	   
   }
   @AfterClass
public void aClass() {
	   driver.quit();
   }
   @AfterTest
 public void aTest() {
	   
   }
   @AfterSuite
 public void aSuite() {
	   report.flush();
   }
}
