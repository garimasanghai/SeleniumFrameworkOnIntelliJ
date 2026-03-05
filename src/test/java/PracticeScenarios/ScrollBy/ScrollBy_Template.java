package PracticeScenarios.ScrollBy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollBy_Template {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverWait wait;

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

        //ScrollBY Syntax:
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scrollBy(0,5000)");
        js.executeScript("window,scrollBy(0,-5000)");

        //scenario: scroll to exact element
        WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
        Point l = ele.getLocation();
        int x = l.getX();
        int y = l.getY();

        js.executeScript("window.scrollBy("+x+","+y+")");
        ele.click();
    }
}
