package CommonFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {

	public static void CaputareScreenShot(WebDriver driver,String ScreenShotName) throws IOException {
		File srcFile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File(".\\ScreenShots\\"+ScreenShotName+".png"));
		
	}
}
