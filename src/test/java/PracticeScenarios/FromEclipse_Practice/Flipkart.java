package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");		//xpath by group index locator
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");		//xpath by attributes locator
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();					//xpath by attributes locator
	
		
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		System.out.println(title);
		
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
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
