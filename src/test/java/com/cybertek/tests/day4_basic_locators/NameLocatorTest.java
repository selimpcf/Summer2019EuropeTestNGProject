package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");


        WebElement fullnameInput=driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Isa Arslan");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("isa.arsln@hotmail.com");

        WebElement signupButton=driver.findElement(By.name("wooden_spoon"));
        signupButton.click();

        WebElement message=driver.findElement(By.name("signup_message"));

        String ExpectedMessage="Thank you for signing up. Click the button below to return to the home page.";
                if(ExpectedMessage.equals(message.getText())){
                    System.out.println("PASS");
                }



    }
}
