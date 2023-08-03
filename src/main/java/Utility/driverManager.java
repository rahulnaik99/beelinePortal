package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverManager {



    public static WebDriver drivers(WebDriver driver){

//        WebDriver drivers = driver;
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Desktop\\BeelinePortal\\src\\main\\resources\\chromedriver.exe");
//
//        ChromeOptions opt = new ChromeOptions();
//        opt.addArguments("--remote-allow-origins=*");
//        WebDriver driver1 = new ChromeDriver(opt);
//        drivers=driver();
//        return drivers;
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver1 = new ChromeDriver(opt);
        driver1.get("https://www.google.com");
        return driver1;


    }
    public static WebDriver driver(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver1 = new ChromeDriver(opt);
        driver1.get("https://www.google.com");
        return driver1;
    }
}
