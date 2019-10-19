package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrograms {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\softwares\\Chromedriver\\chromedriver.exe");
         //System.setProperty("webdriver.ie.driver","D:\\\\softwares\\\\IEDriverServer.exe");
        // System.setProperty("webdriver.firefox.driver","path");
         WebDriver driver= new ChromeDriver();
         
      driver.get("https://www.facebook.com");
      
      driver.findElement(By.linkText("Create a Page")).click();
      driver.findElement(By.partialLinkText("Create")).click();
    
     
       
	}

}
