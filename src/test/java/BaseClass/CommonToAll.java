package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {

    public ChromeDriver driver;

    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }

    public void waitForElementsToBeVisible(WebDriver driver, int timeinSeconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClicked(WebDriver driver, int timeinsecs, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinsecs));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void jvmwait(int time){
       try{
           Thread.sleep(time);
       }
       catch (InterruptedException exception){
           System.out.println(exception);
       }
    }
}
