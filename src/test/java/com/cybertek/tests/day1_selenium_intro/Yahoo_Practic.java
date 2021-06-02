package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practic {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.yahoo.com");
        String acualTitle=driver.getTitle();
        if (driver.getTitle().equals(acualTitle)){
            System.out.println("pass");
        }else {
            System.out.println("not pass");
        }
        driver.close();
    }
}
