package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        WebElement homeButton=driver.findElement(By.className("nav-link"));
        homeButton.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement multipleButtonsText=driver.findElement(By.className("h3"));
        System.out.println(multipleButtonsText.getText());

    }
}
