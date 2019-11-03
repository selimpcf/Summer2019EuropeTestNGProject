package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {


    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * Links to an external site.
     *
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'

     */
    public static void main(String[] args) {

    WebDriver driver= WebDriverFactory.getDriver("chrome");

    driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox=driver.findElement(By.name("email"));

        String expectedEmail="test@gmail.com";

        emailInputbox.sendKeys(expectedEmail);

        // verify that email is displayed in the input box
        // getting text from webelements
        // getText() >> get text from web element %99
        // getAttribute() >> get value of attributes

        String actualEmail=emailInputbox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else{
            System.out.println("FAIL");
            System.out.println("ExpectedEmail= "+expectedEmail);
            System.out.println("ActualEmail= "+actualEmail);
        }

        WebElement RetriveButton=driver.findElement(By.id("form_submit"));
        RetriveButton.click();


        String expectedMEssage="Your e-mail's been sent!";

        WebElement messageElement=driver.findElement(By.name("confirmation_message"));

        String ActualMessage=messageElement.getText();

        if(expectedMEssage.equals(ActualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ExpectedMessage= "+expectedMEssage);
            System.out.println("ActualResult= "+ActualMessage);
        }

        driver.quit();



    }

}
