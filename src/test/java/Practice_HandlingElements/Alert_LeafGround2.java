package Practice_HandlingElements;

import BaseClass.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_LeafGround2 extends CommonToAll {

    @Test
    public void alertNotAalert(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://leafground.com/alert.xhtml");

        WebElement alertBtn = waitForVisibility(driver,2, By.id("j_idt88:j_idt100"));
        alertBtn.click();

        WebElement cancelAlert = waitForVisibility(driver, 4, By.xpath("(//a[contains(@class, 'ui-dialog-titlebar-close')])[2]"));
        cancelAlert.click();
        System.out.println("Test exe");

    }
}
