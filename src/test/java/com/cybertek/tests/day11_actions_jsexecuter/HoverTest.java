package com.cybertek.tests.day11_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    //hover over each image in the website
    //verify each name: user text is displayed
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
            for (int i = 1; i <4 ; i++) {

                //creating dynamic xpath using i
                String imageXpath = "(//img)["+i+"]";
                System.out.println("after combining string"+imageXpath);
                //passing xpath to weblement
                WebElement img = driver.findElement(By.xpath(imageXpath));

                //creating actions object
                Actions actions = new Actions(driver);
                Thread.sleep(1000);
                //hovering over on the image
                actions.moveToElement(img).perform();

                //creating dynamic xpath for the text
                String textXpath = "//h5[.='name: user"+i+"']";
                System.out.println("textXpath = " + textXpath);

                //passing xpath to webelement
                WebElement text = driver.findElement(By.xpath(textXpath));
                //verifying text is displayed
                Assert.assertTrue(text.isDisplayed());
            }

    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions action = new Actions(driver);

        String expectedText;
        List<WebElement> images=driver.findElements(By.xpath("//img"));
        List<WebElement> users=driver.findElements(By.xpath("//div/h5"));
        for(int i=0;i< users.size();i++) {
            expectedText = "name: user" + (i + 1);
            action.moveToElement(images.get(i)).perform();
            Assert.assertEquals(users.get(i).getText(), expectedText);
            Thread.sleep(1000);
        }

    }


    @Test
    public void Youtube(){

        driver.get("https://www.youtube.com/");

        WebElement search=driver.findElement(By.id("search"));

        search.sendKeys("Ferdi Tayfur olsan icmezmiydin");

        WebElement clickSearch=driver.findElement(By.id("search-icon-legacy"));
        clickSearch.click();



    }







}

