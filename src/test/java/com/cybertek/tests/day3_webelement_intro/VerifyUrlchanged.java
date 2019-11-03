package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlchanged {

    /**
     *
     * Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * Links to an external site.
     *
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */


    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email

        WebElement emailInput=driver.findElement(By.name("email"));

        //sendKeys()  >> send keyboard actions to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        // click()  >>  clicking web element
        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();
        String ExpectedUrl="http://practice.cybertekschool.com/email_sent";

        if(ExpectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();









    }




}
