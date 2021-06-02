package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_cybertekUrLverification {
    public static void main(String[] args) {

        //setup the browser driver
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // maximize the page
        driver.manage().window().maximize();
        // 2. go to https://pratice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");
        //3. verify URL contains
        //Expected: cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!");
        }


        //4. verify Title:
        // Expected: Practice
       String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification PASSED!");
        }else {
            System.out.println("title verification FAILED!");
        }


    }
}
