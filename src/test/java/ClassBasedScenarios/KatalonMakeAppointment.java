package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonMakeAppointment {
    @Test
    public void test_Katalon_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        WebElement appointment_btn = driver.findElement(By.id("btn-make-appointment"));
        appointment_btn.click();

        WebElement user_txtfield = driver.findElement(By.id("txt-username"));
        user_txtfield.sendKeys("John Doe");

        WebElement pwd_txtfield = driver.findElement(By.id("txt-password"));
        pwd_txtfield.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        //WebElement display_makeappointment = driver.findElement(By.tagName("h2"));
        //display_makeappointment.getText();
        // <---- Since u have to store the value u have to store it in String

        String display_makeappointment = driver.findElement(By.className("text-center")).getText();
        Assert.assertEquals(display_makeappointment, "Make Appointment");

        //driver.quit();
    }
}
