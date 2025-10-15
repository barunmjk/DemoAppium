package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		 
		 @FindBy(  xpath="//android.widget.EditText[@resource-id='ion-input-3']")
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
		 
		 
}