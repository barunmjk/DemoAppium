package GenericUtilities;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class PointerClick {
	   //MethodOverLoading
	public void tap(int x, int y,AndroidDriver driver) throws InterruptedException {
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
	  	  
	  	  }
	 public void scroll(int x, int y,int p, int q ){
   	  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
   	  Sequence swipe = new Sequence(finger, 0);

   	 
   	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
   	  swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
   	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(6000), PointerInput.Origin.viewport(), p, q));
   	  swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

   	   
   	  }
	//MethodOverLoading
	 public void scroll(int x, int y,int p, int q ,AndroidDriver driver){
	   	  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	   	  Sequence swipe = new Sequence(finger, 0);

	   	 
	   	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
	   	  swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	   	  swipe.addAction(finger.createPointerMove(Duration.ofMillis(6000), PointerInput.Origin.viewport(), p, q));
	   	  swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	     	driver.perform(Arrays.asList(swipe));
	   	  }
}
