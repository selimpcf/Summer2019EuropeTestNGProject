package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+enter or CONTROL+SPACE
        //selenium object
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.facebook.com");

        //navigate back to previus page
        driver.navigate().back();   //click back button on browser

        Thread.sleep(3000);  // stops code based on miliseconds

        // goes back to forward
        driver.navigate().forward();   // click forward button on browser

        // refresh the page
        driver.navigate().refresh();








    }



}
