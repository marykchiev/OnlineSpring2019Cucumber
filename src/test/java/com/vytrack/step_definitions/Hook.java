package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {





    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("Before");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void teardownForStoreManager(Scenario scenario){
if(scenario.isFailed())
{
    TakesScreenshot takesScreenshot= (TakesScreenshot)Driver.getDriver();
    //takesScreenshot.getScreenshotAs(OutputType.BYTES);
    byte[] image=takesScreenshot.getScreenshotAs(OutputType.BYTES);
    scenario.embed(image, "image/png");
}
Driver.closeDriver();
        System.out.println("After");
    }







//    @Before(value="@storemanager", order=1)
//    public void setupForStoreManager(){
//        System.out.println("Before for store manager");
//
//    }
//
//    @After(order=1)
//    public void teardown(){
//        System.out.println("After");
//
//    }
}
