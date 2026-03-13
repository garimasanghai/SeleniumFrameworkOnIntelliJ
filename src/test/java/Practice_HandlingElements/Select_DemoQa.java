package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_DemoQa extends CommonToAll {
    @Test
    public void test_Select(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://demoqa.com/select-menu");

        WebElement dropdownVal = driver.findElement(By.xpath("(//div[@class = 'css-1wy0on6'])[1]"));
        dropdownVal.click();

        WebElement selectDdVal = driver.findElement(By.xpath("//div[text()= 'Group 1, option 2']"));
        selectDdVal.click();

        WebElement ddOne = driver.findElement(By.xpath("(//div[@class = 'css-1wy0on6'])[2]"));
        ddOne.click();

        WebElement selectDdOne = driver.findElement(By.xpath("//div[text() = 'Ms.']"));
        selectDdOne.click();

        WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
        selectMenu.click();
        //Select from dropdown
        Select select = new Select(selectMenu);
        select.selectByVisibleText("Aqua");
        String color = select.getFirstSelectedOption().getText();
        System.out.println("selected color is: " + color);

        waitForJVM(2000);
        select.selectByValue("5");
        System.out.println(select.getFirstSelectedOption().getText());
        waitForJVM(1000);

        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());

        WebElement multiSelect = driver.findElement(By.xpath("(//div[@class = \'css-13cymwt-control\'])[3]"));
        multiSelect.click();

        WebElement multiOpt1= driver.findElement(By.xpath("//div[text() = 'Green']"));
        multiOpt1.click();

        WebElement multiOpt2 = driver.findElement(By.xpath("//div[text() = 'Black']"));
        multiOpt2.click();

        WebElement multiOpt3 = driver.findElement(By.xpath("//div[text() = 'Blue']"));
        multiOpt3.click();

        WebElement multiOpt4 = driver.findElement(By.xpath("//div[text() = 'Red']"));
        multiOpt4.click();
        driver.findElement(By.xpath("(//div[@class = 'row'])[4]")).click();
        waitForJVM(1000);
        /*WebElement cancelSelectOpt = driver.findElement(By.xpath("(//div[@class = 'css-1wy0on6'])[3]/div"));
        cancelSelectOpt.click();
        waitForJVM(1000);*/

        //For scrolling the page down
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

       WebElement selectCar = driver.findElement(By.id("cars"));
       selectCar.click();

       //Every time you want to use Selenium’s Select class, you must pass the dropdown WebElement to it
        //You do NOT need to create a new Select object every time you select an option, as long as the dropdown is the same.
       Select select1 = new Select(selectCar); //everytime u want to select from particular dd, u need to pass as a parameter
       select1.selectByVisibleText("Volvo");
        System.out.println(select1.getFirstSelectedOption().getText());

        System.out.println("Test exe");
        closeBrowser(driver);

    }
}
