package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Action_Heroku_MouseHover extends CommonToAll {

    @Test
    public void test_MouseHover(){
        driver= new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        List<WebElement> username = driver.findElements(By.xpath("//div[@class = 'figure']"));

        //Take each element from the username list one by one and store it temporarily in display_username.
        for(WebElement display_username : username){
            actions.moveToElement(display_username).build().perform();

            WebElement all_Username = display_username.findElement(By.xpath(".//h5"));
            Assert.assertTrue(all_Username.isDisplayed());
            String names = all_Username.getText();
            System.out.println(names);
        }
        closeBrowser(driver);
    }
}
