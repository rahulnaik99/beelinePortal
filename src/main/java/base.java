import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

    public static WebDriver drivers(WebDriver driver){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rmnai\\OneDrive\\Documents\\Projects\\Selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
