package com.cybertek.tests.day9_popups_tabs_frames;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class iframes {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }

    @Test
    public void multipleFrames() {
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //switching to frame top
        driver.switchTo().frame("frame-top");
        //frame top has 3 children frame,left-middle-right
        //switching to middle frame
        driver.switchTo().frame("frame-middle");
        //get the middle text and print it
        System.out.println(driver.findElement(By.id("content")).getText());
        //go back to parent (top frame) to switch right
        driver.switchTo().parentFrame();
        //switching right using index
        driver.switchTo().frame(2);
        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //go up to top level html directly
        driver.switchTo().defaultContent();
        //switch to frame bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());




    }


}