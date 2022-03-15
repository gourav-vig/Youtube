//package Tests;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.GoogleSearchPage;
//import pages.YoutubeScreenShot;
//import pages.YoutubeSearchPage;
//
//public class youtube_Test {
//
//	static WebDriver driver = null;
//	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/eclipse-workspace/SeleniumWithMaven/drivers/chromedriver/chromedriver.exe");
//		driver = new ChromeDriver();
//		googleSearchTest();
//		youtubeSearchTest();
//		Thread.sleep(7000);
//		captureScreenShot();
//		
//		driver.quit();
//	}
//	
//	public static void googleSearchTest() {
//		GoogleSearchPage obj1 = new GoogleSearchPage(driver);
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		obj1.google_SearchText("youtube");
//		obj1.google_SearchButton();
//		obj1.click_YoutubeLink();
//	}
//	
//	public static void youtubeSearchTest() throws InterruptedException{
//		YoutubeSearchPage obj2 = new YoutubeSearchPage(driver);
//		obj2.youtube_SearchButton("hoshiarpur hanuman ji");
//		obj2.select_YoutubeVideo();
//	}
//	
//	public static void captureScreenShot() throws IOException{
//		YoutubeScreenShot obj3 = new YoutubeScreenShot(driver);
//		YoutubeScreenShot obj4 = new YoutubeScreenShot(driver);
//		obj3.take_ScreenShot("Image1.png");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		obj4.take_ScreenShot("Image2.png");
//		
//	}
//	
//
//}
