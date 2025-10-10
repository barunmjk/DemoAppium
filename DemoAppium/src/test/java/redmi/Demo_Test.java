package redmi;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo_Test {
       @Test
	public  void redMi_Test() throws Exception {
		 DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("deviceName", "emulator-5554");    
	        caps.setCapability("platformVersion", "13");        
//	        caps.setCapability("appPackage", "com.miui.calculator");
//	        caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
//	        caps.setCapability("uiautomator2ServerInstallTimeout", 60000);
	        
	        URL url=new URL("http://127.0.0.1:4723");
	        
	        AndroidDriver driver=new AndroidDriver(url, caps);
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(300));
	        
	       WebElement gmail= driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Gmail']"));
	       wait.until(ExpectedConditions.elementToBeClickable(gmail));
              gmail.click();
             System.out.println("open the browser ....");
             Thread.sleep(2000);
             driver.quit();
       }

}
