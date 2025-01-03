package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SvgElementDemo1 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();


        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null
    }
}
