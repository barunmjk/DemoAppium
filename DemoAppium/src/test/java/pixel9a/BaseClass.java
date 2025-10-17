package pixel9a;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import objectRepo.PomPlastic;

public class BaseClass {
	public static AndroidDriver driver;
     @BeforeSuite
     public void bsuite() {
    	 
     }
     @BeforeTest
public void btest() {
    	 
     }
     @BeforeClass
public void bClass() throws MalformedURLException {
    	 DesiredCapabilities caps=new DesiredCapabilities();
      	 caps.setCapability("appium:platformName", "Android");
  	        caps.setCapability("appium:automationName", "UiAutomator2");
  	        caps.setCapability("appium:deviceName", "emulator-5554");    
  	        caps.setCapability("appium:platformVersion", "16");  
  	       // caps.setCapability("appium:app", "C:/Users/Fleek IT/git/repository/DemoAppium/PBAPP_STG_20251008.apk");
  	        caps.setCapability("appium:package", "org.plasticbank.app"); 
  	        caps.setCapability("appium:activity", "org.plasticbank.app.MainActivity");
  	        caps.setCapability("autoGrantPermissions", true);
  	        URL url =new URL("http://127.0.0.1:4723/");
  	      driver=new AndroidDriver(url,caps);
     }
     @BeforeMethod
public void bMethod() throws InterruptedException {
    	 PomPlastic pom =new PomPlastic(driver);
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
         WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(160));
         wait.until(ExpectedConditions.elementToBeClickable(pom.getPlasticApp()));
         Thread.sleep(4000);
          pom.getPlasticApp().click();
          Thread.sleep(4000);
       wait.until(ExpectedConditions.elementToBeClickable(pom.getSignUp()));
       pom.getSignUp().click();
       Thread.sleep(4000);
     }
     @AfterMethod
public void amethod() {
    	 
     }
     @AfterClass
public void aclass() {
    	 
     }
     @AfterTest
public void atest() {
    	 
     }
     @AfterSuite
public void asuite() {
    	 
     }
}
