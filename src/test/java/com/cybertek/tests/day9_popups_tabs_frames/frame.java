package com.cybertek.tests.day9_popups_tabs_frames;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class frame {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }
    @Test
    public void test1(){
    driver.get("http://practice.cybertekschool.com/iframe");

    //HOW TO SWITCH FRAMES
        driver.switchTo().frame("mce_0_ifr");
        //locate and send some text
        driver.findElement(By.id("tinymce")).clear();
    driver.findElement(By.id("tinymce")).sendKeys("Test Text Gonder bakalim");

    //go back to first frame, only to parent
        driver.switchTo().parentFrame();

        //3.USING WEBELEMENT
        WebElement frameElement=driver.findElement(By.tagName("iframe"));

        //passing frame as a webelement
        driver.switchTo().frame(frameElement);

        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We located with WebElement");



    }
}
