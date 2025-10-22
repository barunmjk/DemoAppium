package pixel9a;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtilities.PointerClick;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectRepo.PomComPro;
import objectRepo.PomPlastic;
import objectRepo.PomRecBiz;

public class Pixel9aCommunityProgram_Test extends BaseClass {
    @Test 
	public void CommunityProgram_Test() throws InterruptedException {
    	 PomComPro pcp=new PomComPro(driver);
    	 PomPlastic pom=new PomPlastic(driver);
    	 PomRecBiz prb=new PomRecBiz(driver);
    	 pcp.getComProgram().click();
    	 Thread.sleep(4000);
    	 pcp.getSchoolProgram().click();
    	 Thread.sleep(4000);
    	 pom.getcamlogo().click();
    	 Thread.sleep(4000);
    	 pom.getTakePhoto().click();
    	 Thread.sleep(6000);
    	 pom.getClickpic().click();
    	 Thread.sleep(6000);
    	 pom.getPicdone().click();
    	 Thread.sleep(6000);
    	 pom.getSavePic().click();
    	 
    	 pcp.getName().sendKeys("solutions kumar");
    	 Thread.sleep(4000);
    	 PointerClick pc=new PointerClick();
     	pc.tap(514, 1018,driver);
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
     	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
     	
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
