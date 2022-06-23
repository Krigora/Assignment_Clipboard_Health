package com.amazon.pages;

import com.amazon.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelevisionsPage extends PageBase{

    public TelevisionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@dir='auto'][contains(text(),'Samsung')]")
    public WebElement Sumsung;

    @FindBy(xpath = "//span[@class='a-dropdown-label']")
    public WebElement SortBy;


    @FindBy(xpath = "//a[contains(text(),'Price: High to Low')]")
    public WebElement HighToLow;



@FindBy(xpath ="//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']")
    public WebElement secondHighPricedItem;
}
