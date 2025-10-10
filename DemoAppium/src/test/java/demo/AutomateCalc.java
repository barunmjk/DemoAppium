package demo;

import java.net.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
 
public class AutomateCalc{

	@Test(priority=1)
	public void start() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "jrdugetsto4tvc7t");    
        caps.setCapability("platformVersion", "13");        
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
        caps.setCapability("uiautomator2ServerInstallTimeout", 60000);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
       WebElement num9=  driver.findElement(By.id("com.miui.calculator:id/btn_9_s"));
        num9.click();
        WebElement plus= driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
        plus.click();
       WebElement num2= driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
        num2.click();
        WebElement equal= driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
         equal.click();
         WebElement result= driver.findElement(By.id("com.miui.calculator:id/result")); 
         if(result.getText().equals("11"))
        	 System.out.println("resuilt found ");
         else 
        	 System.out.println("result not found");
        Thread.sleep(3000);
        driver.quit();
	}
	
 
}
 
