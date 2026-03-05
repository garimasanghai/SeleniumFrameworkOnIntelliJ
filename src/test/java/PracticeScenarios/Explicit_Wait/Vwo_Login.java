package PracticeScenarios.Explicit_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vwo_Login {
    WebDriver driver;
    WaitHelper waitHelper;

    @Test
    public void loginPage(){
        driver = new ChromeDriver();
        waitHelper = new WaitHelper(driver);

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement usrname= waitHelper.waitForElementToBeClicked(By.xpath("//input[@data-qa = 'hocewoqisi']"));
        usrname.sendKeys("admin@admin.com");
        WebElement passwrd= waitHelper.waitForElementToBeVisible(By.xpath("//input[@data-qa = 'jobodapuxe']"));
        passwrd.sendKeys("admin");
        WebElement signIn= waitHelper.waitForElementToBeClicked(By.xpath("//button[@data-qa = 'sibequkica']"));
        signIn.click();

        WebElement errMsg= waitHelper.waitForElementToBeVisible(By.xpath("//div[@data-qa = 'rixawilomi']"));
        String errorMessage= errMsg.getText();
        System.out.println("Error msg: " + errorMessage);

        String actualMsg= "Your email, password, IP address or location did not match";
        Assert.assertEquals(errorMessage, actualMsg);
        System.out.println("Test exe");

        driver.quit();
    }
}
