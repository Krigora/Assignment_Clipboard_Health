package com.amazon.step_def;

import com.amazon.pages.SecondItem;
import com.amazon.utilites.BrowserUtils;
import com.amazon.utilites.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondIteam_def {

    SecondItem secondItem = new SecondItem();
    BrowserUtils browserUtils = new BrowserUtils();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("should be display {string}")

    public void should_be_display(String string) {
browserUtils.switchToWindow(secondItem);


            String expected = "About this item";
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.urlContains(expected));

            String actual = Driver.getDriver().getCurrentUrl();
            System.out.println("actual = " + actual);


            Assert.assertTrue(actual.contains(expected));
            Driver.closeDriver();
        }


    }