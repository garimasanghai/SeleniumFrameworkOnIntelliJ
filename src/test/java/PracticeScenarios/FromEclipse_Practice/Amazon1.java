package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String t1=driver.getTitle();
		System.out.println(t1);
		
		
		driver.findElement(By.linkText("Sign in")).click();			//linkText locator
		
		
		driver.findElement(By.id("ap_email")).sendKeys("admin");		//id locator
		driver.findElement(By.id("continue")).click();						//id locator
		
		driver.findElement(By.id("ap_password")).sendKeys("manager");	//id locator
		driver.findElement(By.id("signInSubmit")).click();					//id locator
		
	
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("Amazon"));
		System.out.println(title);
		
		if(title.equals("Amazon"))
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
