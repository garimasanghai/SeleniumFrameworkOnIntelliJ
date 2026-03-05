package PracticeScenarios.WebElement_Handling;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement opt = driver.findElement(By.id("cars"));
		
		Select s = new Select(opt);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		
//		Thread.sleep(3000);
//		s.deselectByIndex(1);
//		Thread.sleep(3000);
//		s.deselectByValue("199");
//		Thread.sleep(3000);
//		s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		
		List<WebElement> ele = s.getAllSelectedOptions();
		for( WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
