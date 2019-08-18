package com.accenttechPartners.Utils;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	
@Test(dataProvider="Login Details")
	
	public void login(String first,String last) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	    
		driver.manage().window().maximize(); 
		driver.get("http://www.demo.guru99.com/V4/index.php");
	    driver.findElement(By.name("uid")).sendKeys(first);
	    driver.findElement(By.name("password")).sendKeys(last);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		 driver.close();
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


