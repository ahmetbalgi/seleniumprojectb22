package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
public class WebDriverFactory {
    public static WebDriver getDriver(String browserTyp) {
        if (browserTyp.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        } else if (browserTyp.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given browser type does not exist. Driver = null");
            return null;
        }
    }
}
