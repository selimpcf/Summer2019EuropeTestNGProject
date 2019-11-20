package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.Locate the dropdown element with unique locator
        WebElement dropdownElement=driver.findElement(By.id("state"));
        //create Select object by passing the element as a constructor
        Select stateList=new Select(dropdownElement);
        //getOptions >> returns all the available optins from dropdown
        List<WebElement> options=stateList.getOptions();
        System.out.println(options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        //verify that first option is "Select a State"

        Assert.assertEquals(stateList.getFirstSelectedOption().getText(),"Select a State","verify first selection is select a state");

        //HOW TO SELECT OPTIONS FROM THE DROPDOWN
        //1-Using visible text
        //selectByVisibleText("text") >> selecting based on the visible text

        Thread.sleep(2000);
        stateList.selectByVisibleText("Texas");
        String actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Texas");


        //2.USING INDEX NUMBER
        //total options >>52
        stateList.selectByIndex(51);
        System.out.println(stateList.getFirstSelectedOption().getText());
        Assert.assertEquals(stateList.getFirstSelectedOption().getText(),"Wyoming");

        //3.USING VALUE
        Thread.sleep(500);
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());


    }






    }



