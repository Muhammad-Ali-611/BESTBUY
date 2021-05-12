package HSBC;

import org.openqa.selenium.By;

public class Investing extends HomePage{

    public void Retiring() throws InterruptedException {
        driver.findElement(By.id("header-main-navigation-title")).click();
        Thread.sleep(2000);
    }
}
