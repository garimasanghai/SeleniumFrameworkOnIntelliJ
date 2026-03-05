package PracticeScenarios.PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		//open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://www.amazon.in/");
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		driver.quit();
	}

}
