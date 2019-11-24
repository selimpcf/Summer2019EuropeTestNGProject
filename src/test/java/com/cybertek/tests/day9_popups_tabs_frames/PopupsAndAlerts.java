package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);

    }

    @Test
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        //locating and clicking destroy button
        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
        //locating No button from popup and clicking it
        driver.findElement(By.xpath("//*[text()='No']")).click();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //Click for JS Alert
        driver.findElement(By.xpath("//button[1]")).click();
        //controlling alert using with Alert class
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();  // clicking ok
        Thread.sleep(2000);

        //click JS Confirm
        driver.findElement(By.xpath("//button[2]")).click();
        alert.dismiss();  //  clicks no
        Thread.sleep(2000);


        // click  JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("Yaz bakalim biseyler");   //sendKeys()  >> send some keys
        alert.accept();



    }





}
