package PracticeScenarios.WebElement_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phon");
		
		Thread.sleep(5000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println(ele1.size());
		
		for(WebElement x:ele1)
		{
			System.out.println(x.getText());
		}
		
		driver.close();
	}

}
