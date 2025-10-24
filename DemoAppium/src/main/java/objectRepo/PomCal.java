package objectRepo;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import io.appium.java_client.android.AndroidDriver;

public class PomCal {
      AndroidDriver driver;
      public PomCal(AndroidDriver driver){
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(xpath ="//android.widget.TextView[@content-desc='Calculator']")
      private WebElement clickcalapp;
      public WebElement getCalApp() {
    	  return clickcalapp;
      }
      @FindBy(xpath ="//android.widget.TextView[@resource-id='com.miui.calculator:id/digit_9']")
      private WebElement nine;
      public WebElement getNine() {
    	  return nine;
      }
      @FindBy(xpath ="//android.widget.TextView[@resource-id='com.miui.calculator:id/digit_3']")
      private WebElement three;
      public WebElement getThree() {
    	  return three;
      }
      @FindBy(xpath ="//android.widget.ImageView[@content-desc='plus']")
      private WebElement plus;
      public WebElement getPlus() {
    	  return plus;
      }
      @FindBy(xpath ="//android.widget.ImageView[@content-desc='equals']")
      private WebElement equals;
      public WebElement getEquals() {
    	  return equals;
      }
      @FindBy(xpath ="//android.widget.TextView[@content-desc='= 12']")
      private WebElement result;
      public WebElement getResult() {
    	  return result;
      }
}
