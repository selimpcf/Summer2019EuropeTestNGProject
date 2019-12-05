package com.cybertek.tests.Homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework2 {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod(){
     driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void ExitMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }

    @Test
    public void test1(){
    driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement registrationForm=driver.findElement(By.xpath("//a[text()='Registration Form']"));
        registrationForm.click();
        WebElement DateOfBirth=driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        DateOfBirth.sendKeys("wrong_dob");
        WebElement ErrorMessage=driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));

        Assert.assertEquals(ErrorMessage.getText(),"The date of birth is not valid");


    }



}
