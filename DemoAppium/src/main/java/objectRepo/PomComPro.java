package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomComPro {
      WebDriver driver;
     public  PomComPro(WebDriver driver){
    	  this.driver=driver;
    	  PageFactory.initElements( driver,this);
      }
      @FindBy(xpath ="//android.view.View[@resource-id='root']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]")
      private WebElement compro;
      public WebElement getComProgram() {
    	  return compro;
      }
      @FindBy(xpath ="//android.view.View[@resource-id='root']/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
      private WebElement schoolpro;
      public WebElement getSchoolProgram() {
    	  return schoolpro;
      }
      @FindBy(xpath="//android.widget.EditText[@resource-id='ion-input-0']")
      private WebElement name;
      public WebElement getName() {
    	  return name;
      }
}