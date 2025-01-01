package SelfPracticeScenarios.EcommerceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        System.out.println("The title is: " + driver.getTitle());

        driver.findElement(By.id("email")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        driver.quit();
    }
}
