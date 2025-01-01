package ClassBasedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VingifyVerifyErrorMsg {
      @Test
    public void test_negative_vwo_login() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial");

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("987656789dasdasd");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        // <div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.25s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        Thread.sleep(5000);
        driver.quit();
      }
}
