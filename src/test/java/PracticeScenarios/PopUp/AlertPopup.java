package PracticeScenarios.PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {

public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("course"));
		Actions s = new Actions(driver);
		s.moveToElement(ele).perform();

		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();

		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();

		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		// popup.dismiss();
		popup.accept();

		driver.close();

	}

}
