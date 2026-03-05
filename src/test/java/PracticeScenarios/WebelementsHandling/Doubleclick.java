package PracticeScenarios.WebelementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(5000);
		a.doubleClick(ele1).perform();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
