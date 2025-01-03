package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableDemo2 {
    public static void main(String[] args) throws Exception {

            WebDriver driver = new ChromeDriver();
            driver.get("https://awesomeqa.com/webtable1.html");
            driver.manage().window().maximize();

            // Find the xPath for the WebTable
            // -> //table[@summary="Sample Table"]

            WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));


            // rows and columns
            List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

            for( int i=0; i <rows_tables.size();i++){
                List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
                for(WebElement c: col){
                    System.out.println(c.getText());
                }
            }
            Thread.sleep(5000);
            driver.quit();
            // It will close all the tabs. - session id == null

        }
}
