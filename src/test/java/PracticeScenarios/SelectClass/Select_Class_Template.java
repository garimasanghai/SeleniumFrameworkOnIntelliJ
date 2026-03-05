package PracticeScenarios.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Select_Class_Template {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverWait wait;

        driver= new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label = 'Expand Account and Lists']")));
        Select s = new Select(dropdown);
        s.selectByIndex(2);
        s.selectByValue("");
        s.selectByVisibleText("");

        //For multi select
       if(s.isMultiple()){
           s.deselectAll();
       }
       else{
           System.out.println("Test exe");
           driver.quit();
       }
    }
}
