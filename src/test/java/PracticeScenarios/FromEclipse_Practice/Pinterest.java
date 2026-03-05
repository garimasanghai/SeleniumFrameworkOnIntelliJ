package PracticeScenarios.FromEclipse_Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinterest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://in.pinterest.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.getTitle();
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();    				//xpath by text() locator
		
	
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");		//id locator
		driver.findElement(By.id("password")).sendKeys("1234");				//id locator
		
		driver.findElement(By.xpath("(//div[text()='Log in'])[2]")).click();			//xpath by group index locator
		
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Pinterest"))
		{
			System.out.println("Pass:home page displayed");
		}
		else
		{
			System.out.println("fail:home page not displayed");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		
		
	}

}
