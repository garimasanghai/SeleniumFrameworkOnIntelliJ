package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Select_Automation_Testing extends CommonToAll {
    @Test
    public void testSelect(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://testautomationpractice.blogspot.com/");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        WebElement country = driver.findElement(By.id("country"));

        Select select = new Select(country);
        select.selectByVisibleText("Brazil");

        waitForJVM(2000);
        /*List<WebElement> options = select.getOptions();

        for(WebElement option : options){
            System.out.println(option.getText());
            if(option.getText().equals("Brazil")){
                option.click();
                break;
            }
        }*/
        closeBrowser(driver);
    }
}
