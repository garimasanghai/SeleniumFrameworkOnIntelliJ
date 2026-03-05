package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typeCasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//top to bottom
		js.executeScript("window.scrollBy(0,5000)");
		//bottom to top
		js.executeScript("window.scrollBy(0,5000)");
	}

}
