package com.amazon.pages;

import com.amazon.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "nav-hamburger-menu")
    public WebElement allLink;

    @FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
    public WebElement TVAplLink;

@FindBy(xpath = "//a[contains(text(),'Televisions')]")
    public WebElement Televisions;
}
