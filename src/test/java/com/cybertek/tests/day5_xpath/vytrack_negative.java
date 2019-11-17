package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class vytrack_negative {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/user/login");

        for(int i=0; i<1;i++){

            Faker fake=new Faker();
            String fakeName=fake.name().username();

            WebElement username=driver.findElement(By.id("prependedInput"));
            username.sendKeys(fakeName);

            String fakePass=fake.funnyName().name();

            WebElement password=driver.findElement(By.id("prependedInput2"));
            password.sendKeys(fakePass);

            WebElement clickButton=driver.findElement(By.id("_submit"));
            clickButton.click();

            WebElement errorMessage=driver.findElement(By.xpath("//div[@class='alert alert-error']"));
            if(errorMessage.getText().equals("Invalid user name or password.")){
                System.out.println("Error Message");
            }else{
                System.out.println("Logged in");
            }




        }


    }

}
