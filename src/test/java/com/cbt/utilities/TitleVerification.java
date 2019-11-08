package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();

        driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();

        driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();

        String expected = "Practice";

        if (expected.equals(title1)&&(expected.equals(title2))&&(expected.equals(title3))){
            System.out.println("Pass");
        }
        driver.quit();
        }

}
