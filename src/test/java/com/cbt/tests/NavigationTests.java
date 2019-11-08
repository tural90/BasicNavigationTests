package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        String result = StringUtility.verifyEquals(title,title3);
        System.out.println("Expected result is "+title);
        System.out.println("Actual result is "+title3);
        System.out.println(result);

    driver.quit();
    }
}
