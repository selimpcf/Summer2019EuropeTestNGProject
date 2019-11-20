package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton=driver.findElement(By.id("blue"));
        System.out.println(radioButton.getAttribute("name"));  // get the value of name attribute

        System.out.println(radioButton.getAttribute("id"));  // get the value of id attribute

        System.out.println(radioButton.getAttribute("type"));  // get the value of type attribute

        //trying to get an attribute does not exist
        System.out.println(radioButton.getAttribute("href")); //returns null

        //attribute without value(checked)
        //checked attribute value is boolean if it is checked it will be true
        System.out.println(radioButton.getAttribute("checked"));  //return true

        // "outerHTML" returns full html of that element
        System.out.println(radioButton.getAttribute("outerHTML"));



        WebElement radioText=driver.findElement(By.xpath("(//label)[1]"));
        System.out.println(radioText.getAttribute("innerHTML"));

    }



}

