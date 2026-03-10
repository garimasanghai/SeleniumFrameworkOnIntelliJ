package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("email")).sendKeys("admin");			//id locator
		driver.findElement(By.name("pass")).sendKeys("manager");								//id locator
		
		driver.findElement(By.name("login")).click();									//name locator
		
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println(title);
		
		if(title.equals("Facebook"))
		{
			System.out.println("Pass:home page is displayed");
		}
		else
		{
			System.out.println("Fail:home page is not displayed");
		}
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		

	}

}
