package Basic_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import static org.assertj.core.api.Assertions.*;

public class Test_Url_01 {
  //  public static void main(String[] args) throws InterruptedException {

    @Test
    public void test_url() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        System.out.println("The title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Facebook" );

        //AssertJ Assertions: use only when u r sure all assertions will pass, else if one fails all fails
        assertThat(driver.getTitle())
                .isNotNull()
                .isNotEmpty()
                .isNotBlank()
                .isEqualTo("Facebook");

        driver.findElement(By.name("email")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("admin");
        driver.findElement(By.partialLinkText("Log in")).click();
        Thread.sleep(2000);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        driver.quit();


    }
}
