package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class PomPlastic {
     WebDriver driver;
     public PomPlastic(WebDriver driver){
    	 this.driver=driver;
    	 PageFactory.initElements  (driver, this);
     }
     @FindBy(xpath = "//android.widget.TextView[@content-desc='Predicted app: PlasticBank']")
     private WebElement plasticApp;
	 public WebElement getPlasticApp() {
		 return plasticApp;
	 }
	 
		 @FindBy(  xpath="//android.widget.Button[@text='Sign up']")
	     private WebElement signup;
		 public WebElement getSignUp() {
			 return signup;
	 }
		 
		 @FindBy(xpath = "//android.widget.TextView[@text=\'Collector\']")
	     private WebElement collector;
		 public WebElement getCollector() {
			 return collector;
	 }
		 @FindBy(  xpath="//android.widget.EditText[@resource-id='ion-input-1']")
	     private WebElement name;
		 public WebElement getName() {
			 return name;
	 }
		 
		 @FindBy(xpath = "//android.widget.EditText[@resource-id='ion-input-3']")
	     private WebElement phNum;
		 public WebElement getPhNum() {
			 return phNum;
	 }
		 @FindBy(  xpath="//android.widget.TextView[@text='English']")
	     private WebElement english;
		 public WebElement getEnglish() {
			 return english;
	 } 
		 @FindBy(  xpath="//android.widget.Button[@text='Continue']")
	     private WebElement continueBtn;
		 public WebElement getContinueBtn() {
			 return continueBtn;
	 } 
		 @AndroidFindBy(uiAutomator ="new UiSelector().resourceId('ion-input-2')")
		 private WebElement countryCode;
		 public WebElement getCountryCode() {
			 return countryCode;
	 } 
		 @FindBy(xpath = "//android.widget.EditText[@resource-id='ion-input-4']")
		 private WebElement dob;
		 public WebElement getDOB() {
			 return dob;
		 }
		  @FindBy(xpath = "//android.view.View[@text='Select a year']")
		  private WebElement selYear;
		  public WebElement getSelYear() {
			  return selYear;
		  }
		  @FindBy(xpath = "//android.widget.Button[@text='DONE']")
		  private WebElement done;
		  public WebElement getDone() {
			  return done;
		  }
		  @FindBy(xpath ="//android.widget.Button[@resource-id='ion-sel-0']") 
		  private WebElement gender;
		  public WebElement getGender() {
			  return gender;
		  }
		  @FindBy(xpath ="//android.widget.RadioGroup/android.view.View[2]/android.view.View/android.view.View")  
		  private WebElement male;
		  public WebElement getMale() {
			  return male;
		  }
		  @FindBy(xpath="//android.widget.EditText[@resource-id='ion-input-5']")  
		  private WebElement pass;
		  public WebElement getPass() {
			  return pass;
		  }
		  @FindBy(xpath ="//android.widget.EditText[@resource-id='ion-input-6']")
		  private WebElement cpass;
		  public WebElement getCPass() {
			  return cpass;
		  }
		  @FindBy(xpath="//android.widget.CheckBox/android.view.View/android.widget.Image")  
		  private WebElement checkBox;
		  
		  public WebElement getCheckBox() {
			  return checkBox;
		  }
		  @FindBy(xpath = "//android.view.View[@resource-id='root']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
	
		  private WebElement camlogo;
		  public WebElement getcamlogo() {
			  return camlogo;
		  }
		  @FindBy(xpath ="//android.widget.Button[@text='Take photo']")  
		  private WebElement takephoto;
		  public WebElement getTakePhoto() {
			  return takephoto;
		  }
		  @FindBy(xpath ="//android.widget.ImageView[@content-desc='Shutter']")
		  private WebElement clickpic;
		  public WebElement getClickpic() {
			  return clickpic;
		  }
		  @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Done']")
		  private WebElement picdone;
		  public WebElement getPicdone() {
			  return picdone;
		  }
		  @FindBy(xpath ="//android.widget.Button[@text='Save photo']")
		  private WebElement savepic;
		  public WebElement getSavePic() {
			  return savepic;
		  }
		  @FindBy(xpath="//android.widget.Button[@text='Register']") 
		  private WebElement register;
		  public WebElement getRegister() {
			  return register;
		  }
		  @FindBy(xpath ="//android.widget.Button[@text='Do this later']")
		  private WebElement dothislater;
		   
		  public WebElement getDoThisLater() {
			 
			return dothislater;
		  }

	 
		  
}