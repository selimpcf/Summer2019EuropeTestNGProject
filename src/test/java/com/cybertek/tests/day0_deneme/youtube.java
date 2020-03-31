package com.cybertek.tests.day0_deneme;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class youtube{
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://youtube.com");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
       // driver.quit();
    }
    @Test
    public void ytest(){
    WebElement signIn=driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
    signIn.click();
    WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
    email.sendKeys("wirelisa35@gmail.com");
    WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
    nextButton.click();


    }
    @Test
    public void ytest2(){
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("fatih bulut yalan oldu");
        WebElement searchButton=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton.click();
        WebElement firstVideo=driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        firstVideo.click();
    }












}
