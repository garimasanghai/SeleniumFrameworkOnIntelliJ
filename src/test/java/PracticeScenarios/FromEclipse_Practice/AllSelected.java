package PracticeScenarios.FromEclipse_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
		
		s.selectByIndex(0);
		s.selectByValue("199");
		
		List<WebElement> opt = s.getAllSelectedOptions();
		
		for(WebElement ele:opt)
		{
			System.out.println(ele.getText());
		}
		
		driver.close();
	}

}
