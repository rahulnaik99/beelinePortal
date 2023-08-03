package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class as {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\IdeaProjects\\beelinePortal\\src\\main\\resources\\chromedriver.exe");


        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        for(int i=0;i<1000;i++){
        WebDriver driver1 = new ChromeDriver(opt);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver1.get("https://www.youtube.com/watch?v=RkH4kL2scbA");
            driver1.findElement(By.cssSelector("button[class='ytp-play-button ytp-button']")).click();
        }




    }
    }

