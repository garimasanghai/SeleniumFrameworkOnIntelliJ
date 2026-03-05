package PracticeScenarios.WebElement_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiplecheck {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement opt = driver.findElement(By.id("cars"));
		
		Select s = new Select(opt);
		s.selectByIndex(1);
		s.selectByValue("199");
		s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		
		System.out.println(s.isMultiple());
		
		if (s.isMultiple()) 
		{
			s.deselectAll();
		}
		
		driver.close();

	}

}
