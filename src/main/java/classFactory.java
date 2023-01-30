import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class classFactory {
    public static void invoke(String[] reqID ) throws FileNotFoundException {
        WebDriver driver=null;
        login log = new login();
        portal status = new portal();
        base Driver = new base();
        driver=Driver.drivers(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        log.logIn(driver);
        status.getBeelineStatus(reqID,driver);
    }
}
