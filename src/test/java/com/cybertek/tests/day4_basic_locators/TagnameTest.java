package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        //enter full name
        WebElement fullnameInput=driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Isa Arslan");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@gmail.com");

        WebElement signupButton=driver.findElement(By.tagName("button"));
        signupButton.click();

        // print the message using tagname locator
        WebElement signupMessage=driver.findElement(By.tagName("h3"));

        System.out.println(signupMessage.getText());













    }
}
