package com.amazon.step_def;

import com.amazon.pages.TelevisionsPage;
import com.amazon.utilites.BrowserUtils;
import com.amazon.utilites.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Television_def {

TelevisionsPage televisionsPage = new TelevisionsPage();
BrowserUtils browserUtils = new BrowserUtils();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @When("i click on SortBy dropDown button")
    public void i_click_on_sort_by_drop_down_button() {
televisionsPage.SortBy.click();
    }

    @When("I click on HightToLow button")
    public void i_click_on_hight_to_low_button() {

televisionsPage.HighToLow.click();
    }

    @When("I click to second HightPrise iteam")
    public void i_click_to_second_hight_prise_iteam() {
televisionsPage.secondHighPricedItem.click();
    }


}