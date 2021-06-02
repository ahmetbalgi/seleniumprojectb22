package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        //1. open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. go to www.google.com
        driver.get("http:/www.google.com");

        //3. click to email from top right
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();
        // 4. verify the title contains:
        //Expected Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("pass");
        }else {
            System.out.println("failed");

        }
       //5. go back to google by using back
        driver.navigate().back();
        // 6.
        String expectedTitle1 = "Gmail";
        String actualTitle1 = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

    }
}
