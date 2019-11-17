package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButton(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement redRadioButton=driver.findElement(By.id("red"));

        System.out.println("Is blue selected: "+ blueRadioButton.isSelected());
        System.out.println("Is red selected: "+ redRadioButton.isSelected());

        Assert.assertTrue(blueRadioButton.isSelected(),"verify that Blue radio button is selected");

        Assert.assertFalse(redRadioButton.isSelected(),"verify that Red radio button is  not selected");

        //how to select radio button?
        System.out.println("clicking red radio button");
        redRadioButton.click();

        System.out.println("Is blue selected: "+ blueRadioButton.isSelected());
        System.out.println("Is red selected: "+ redRadioButton.isSelected());

        //verify blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"blue button is not selected");
        //verify re is selected
        Assert.assertTrue(redRadioButton.isSelected(),"red button is selected");

    }


}
