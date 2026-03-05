package PracticeScenarios.WebelementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions a =  new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='All']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
