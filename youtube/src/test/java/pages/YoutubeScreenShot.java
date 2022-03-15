package pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class YoutubeScreenShot {

	WebDriver driver=null;
	
	public YoutubeScreenShot(WebDriver driver) {
		this.driver=driver;
	}
	
	public void take_ScreenShot(String fileName) throws IOException{
		TakesScreenshot shot = (TakesScreenshot)driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./Screenshots/"+fileName));
		System.out.println("ScreenShot Taken!");
	}
}
