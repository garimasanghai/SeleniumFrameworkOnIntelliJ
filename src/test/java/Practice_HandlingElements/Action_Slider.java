package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Slider extends CommonToAll {

    @Test
    public void testSlider(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://jqueryui.com/slider/");

        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);
        WebElement slide = driver.findElement(By.xpath("//div[@id = 'slider']/span"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slide, 50,0).build().perform();

        closeBrowser(driver);
    }
}
