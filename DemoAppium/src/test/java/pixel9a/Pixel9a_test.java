package pixel9a;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtilities.PointerClick;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectRepo.PomPlastic;
import objectRepo.PomRecBiz;

public class Pixel9a_test extends BaseClass {
	   @Test
        public void recBiz() throws InterruptedException {
        	PomRecBiz prb=new PomRecBiz(driver);
        	PomPlastic pom =new PomPlastic(driver);
        	prb.getRecBiz().click();
        	Thread.sleep(4000);
        	prb.getCollectionPoint().click();
        	Thread.sleep(4000);
        	  pom.getcamlogo().click();
              Thread.sleep(6000);
              pom.getTakePhoto().click();
              Thread.sleep(6000);
              pom.getClickpic().click();
              Thread.sleep(6000);
              pom.getPicdone().click();
              Thread.sleep(6000);
              pom.getSavePic().click();
              Thread.sleep(6000);
        	 prb.getName().sendKeys("fleekitSolution");
        	PointerClick pc=new PointerClick();
        	pc.tap(514, 1018,driver);
        	Thread.sleep(4000);
        	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
            Thread.sleep(4000);
            pc.scroll(499,1265,504,1396,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(800,1256,790,1353,driver);
            pc.scroll(252,1265,257,1411,driver);
            Thread.sleep(4000);
            prb.getDonedob().click();
            
            Thread.sleep(4000);
            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(prb.getGender()));
            prb.getGender().click();
            Thread.sleep(4000);
            pom.getMale().click();
            Thread.sleep(4000);
            prb.getPass().sendKeys("Barun@123");
            Thread.sleep(4000);
            prb.getCpass().sendKeys("Barun@123");
            Thread.sleep(4000);
            pc.scroll(587,2167,587,756,driver); 
            Thread.sleep(4000);
            prb.getBizName().sendKeys("AllIndiaWarriors");
            Thread.sleep(4000);
            pom.getCheckBox().click();
            Thread.sleep(4000);
           
            Thread.sleep(6000);
            pom.getRegister().click();
            Thread.sleep(6000);
            pom.getDoThisLater().click();       
            }
}
