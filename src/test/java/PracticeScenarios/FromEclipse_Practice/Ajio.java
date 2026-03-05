package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.name("searchVal"));
		ele.sendKeys("comp");
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[@class='higlighted-text']"));
		System.out.println(ele1.size());
		
		for( WebElement b:ele1) {
			System.out.println(b.getText());
		}
		
		driver.close();

	}

}
