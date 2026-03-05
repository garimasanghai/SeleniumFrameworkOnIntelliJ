package PracticeScenarios.Dynamic_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathByTraversing {

	public static void main(String[] args) throws InterruptedException  {
		
//for disabling notification which we cannot inspect or move & is browser specific
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(copt);
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele= driver.findElement(By.xpath("//a[text()='KIDS']"));
		ele.click();
		Thread.sleep(1000);
		
		WebElement ele1= driver.findElement(By.xpath("//a[contains(@href,\"0-to-2-years\")]"));
		ele1.click();
		Thread.sleep(1000);
		
		WebElement productDetails= driver.findElement(By.xpath("//span[contains(.,'₹150') and @class='price  ']/parent::div/parent::div[contains(.,'Graphic Print Shirt with Hood')]"));
		System.out.println(productDetails.getText());
		Thread.sleep(2000);
		driver.close();

	}

}



