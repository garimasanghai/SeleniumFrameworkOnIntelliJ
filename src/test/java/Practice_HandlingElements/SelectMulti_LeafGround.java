package Practice_HandlingElements;

import Base_Class.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMulti_LeafGround extends CommonToAll {
    @Test
    public void Test_MultiSelect(){
        driver = new ChromeDriver();
        openBrowser(driver, "https://leafground.com/select.xhtml");

        WebElement select_Tool = driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']"));

        Select selectTool = new Select(select_Tool);
        selectTool.selectByIndex(2);
        String selectedTool = selectTool.getFirstSelectedOption().getText();
        System.out.println(selectedTool);

        WebElement select_country = driver.findElement(By.id("j_idt87:country"));
        select_country.click();
        WebElement selected_country = driver.findElement(By.xpath("//li[@data-label = 'Germany']"));
        selected_country.click();
        System.out.println(select_country.getText());

        WebElement chooseLang = driver.findElement(By.id("j_idt87:lang"));
        chooseLang.click();
        WebElement chosenLang = driver.findElement(By.xpath("//li[@data-label = 'English']"));
        chosenLang.click();
        System.out.println(chosenLang.getText());

        WebElement secondLang = driver.findElement(By.xpath("(//div[@class ='grid formgrid'])[5]"));
        secondLang.click();
        WebElement chosen_SecondLang = driver.findElement(By.id("j_idt87:value_3"));
        chosen_SecondLang.click();
        System.out.println(chosen_SecondLang.getText());

        waitForJVM(2000);
        closeBrowser(driver);
    }
}
