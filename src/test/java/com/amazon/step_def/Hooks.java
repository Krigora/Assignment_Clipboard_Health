package com.amazon.step_def;

import com.amazon.utilites.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


        @Before()
        public void setUpScenario() {
            System.out.println("BEFORE - setUp method is running before the scenario ");
        }

        @After
        public void tearDownScenario(Scenario scenario) {

            if(scenario.isFailed()) {
                byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(image, "image/png", scenario.getName());
            }

            System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
            Driver.closeDriver();
        }

}
