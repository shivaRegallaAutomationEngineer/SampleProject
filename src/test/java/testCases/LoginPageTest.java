package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.accenttechPartners.Utils.CommonMethods;
import com.accenttechPartners.Utils.ExcelUtility;

import Pages.LoginPage;

public class LoginPageTest extends CommonMethods {
	
	
	@Test(dataProvider="Login Details")
	public void VerifywithValidCredentials(String username,String password) throws InterruptedException {
		LoginPage loginpage= new LoginPage();
		
		CommonMethods.sendText(loginpage.username, username);
		
		CommonMethods.sendText(loginpage.password, password);
		CommonMethods.click(loginpage.btnLogin);
		CommonMethods.acceptAlert();
	
		
	}
	
	@Test(dataProvider="Login Details1",enabled=false)
	public void VerifywithinValidCredentials(String username,String password) throws InterruptedException {
		LoginPage loginpage= new LoginPage();
		
		CommonMethods.sendText(loginpage.username, username);
		
		CommonMethods.sendText(loginpage.password, password);
		CommonMethods.click(loginpage.btnLogin);
		CommonMethods.acceptAlert();
		String Expectedtitle=	driver.getTitle();
	    String ActualTitle="Guru99 Bank Manager HomePage";
	    if(Expectedtitle.contentEquals(ActualTitle)) {
	    	System.out.println("Valid credentails");
	    }
	    else {
	    	System.out.println("Invalid Credentials");
	    }
	}
	
	@DataProvider(name="Login Details")
	public Object[][] getLoginData(){
		ExcelUtility ec= new ExcelUtility();
		ec.openExcel("TestData");
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
		
	@DataProvider(name="Login Details1")
	public Object[][] getLoginData1(){
		ExcelUtility ec= new ExcelUtility();
		ec.openExcel("LoginDetails1");
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
