package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class VehiclesStepDefinitions {
    Pages pages = new Pages();


    @Then("user verifies that default page number is {int}")
    public void user_verifies_that_default_page_number_is(Integer expected) {
        Assert.assertEquals(expected, pages.vehiclesPage().getPageNumber());

    }

    @Then("user clicks any car from list")
    public void user_clicks_any_car_from_list() throws InterruptedException {
        Thread.sleep(4000);
        pages.vehiclesPage().vehicle1.click();

    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertEquals(string, pages.vehiclesPage().getPageH5SubTitle());

    }

}
