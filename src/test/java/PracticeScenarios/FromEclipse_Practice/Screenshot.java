package PracticeScenarios.FromEclipse_Practice;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//TypeCasting
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//We can access method and store it in RAM
		File dest = new File("./photo/amazon.png");
		
		//copy and paste from RAM to Required location 
		FileUtils.copyFile(src, dest);
		
		driver.close();
	}

}
