package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement=driver.findElement(By.id("dropdownMenuLink"));
        //open the dropdown
        dropdownElement.click();

        List<WebElement> ListofLinks =driver.findElements(By.className("dropdown-item"));

        //size of the list
        System.out.println("Number of Links "+ListofLinks.size());

        //elements of the list
        for(WebElement list:ListofLinks){
            System.out.println(list.getText());
        }

        //text of first element in the list
        System.out.println(ListofLinks.get(0).getText());

        //locate the element and click it
        // driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        ListofLinks.get(3).click();


    }



}
