package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Women Ethnic']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
