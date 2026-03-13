package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowPopup_Blogspot extends CommonToAll {

    @Test
    public void testPopup_Win(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://testautomationpractice.blogspot.com");

        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

        WebElement window_popup = waitForVisibility(driver, 3, By.xpath("//button[contains(text(), 'Popup Windows')]"));
        window_popup.click();

        Set<String> getAllHandles = driver.getWindowHandles();

        for(String window : getAllHandles){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }

        WebElement child_Window = waitForVisibility(driver, 3, By.xpath("//a[contains(text(), 'Register now!')]"));
        String childText = child_Window.getText();
        System.out.println(childText);

        Assert.assertEquals(childText, "Register now!");
        System.out.println("You're in child window");

        driver.close();
        driver.switchTo().window(currentWindow);
        WebElement parentWin = waitForVisibility(driver, 3, By.xpath("//a[contains(text(), 'GUI Elements')]"));
        String parentText = parentWin.getText();
        System.out.println(parentText);

        Assert.assertEquals(parentText, "GUI Elements");
        System.out.println("Successfully switching back to parent window");

        closeBrowser(driver);
    }
}
