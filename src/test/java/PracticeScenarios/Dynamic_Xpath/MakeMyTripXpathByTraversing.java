package PracticeScenarios.Dynamic_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripXpathByTraversing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("New Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(1000);
		driver.close();
		

	}

}
