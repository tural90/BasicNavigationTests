package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com", "https://walmart.com","https://westelm.com");


        WebDriver driver = BrowserFactory.getDriver("chrome");


        driver.get(urls.get(3));
        String url1 = urls.get(3).replace("https://","");
        url1 = url1.replace(".com","");
        String title1 = driver.getTitle().toLowerCase();
        title1 = title1.replaceAll(" ","");


        if(title1.contains(url1)){
          System.out.println("Url contains title");
          System.out.println("url is "+urls.get(3));
          System.out.println("title is "+title1);

      }
      else {
          System.out.println("Url does not contain title");
          System.out.println("url is "+urls.get(3));
          System.out.println("title is "+title1);
      }


        driver.get(urls.get(1));
        String url2 = urls.get(1).replace("https://","");
        url2 = url2.replace(".com","");
        String title2 = driver.getTitle().toLowerCase();
        title2 = title2.replaceAll(" ","");


        if(title2.contains(url2)){
            System.out.println("Url contains title");
            System.out.println("url is "+urls.get(1));
            System.out.println("title is "+title2);

        }
        else {
            System.out.println("Url does not contain title");
            System.out.println("url is "+urls.get(1));
            System.out.println("title is "+title2);
        }


        driver.get(urls.get(2));
        String url3 = urls.get(2).replace("https://","");
        url3 = url3.replace(".com","");
        String title3 = driver.getTitle().toLowerCase();
        title3 = title3.replaceAll(" ","");


        if(title3.contains(url3)){
            System.out.println("Url contains title");
            System.out.println("url is "+urls.get(2));
            System.out.println("title is "+title3);

        }
        else {
            System.out.println("Url does not contain title");
            System.out.println("url is "+urls.get(2));
            System.out.println("title is "+title3);
        }
        driver.quit();
    }
}
