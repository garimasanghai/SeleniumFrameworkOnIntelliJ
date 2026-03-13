package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_Heroku extends CommonToAll {

    @Test
    public void testAlert(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://demoqa.com/alerts");

       WebElement ele1 = waitForVisibility(driver, 2, By.id("confirmButton"));
       ele1.click();
       waitForJVM(2000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();   // read text first
        System.out.println(text);
        alert.accept();

        WebElement msg = waitForVisibility(driver, 2, By.id("confirmResult"));
        System.out.println(msg.getText());

        //verify
        Assert.assertEquals(msg.getText(), "You selected Ok");
        System.out.println("Test exe");
       closeBrowser(driver);

    }
}
