package PracticeScenarios.ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[@role = 'button']")).click();

		Actions a =  new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//span[text() = 'Login']"));
		//hover on login
		a.moveToElement(login).perform();

        //get all the elements under login
		List<WebElement> options = driver.findElements(By.xpath("//ul//li"));
		for(WebElement option : options){
			System.out.println(option.getText());
			}
		driver.quit();
	}
}
