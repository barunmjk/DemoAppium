package calculator_Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
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

  class BaseClass  {
	 public static AndroidDriver driver;
	public static ExtentReports report;
        @BeforeSuite
        public void bSuite() {
        //this report generations 
        	ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\Fleek IT\\git\\repository\\DemoAppium\\htmlfile\\dummy7.html");
        	esr.config().setDocumentTitle("CalCulatorReport");
        	esr.config().setReportName("General working");
        	esr.config().setTheme(Theme.DARK);
        	
        	 report =new ExtentReports();
        	report.attachReporter(esr);
        	report.setSystemInfo("Window", "11");
        	}
        @BeforeTest
 public void bTest() {
        	
        }
        @BeforeClass
 public void bClass() throws MalformedURLException {
        	DesiredCapabilities dc=new DesiredCapabilities();
        	dc.setCapability("appium:platformName","Android");
        	dc.setCapability("appium:automationName","UiAutomator2");
        	dc.setCapability("appium:deviceName","emulator-5554");
        	dc.setCapability("appium:platformVersion","16");
        	//dc.setCapability("appium:app","C:/Users/Fleek IT/Downloads/com-miui-calculator-315003003-70230966-ec423981671a2a7f8dc75626c6c33e21.apk");
        	dc.setCapability("appium:package","com.miui.calculator2");
        	dc.setCapability("appium:activity","com.android.calculator2.Calculator");
        	dc.setCapability("autoGrantPermission",true);
        	URL url=new URL("http://127.0.0.1:4723/");
        	driver =new AndroidDriver(url,dc);
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        	
        }
        @BeforeMethod
 public void bMethod() {
        	
        }
        @AfterMethod
 public void aAfter() {
//        	  if(result.getStatus()==ITestResult.SUCCESS)
//      	    	 System.out.println("testcase is pass");
//        	  else if(result.getStatus()==ITestResult.FAILURE)
//        		  System.out.println("test case is fail");
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
