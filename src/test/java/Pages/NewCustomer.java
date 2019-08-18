package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.accenttechPartners.Utils.BaseClass;
import com.accenttechPartners.Utils.ExcelUtility;

public class NewCustomer extends BaseClass{
      //page object model with pagefactory  
//	@FindBy is annotation which will supports all the 8 locators
	@FindBy(name="name")
	public WebElement name;
	@FindBy(className="name")
	public WebElement name1;
	@FindBy(id="name")
	public WebElement name2;
	
	
	public NewCustomer() {
		PageFactory.initElements(driver, this);
	}

	@DataProvider(name="Login Details")
	public Object[][] getLoginData(){
		ExcelUtility ec= new ExcelUtility();
		ec.openExcel("LoginDetails");
		int rows=   ec.getRowNum();
		int cols=    ec.getColNum(0);
		Object[][] data= new Object[rows-1][cols];
		  for(int i=1;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			data[i-1][j]=	ec.getCellData(i, j);
			}
		}
		
		return data;
		
	}

}

