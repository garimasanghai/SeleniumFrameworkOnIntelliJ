package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeFirst {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.youtube.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Bollywood music 2022");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();	
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//yt-formatted-string[@class= 'style-scope ytd-video-renderer'])[1]")).click();
			Thread.sleep(8000);
			
			Actions a = new Actions(driver);
			
			WebElement button= driver.findElement(By.xpath("(//yt-formatted-string[@class= 'style-scope ytd-video-renderer'])[1]"));
			a.doubleClick(button).perform();
			driver.close();	

		}

	}


