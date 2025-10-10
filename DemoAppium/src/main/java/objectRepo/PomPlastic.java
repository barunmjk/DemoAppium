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
     private WebElement plastic;
	 public WebElement getPlastic() {
		 return plastic;
	 }
	 @FindBy(xpath = "//android.widget.TextView[@text=\"Search\"]")
     private WebElement search;
	 public WebElement getSearch() {
		 return search;
	 }
	 
}
