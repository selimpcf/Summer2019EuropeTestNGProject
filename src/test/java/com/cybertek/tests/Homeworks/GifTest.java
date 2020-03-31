package com.cybertek.tests.Homeworks;
import com.cybertek.utilities.WebDriverFactory;
import com.github.bogdanlivadariu.gifwebdriver.GifScreenshotWorker;
import com.github.bogdanlivadariu.gifwebdriver.GifWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class GifTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void ExitMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }

    @Test
    public void test1() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement registrationForm = driver.findElement(By.xpath("//a[text()='Registration Form']"));
        registrationForm.click();
        WebElement DateOfBirth = driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        DateOfBirth.sendKeys("wrong_dob");
        WebElement ErrorMessage = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));

        Assert.assertEquals(ErrorMessage.getText(), "The date of birth is not valid");


    }

    @Test
    public void sampleGifDriver() throws InterruptedException {
        // initialize your desired driver
        driver=new GifWebDriver(new ChromeDriver());
        //WebDriver driver = new GifWebDriver(new FirefoxDriver());
        //WebDriver driver = new GifWebDriver(new RemoteWebDriver());
        // you can use either driver webdriver/gifdriver instance
        GifWebDriver gifDriver=(GifWebDriver)driver;
        // screenshots will be taken implicitly on click events
      //  driver.findElement(By.id("someIDon a page")).click();

        driver.get("https://qa3.vytrack.com");

        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager101");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        Thread.sleep(5000);

        Assert.assertEquals(driver.getTitle(), "Dashboard");

        WebElement shortcut = driver.findElement(By.xpath("//a[@title='Shortcuts']"));
        shortcut.click();

        WebElement fullList = driver.findElement(By.xpath("//a[contains(.,'See full list')]"));
        fullList.click();

        Thread.sleep(3000);
        WebElement opportunities = driver.findElement(By.xpath("//a[text()='Opportunities']"));
        opportunities.click();
        Thread.sleep(10000);

        String pageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();

        Assert.assertEquals(pageName, "Open Opportunities");

        WebElement shortcut1 = driver.findElement(By.xpath("//a[@title='Shortcuts']"));
        shortcut.click();

        WebElement fullList1 = driver.findElement(By.xpath("//a[contains(.,'See full list')]"));
        fullList.click();

        Thread.sleep(2000);
        WebElement vehicleServiceLogs = driver.findElement(By.xpath("(//a[.='Vehicle Services Logs'])[2]"));
        vehicleServiceLogs.click();

        Thread.sleep(3000);
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message']"));

        Assert.assertEquals(errorMessage.getText(), "You do not have permission to perform this action.");
        Assert.assertEquals(driver.getTitle(), "Shortcut Actions List");
        // if you want to control when gifs are generated you can do it through the API
        File gifFile=gifDriver.getGifScreenshotWorker().createGif();
        //of course you can create screenshots explicitly
        gifDriver.getGifScreenshotWorker().takeScreenshot();
        // on quit the driver will generate the gifs
        driver.quit();
        // if you don't know where the screenshots are taken or where the gifs are created
        String rootFolder=gifDriver.getGifScreenshotWorker().getRootDir();

        System.out.println(rootFolder);

        String projectPath = System.getProperty("user.dir");
        String path = projectPath +"/gifScreenshotWorker/generatedGifs/screenshot.gif";

        // more options about where the gifs are created can be accomplished by using these methods
/*
        GifScreenshotWorker gifWorker=gifDriver.getGifScreenshotWorker();
        gifWorker.setTimeBetweenFramesInMilliseconds(1000);
        gifWorker.setRootDir(path);
        gifWorker.setLoopContinuously(true);
        // these properties can be set during initialization as well
        GifScreenshotWorker myPreciousWorker=new GifScreenshotWorker(
                new ChromeDriver(),
                path,
                "gifScreenshotWorker",
                "generatedGifs",
                true
        );
        WebDriver myPreciousDriver=new GifWebDriver(new ChromeDriver(),myPreciousWorker);
        // and from here it's pretty much all the same

*/

    }


}