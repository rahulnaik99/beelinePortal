package Utility;

import org.openqa.selenium.WebDriver;

public class navigate {
    public static void navigateBack(int backCounnt, WebDriver driver) {
        for(int j=0;j<backCounnt;j++){
            driver.navigate().back();
        }
    }
}
