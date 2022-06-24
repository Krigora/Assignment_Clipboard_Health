package com.amazon.step_def;

import com.amazon.pages.HomePage;
import com.amazon.pages.TelevisionsPage;
import com.amazon.utilites.BrowserUtils;
import com.amazon.utilites.ConfigurationReader;
import com.amazon.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Home_StepDef {
    HomePage homePage = new HomePage();
    BrowserUtils browserUtils = new BrowserUtils();
    TelevisionsPage televisionsPage = new TelevisionsPage();
  //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the HOME page")
    public void i_am_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
    }
    @When("I click on All button")
    public void i_click_on_all_button() {
       homePage.allLink.click();

    }
    @When("I click on TV link")
    public void i_click_on_tv_link() {
        BrowserUtils.wait(2);
  //  browserUtils.scrollToElement(homePage.TVAplLink);
    homePage.TVAplLink.click();
        homePage.TVAplLink.click();

    }
    @When("I click on Televisions link")
    public void i_click_on_televisions_link() {
homePage.Televisions.click();
    }
    @When("I put flag Samsung")
    public void i_put_flag_samsung() {
        televisionsPage.Sumsung.click();

    }


}
