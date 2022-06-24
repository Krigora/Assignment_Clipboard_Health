package com.amazon.pages;

import com.amazon.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondItem extends PageBase {

    public SecondItem() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//h1[contains(text(),'About this item ')]")
    public WebElement AboutItem;




}
