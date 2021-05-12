package HSBCLogin;

import HSBC.HomePage;
import org.openqa.selenium.By;

public class Login extends HomePage {

    public void LoginPage(){
        driver.get("https://www.security.us.hsbc.com/gsa/SECURITY_LOGON_PAGE/");
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("formSubmitButton2")).click();
        driver.findElement(By.id("phone_text")).submit();
        driver.findElement(By.id("sendSMSPIN")).click();
        driver.findElement(By.id("pinverification")).sendKeys("776975");
        driver.findElement(By.id("yes")).click();
        driver.findElement(By.id("tb_logon")).click();

    }
}
