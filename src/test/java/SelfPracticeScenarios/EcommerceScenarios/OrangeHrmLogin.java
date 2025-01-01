package SelfPracticeScenarios.EcommerceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHrmLogin {
    static WebDriver driver = new ChromeDriver();

    public static void login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();

        WebElement message = driver.findElement(By.xpath("//*[text() ='Time at Work']"));
        //asserting whether you're on the right page
        Assert.assertEquals(message.getText(), "Time at Work");
        System.out.println("You are on the right page");
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        login();
    }

}
