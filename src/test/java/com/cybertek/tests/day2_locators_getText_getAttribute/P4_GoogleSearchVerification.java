package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        //TC#4: Google search1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2-Go to: https://google.com
        driver.get("http://google.com");

        // 3-Write “apple” in search box
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        // 4-Click google search button
        // 5-Verify title:Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("passed");
        }else {
            System.out.println("verification title is failed");
        }
    }
}
