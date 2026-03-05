package PracticeScenarios.PopUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillrarySwitchControlToChildTab {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String d:child)
		{
			driver.switchTo().window(d);
		}
		
		driver.findElement(By.id("mytext")).sendKeys("Debashish");
		
		driver.switchTo().window(parent);
	}

}
