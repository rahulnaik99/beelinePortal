package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {


    public static void logIn( WebDriver driver,String mail,String pswd){
        driver.get("https://prod.beeline.com/pnc");

        driver.findElement(By.id("loginButtonLink")).click();

        driver.findElement(By.cssSelector("input[class='input c10744244 cf50dd0ab']")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/div[1]/div/form/div[2]/button")).click();
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pswd);
        driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[3]/button")).click();
    }
    
}
