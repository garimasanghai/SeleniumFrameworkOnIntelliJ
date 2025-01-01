package ClassBasedScenarios.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoClass {
    public static void main(String[] args) throws InterruptedException {

            // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
            //EdgeOptions edgeOptions = new EdgeOptions();

            // EdgeOptions -> It will help you set the browser
            // options to browsers
            // window - size
            // headless mode - there is not UI -> advantage - Fast Execution
            // full UI mode - default - UI browser
            // incognito mode - switch
            // start Max
            // add extensions - browsers
            // 100 + others , https , http
            // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
            // edgeOptions.addArguments("--start-maximized");
          //  edgeOptions.addArguments("--headless");


            WebDriver driver = new EdgeDriver();
            driver.get("https://google.com");

            Thread.sleep(15000);
            driver.quit();
            // It will close all the tabs. - session id == null

        }

    }
