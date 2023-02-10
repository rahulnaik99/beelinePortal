package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {



    public static WebDriver drivers(WebDriver driver){

       WebDriver drivers = driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Documents\\Projects\\Selenium\\src\\main\\resources\\chromedriver.exe");
        drivers = new ChromeDriver();
        return drivers;
    }
}
