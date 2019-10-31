package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {

    public static void main(String[] args) {

      // we have to setup webdriver based on the browser that we gonne use

        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver=new ChromeDriver();

        //open browser
        driver.get("https://www.amazon.com");

        //get the title and print it
        System.out.println(driver.getTitle());








    }







}
