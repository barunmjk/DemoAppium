package pixel9a;

 
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectRepo.PomPlastic;

public class Pixel_test {
	 public static AndroidDriver driver;
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
            driver=new AndroidDriver(url,caps);
             
 
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
  	       driver=new AndroidDriver(url,caps);
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
         wait.until(ExpectedConditions.elementToBeClickable(pom.getCollector()));
         pom.getCollector().click();
         Thread.sleep(4000);
         wait.until(ExpectedConditions.visibilityOf(pom.getName()));
         pom.getName().sendKeys("bran");
         Thread.sleep(4000);
         
         tap(590,1200);
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
         driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
         Thread.sleep(4000);
         
         pom.getDOB().click();
         Thread.sleep(4000);
         
         Thread.sleep(4000);
        
        scroll(499,1265,504,1396);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(800,1256,790,1353);
        scroll(252,1265,257,1411);
        
        Thread.sleep(4000);
        pom.getDone().click();
        Thread.sleep(4000);
        pom.getGender().click();
        Thread.sleep(4000);
        pom.getMale().click();
        Thread.sleep(4000);
        pom.getPass().sendKeys("Bran@123");
        Thread.sleep(4000);
        pom.getCPass().sendKeys("Bran@123");
        Thread.sleep(4000);
        pom.getCheckBox().click();
        Thread.sleep(4000);
        pom.getcamlogo().click();
        Thread.sleep(4000);
        pom.getTakePhoto().click();
        Thread.sleep(4000);
        pom.getClickpic().click();
        Thread.sleep(6000);
        pom.getPicdone().click();
        Thread.sleep(6000);
        pom.getSavePic().click();
        wait.until(ExpectedConditions.elementToBeClickable(pom.getRegister()));
        pom.getRegister().click();
        Thread.sleep(4000);
        pom.getDoThisLater().click();
        
//        tap(150,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        tap(315,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        tap(465,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        tap(616,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        tap(790,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
//        tap(931,1154);
//        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        
    }
      
      
      public void tap(int x, int y) throws InterruptedException {
    	  Thread.sleep(4000); PointerInput fingert = new
    	  PointerInput(PointerInput.Kind.TOUCH, "fingert"); Sequence scrollt = new
    	  Sequence(fingert, 1);
    	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(0),
    	  PointerInput.Origin.viewport(), x, y));
    	  scrollt.addAction(fingert.createPointerDown(0));
    	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(100),
    	  PointerInput.Origin.viewport(), x, y));
    	  scrollt.addAction(fingert.createPointerUp(0));
    	 driver.perform(Arrays.asList(scrollt)); 
    	  }
      
      public void scroll(int x, int y,int p, int q ){
    	  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	  Sequence swipe = new Sequence(finger, 0);

    	 
    	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
    	  swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
    	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(6000), PointerInput.Origin.viewport(), p, q));
    	  swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

    	  driver.perform(Arrays.asList(swipe));
    	  }
      
}
