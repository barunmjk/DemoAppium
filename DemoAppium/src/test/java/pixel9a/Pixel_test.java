package pixel9a;

 
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import objectRepo.PomPlastic;

public class Pixel_test {
	 
    @Test
     public void app() throws MalformedURLException, InterruptedException{
    	 DesiredCapabilities caps=new DesiredCapabilities();
    	 caps.setCapability("appium:platformName", "Android");
	        caps.setCapability("appium:automationName", "UiAutomator2");
	        caps.setCapability("appium:deviceName", "emulator-5554");    
	        caps.setCapability("appium:platformVersion", "16");  
	        caps.setCapability("appium:app", "C:/Users/Fleek IT/git/repository/DemoAppium/PBAPP_STG_20251008.apk");
	        caps.setCapability("appium:package", "org.plasticbank.app"); 
	        caps.setCapability("appium:activity", "org.plasticbank.app.MainActivity");
	        caps.setCapability("autoGrantPermissions", true);
	        URL url =new URL("http://127.0.0.1:4723/");
            AndroidDriver driver=new AndroidDriver(url,caps);
             
 
     }
      @Test
    public void continueBTn() throws MalformedURLException, InterruptedException { 
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
 	       AndroidDriver driver=new AndroidDriver(url,caps);
 	       PomPlastic pom =new PomPlastic(driver);
 	       
           WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(220));
 wait.until(ExpectedConditions.elementToBeClickable(pom.getPlasticApp()));
          Thread.sleep(4000);
           pom.getPlasticApp().click();
           Thread.sleep(4000);
    	
    	Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(pom.getEnglish()));
        pom.getEnglish().click();
        Thread.sleep(4000);
    	 wait.until(ExpectedConditions.elementToBeClickable(pom.getContinueBtn()));
         pom.getContinueBtn().click();
         Thread.sleep(4000);
         wait.until(ExpectedConditions.elementToBeClickable(pom.getSignUp()));
         pom.getSignUp().click();
    }
      @Test
      public void signup() throws MalformedURLException, InterruptedException { 
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
  	       AndroidDriver driver=new AndroidDriver(url,caps);
  	       PomPlastic pom =new PomPlastic(driver);
 	       
           WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(300));
           wait.until(ExpectedConditions.elementToBeClickable(pom.getPlasticApp()));
           Thread.sleep(4000);
            pom.getPlasticApp().click();
            Thread.sleep(4000);
         wait.until(ExpectedConditions.elementToBeClickable(pom.getSignUp()));
         pom.getSignUp().click();
         Thread.sleep(4000);
         wait.until(ExpectedConditions.elementToBeClickable(pom.getCollector()));
         pom.getCollector().click();
         Thread.sleep(4000);
         wait.until(ExpectedConditions.visibilityOf(pom.getName()));
         pom.getName().sendKeys("bran");
         Thread.sleep(4000);
         wait.until(ExpectedConditions.visibilityOf(pom.getPhNum()));
         pom.getPhNum().sendKeys("987654321");
    }
}
