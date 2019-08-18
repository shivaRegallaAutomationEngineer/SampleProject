package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenttechPartners.Utils.BaseClass;
public class LoginPage extends BaseClass {

	@FindBy(name="uid")
	public WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(name="btnLogin")
	public WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
}
