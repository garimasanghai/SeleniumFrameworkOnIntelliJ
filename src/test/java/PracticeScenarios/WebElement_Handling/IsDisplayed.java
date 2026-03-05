package PracticeScenarios.WebElement_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		if (ele.isDisplayed())
		{
			System.out.println("Pass");
			ele.sendKeys("phone");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
