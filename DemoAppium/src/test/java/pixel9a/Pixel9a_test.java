package pixel9a;

import org.testng.annotations.Test;

import GenericUtilities.PointerClick;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectRepo.PomRecBiz;

public class Pixel9a_test extends BaseClass {
	   @Test
        public void recBiz() throws InterruptedException {
        	PomRecBiz prb=new PomRecBiz(driver);
        	prb.getRecBiz().click();
        	Thread.sleep(4000);
        	prb.getCollectionPoint().click();
        	Thread.sleep(4000);
        	PointerClick pc=new PointerClick();
        	pc.tap(514, 1018,driver);
        	Thread.sleep(4000);
        	driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
            driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
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
            prb.getName().click();
            Thread.sleep(4000);
            prb.getGender().click();
            
        }
}
