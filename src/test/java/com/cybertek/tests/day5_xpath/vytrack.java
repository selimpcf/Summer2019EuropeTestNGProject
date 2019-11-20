package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vytrack {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/user/login");

        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("user7");

        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        WebElement clickButton=driver.findElement(By.id("_submit"));
        clickButton.click();

        clickButton.getText();

        String loginURL=driver.getCurrentUrl();
        if(loginURL.equals("https://qa1.vytrack.com/")){
            System.out.println("PASS");
        }else{
            System.out.println("user can not login");
        }

        String title=driver.getTitle();
        System.out.println(title);
    }
}
