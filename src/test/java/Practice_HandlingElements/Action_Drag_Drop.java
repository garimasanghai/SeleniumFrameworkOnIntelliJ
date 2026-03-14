package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Action_Drag_Drop extends CommonToAll {

    @Test
    public void dragNdrop(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://jqueryui.com/droppable/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
        driver.switchTo().frame(iframe);

        Actions actions = new Actions(driver);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(src, dest).build().perform();

        String actual_text = dest.getText();
        Assert.assertEquals(actual_text, "Dropped!");
        System.out.println("Test exe");

        closeBrowser(driver);
    }
}

/*List<WebElement> iframes = driver.findElements(By.xpath("iframe"));
        System.out.println(iframes.size());*/