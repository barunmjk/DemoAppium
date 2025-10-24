package calculator_Test;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import objectRepo.PomCal;

public class Calculator_Test extends BaseClass  {
	@Test
   public void cal_Test() throws InterruptedException {
	   PomCal pc=new PomCal(driver);
	   ExtentTest test=report.createTest("Report1");
	   
	    
	    pc.getCalApp().click();
	    Thread.sleep(3000);
	    pc.getNine().click();
	    Thread.sleep(3000);
	    pc.getPlus().click();
	    Thread.sleep(3000);
	    pc.getThree().click();
	    Thread.sleep(3000);
	    pc.getEquals().click();
	    Thread.sleep(3000);
	   String fresult= pc.getResult().getText();
	   if(fresult.equals("= 12"))
		   test.log(Status.PASS, "Test is pass");
	}
}
