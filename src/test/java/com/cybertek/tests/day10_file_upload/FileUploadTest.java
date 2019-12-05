package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\HP\\Desktop\\file.txt");

        driver.findElement(By.id("file-submit")).click();

        String actualFileName=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFileName,"file.txt","verify the file name");


    }



    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");
        String projectPath=System.getProperty("user.dir");
        String relativePath="src\\test\\resources\\testfile.txt";

        String filePath=projectPath+"\\"+relativePath;
        System.out.println(filePath);

        driver.findElement(By.name("file")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        String actualFileName=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFileName,"testfile.txt","verify the file name");



    }














}
