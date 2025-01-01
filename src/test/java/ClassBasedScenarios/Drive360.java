package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Drive360 {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(2000);
        System.out.println("Page loaded");

        driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text() = 'Sign in']")).click();
        Thread.sleep(2000);
        System.out.println("Navigated to homepage");

        Thread.sleep(15000);
       WebElement title = driver.findElement(By.xpath("//div//h5[text() = 'Your free trial has expired']"));
        Assert.assertEquals(title.getText(), "Your free trial has expired");
        System.out.println("You're on the expected page, Thank You");
        driver.quit();


    }

}
