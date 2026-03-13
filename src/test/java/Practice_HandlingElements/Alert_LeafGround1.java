package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_LeafGround1 extends CommonToAll {

    @Test
    public void testAlert1(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://leafground.com/alert.xhtml");

        waitForClickableElement(By.id("j_idt88:j_idt104"));

        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("Jerry");
        System.out.println(alert1.getText());
        alert1.accept();
        waitForJVM(2000);

        WebElement msg = driver.findElement(By.id("confirm_result"));
        System.out.println(msg.getText());

        Assert.assertEquals(msg.getText(), "User entered name as: Jerry");
        System.out.println("Test exe");

        closeBrowser(driver);
    }
}
