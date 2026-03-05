package PracticeScenarios.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions_Class_Template {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverWait wait;

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
        WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform(); // <----- Mouse hover
        actions.contextClick().perform(); // <---- Right click
        actions.doubleClick().perform(); // <----- double click
        actions.dragAndDrop(ele, ele2).perform(); // <---- drag n drop


    }
}
