package BB;

import base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search extends HomePage {
    public void Search() throws InterruptedException {
        driver.findElement(By.id("gh-search-input")).sendKeys("Laptops", Keys.ENTER);
        Thread.sleep(2000);
    }
}
