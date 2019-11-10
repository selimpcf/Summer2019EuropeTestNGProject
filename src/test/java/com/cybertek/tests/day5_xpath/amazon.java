package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium");

        WebElement clickButton=driver.findElement(By.xpath("//*[@value='Go']"));
        clickButton.click();

        WebElement resultMessage=driver.findElement(By.xpath("//span[contains(text),'results for'"));


        System.out.println(resultMessage.getText());

    }
}
