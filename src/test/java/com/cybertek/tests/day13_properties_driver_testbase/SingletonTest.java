package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    @Test
    public void test2(){

        //this is how we create webdriver object from now on
        //type of the driver will come from configuration.properties file
        WebDriver driver= Driver.get();

        //we are getting url from configuration.properties file
        driver.get(ConfigurationReader.get("url"));

        Driver.get().navigate().refresh();
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(2000);
        Driver.get().get("http:www.amazon.com");

        //if we are using Driver close, we use closeDriver method to close the driver
        Driver.closeDriver();




    }



}
