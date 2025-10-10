package pixel9a;

 
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import objectRepo.PomPlastic;

public class Pixel_test {
    @Test
	public   void pixel() throws  Exception {
    	 DesiredCapabilities caps=new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("deviceName", "emulator-5554");    
	        caps.setCapability("platformVersion", "16");  
	        caps.setCapability("app", "C:\\Users\\Fleek IT\\eclipse-workspace\\DemoAppium\\PBAPP_STG_20251008.apk");
	        
	        URL url =new URL("http://127.0.0.1:4723/");
            AndroidDriver driver=new AndroidDriver(url,caps);
            System.out.println("app install succesfully");
            PomPlastic pom =new PomPlastic(driver);
            pom.getPlastic();
            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(300));
            wait.until(ExpectedConditions.elementToBeClickable(pom.getPlastic()));
            pom.getPlastic().click();
            driver.quit();
	}

}
