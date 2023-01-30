import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {


    public static void logIn( WebDriver driver){
        driver.get("https://prod.beeline.com/pnc");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("naik.r@tcs.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rahulnaik@ylp99#91410");
        driver.findElement(By.cssSelector("span[class='auth0-label-submit']")).click();
    }
    
}
