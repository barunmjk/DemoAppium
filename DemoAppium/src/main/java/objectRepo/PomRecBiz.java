package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PomRecBiz {
    WebDriver driver;
    public  PomRecBiz(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements( driver,this);
    }
    @FindBy(xpath="//android.view.View[@resource-id='root']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
    private WebElement recbiz;
    
    public WebElement getRecBiz() {
    	return recbiz;
    }
    
    @FindBy(xpath ="//android.view.View[@resource-id='root']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
    private WebElement collectionPoint;
    public WebElement getCollectionPoint() {
    	return collectionPoint;
    }
    
    @FindBy(xpath ="//android.widget.EditText[@resource-id='ion-input-0']")
    private WebElement name;
    public WebElement getName() {
    	return name;
    }
    
    @FindBy(xpath ="//android.widget.Button[@resource-id='ion-sel-1']")
    private WebElement gender;
	public WebElement getGender() {
		return gender;
	} 
}
