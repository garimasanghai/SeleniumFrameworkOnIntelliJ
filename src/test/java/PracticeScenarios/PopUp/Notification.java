package PracticeScenarios.PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notification {

	public static void main(String[] args) 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		
		
		FirefoxOptions fo =  new FirefoxOptions();
		fo.addArguments("--disable-notifications");
		WebDriver driver1 = new FirefoxDriver(fo);
		
		driver.manage().window().maximize();
		driver.get("https://www.quikr.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
