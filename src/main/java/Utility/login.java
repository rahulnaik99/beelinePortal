package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {


    public static void logIn( WebDriver driver,String mail,String pswd){
        driver.get("https://prod.beeline.com/pnc");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(mail);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pswd);
        driver.findElement(By.cssSelector("span[class='auth0-label-submit']")).click();
    }
    
}
