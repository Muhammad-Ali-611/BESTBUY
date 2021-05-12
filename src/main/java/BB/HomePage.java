package BB;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @Test
    public void Page(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\BESTBUY\\driver\\chromedriver.exe");
        driver.get("https://www.google.com/");
        driver.get("https://www.bestbuy.com/");

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.close();
    }
}
