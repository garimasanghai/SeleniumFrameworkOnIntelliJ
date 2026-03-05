package PracticeScenarios.WebelementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(7);
		Thread.sleep(3000);
		s.selectByValue("search-alias=deals-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Digital Music");
		
		List<WebElement> optn = s.getOptions();
		System.out.println(optn.size());
		
		for(WebElement allopt:optn)
		{
			System.out.println(allopt.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
