package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class SvgElementDemo2 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        // States - // //*[local-name()='svg']/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state:  states){
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }

        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null
    }
}
