package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorsHomework {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void ExitMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://www.ebay.com/");
        WebElement search=driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        search.sendKeys("cyber");
        WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        WebElement numberOfResults=driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]"));
        System.out.println(numberOfResults.getText());


    }
    @Test
    public void test2() {
        driver.get("https://www.ebay.com/");
        WebElement search = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        search.sendKeys("cyber");
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.contains("cyber")) {
            title = "cyber";
        }
        Assert.assertEquals(title, "cyber");

    }


    @Test
    public void test3(){
        driver.get("http://www.wikipedia.org");
        WebElement english=driver.findElement(By.xpath("//a[@id=\"js-link-box-en\"]/strong"));
        english.click();
        WebElement searchBox=driver.findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys("selenium webdriver");
        WebElement searchButton=driver.findElement(By.xpath("//*[@type='submit']"));
        searchButton.click();
        WebElement seleniumTitle=driver.findElement(By.xpath("//*[@title='Selenium (software)']"));
        seleniumTitle.click();
        String url=driver.getCurrentUrl();
            if(url.endsWith("Selenium_(software)")){
                url="true";
            }
            Assert.assertEquals(url,"true");

    }

}
