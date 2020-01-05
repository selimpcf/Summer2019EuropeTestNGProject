package com.cybertek.pages;

import com.cybertek.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage {

    @FindBy(css="h1.user-name")
    public WebElement fullname;

    @FindBy(xpath = "//a[@class='email']")
    public WebElement email;
    @FindBy (xpath = "//a[@class='phone']")
    public WebElement phone;



}
