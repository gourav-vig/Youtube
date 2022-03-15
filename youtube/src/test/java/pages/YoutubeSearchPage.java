package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class YoutubeSearchPage {

	WebDriver driver = null; 
	
	public YoutubeSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void youtube_SearchButton(String text) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]")).sendKeys(text);
		driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]")).sendKeys(Keys.ENTER);
	}
	
	public void select_YoutubeVideo() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()=\"Hanuman Ji In Hoshiarpur | Day 1,2 | Dussehra 2021 | Mahabali Mahaveer Sewa Samiti Dal |\"]")).click();		
	}
}
