package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver = null;
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void google_SearchText(String text) {
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(text);
	}
	
	public void google_SearchButton() {
		driver.findElement(By.xpath("(//*[@value=\"Google Search\" and @type=\"submit\"])[2]")).sendKeys(Keys.RETURN);
	}
	public void click_YoutubeLink() {
		driver.findElement(By.xpath("//h3[text()=\"YouTube\"]")).click();
	}
}
