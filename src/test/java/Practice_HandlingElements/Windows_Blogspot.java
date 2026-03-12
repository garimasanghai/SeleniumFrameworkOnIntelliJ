package Practice_HandlingElements;

import BaseClass.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows_Blogspot extends CommonToAll {

    @Test
    public void testAlert(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://testautomationpractice.blogspot.com");

        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

       WebElement btn = waitForVisibility(driver, 3, By.xpath("//button[contains(text(), 'New Tab')]"));
       btn.click();

        Set<String> allWindows = driver.getWindowHandles();

        for(String window : allWindows){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
        WebElement elePresent = waitForVisibility(driver, 3, By.xpath("//div[@id = 'header-inner']/div/h1"));
        String textPresent = elePresent.getText();
        System.out.println(textPresent);

        Assert.assertEquals(textPresent, "SDET-QA Blog");
        System.out.println("You're in child page");
        driver.close();

        //Switching back to parent window
        driver.switchTo().window(currentWindow);
        WebElement parentWindow = waitForVisibility(driver, 3, By.xpath("//div[@id = 'header-inner']/div/h1"));
        String parentWindowEle = parentWindow.getText();
        System.out.println(parentWindowEle);

        Assert.assertEquals(parentWindowEle, "Automation Testing Practice");
        System.out.println("You switched back to parent window");

        closeBrowser(driver);
    }
}