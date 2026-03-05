package PracticeScenarios.PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert_Class_Template {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverWait wait;

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.getText();
        alert.sendKeys("Hello");
    }
}
