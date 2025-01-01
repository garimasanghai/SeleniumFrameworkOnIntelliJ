package SelfPracticeScenarios.EcommerceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FacebookForgotPwd {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
       // WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        driver.getPageSource();
        System.out.println("The title is: " + driver.getTitle());

        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(2000);

       WebElement searchBox= driver.findElement(By.id("identify_email"));
       searchBox.sendKeys("99999");
       driver.findElement(By.id("did_submit")).click();
       Thread.sleep(2000);
        System.out.println("All functions Executed");
        driver.close();


    }

    }

