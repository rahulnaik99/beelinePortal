package Pages;

import CommonMethods.Util;
import Utility.driverManager;
import Utility.login;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class classFactory {


    public classFactory() {
    }

    public static void invoke(String[] reqID,String mail,String pswd) throws FileNotFoundException {
      WebDriver driver=null;
      driver= driverManager.drivers(driver);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      login.logIn(driver,mail,pswd);
      portal.getBeelineStatus(reqID,driver, Util.csvHandler());
    }
}
