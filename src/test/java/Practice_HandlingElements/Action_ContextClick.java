package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action_ContextClick extends CommonToAll {

    @Test
    public void test_contextClick(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/context_menu");

        WebElement context_click = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(context_click).build().perform();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        Assert.assertEquals(text, "You selected a context menu");
        alert.accept();

        closeBrowser(driver);
    }
}
