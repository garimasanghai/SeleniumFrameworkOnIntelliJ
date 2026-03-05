package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String t1=driver.getTitle();
		System.out.println(t1);
		
		driver.findElement(By.name("username")).sendKeys("admin@gmail.com");		//name locator
		driver.findElement(By.name("password")).sendKeys("manager");				//name locator
		
		
		driver.findElement(By.xpath("//div[text()='Log In']")).click();						//xpath by text()
		
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("Instagram"));
		System.out.println(title);
		
		if(title.equals("Instagram"))
		{
			System.out.println("Pass:home page displayed");
		}
		else
		{
			System.out.println("fail:home page not displayed");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}
