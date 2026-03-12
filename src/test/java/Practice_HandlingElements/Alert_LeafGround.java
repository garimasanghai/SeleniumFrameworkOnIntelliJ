package Practice_HandlingElements;

import BaseClass.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_LeafGround extends CommonToAll {

    @Test
    public void testAlert(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://leafground.com/alert.xhtml");
        //j_idt88:j_idt91
        WebElement basicAlert = waitForVisibility(driver, 3, By.id("j_idt88:j_idt91"));
        basicAlert.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        WebElement confirmBasicAlert = waitForVisibility(driver, 2, By.id("simple_result"));
        System.out.println(confirmBasicAlert.getText());

        //Verify
        Assert.assertEquals(confirmBasicAlert.getText(), "You have successfully clicked an alert");
        System.out.println("Test exe");

        closeBrowser(driver);
    }
}
