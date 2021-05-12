package HSBC;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @Test
    public void HomePage(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\BESTBUY\\driver\\chromedriver.exe");
        driver.get("https://www.us.hsbc.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
    }
}
