package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // write a string method that takes a string parameter
    // based on value of the parameter
    // the method must return chromedriver or firefoxdriver object
    //name: getDriver

    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;

        switch(browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

        }

        return driver;

    }




}
