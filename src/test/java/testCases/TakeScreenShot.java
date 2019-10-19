package testCases;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import CommonFunctions.ReusableMethods;




public class TakeScreenShot {
public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chorme.driver","D:\\softwares\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		ReusableMethods.CaputareScreenShot(driver, "facebook");
		
		driver.findElement(By.name("email")).sendKeys("selenium");
		ReusableMethods.CaputareScreenShot(driver, "email");
		
}
}