package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action_Heroku_Single_MouseHover extends CommonToAll {

    @Test
    public void test_mouseHover(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/hovers");

        WebElement figure_one = driver.findElement(By.xpath("//div[@class = 'figure']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(figure_one).build().perform();

      WebElement name1=  driver.findElement(By.xpath("//div[@class = 'figcaption']/h5"));
        Assert.assertTrue(name1.isDisplayed()); // if name1 is displayed then sout
        System.out.println(name1.getText());

        closeBrowser(driver);
    }
}
