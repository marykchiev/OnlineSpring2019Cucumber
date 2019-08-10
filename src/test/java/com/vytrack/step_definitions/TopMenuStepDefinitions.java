package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;

public class TopMenuStepDefinitions {
    Pages pages= new Pages();

    @Then("user clicks {string} in top menu and {string} from drop down menu")
    public void user_clicks_in_top_menu_and_from_drop_down_menu(String tab, String module) {
        pages.dashboardPage().navigateToModule(tab, module);
    }
}
