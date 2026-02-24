package Practice_Demo_01.Intro_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookForgotPwd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        driver.getPageSource();
        System.out.println("Page title: "+ driver.getTitle());

        driver.findElement(By.partialLinkText("Forgotten password?")).click();
        System.out.println("Its exe");
        driver.findElement(By.id("_r_2_")).sendKeys("9593255556");
        driver.findElement(By.xpath("(//div[@role='none'])[2]")).click();
        Thread.sleep(2000);
        /*System.out.println("navigating");
        driver.findElement(By.partialLinkText("Email address")).sendKeys("hgvhfvyggfcgfcc");
        driver.findElement(By.partialLinkText("Continue")).click();
        Thread.sleep(2000);*/
        driver.getTitle();
        Thread.sleep(2000);
        System.out.println("All functions Executed");
        driver.close();

    }
}
