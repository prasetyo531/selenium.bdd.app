package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DiscoverSteps extends DriverFactory {

    @Given("^User clicks discover from homescreen menu$")
    public void user_clicks_discover_from_homescreen_menu() throws Throwable {

        homeScreen.clickDiscoverHomeMenu();
    }

    @When("^User scroll post of discover$")
    public void user_scroll_post_of_discover() throws Throwable {

        discoverScreen.scrollOnDiscover();
    }

    @Then("^User back to homescreen$")
    public void user_back_to_homescreen() throws Throwable {

        homeScreen.clickHomeMenu();
    }

    @When("^User clicks post on discover$")
    public void user_clicks_post_on_discover() throws Throwable {

        discoverScreen.clickFirstPost();
    }

    @And("^User clicks button follow$")
    public void user_clicks_button_follow() throws Throwable {

        discoverScreen.clickFollow();
    }

    @And("^User back to discover$")
    public void user_back_to_discover() throws Throwable {

        discoverScreen.clickBack();
    }

    @When("^User clicks post again and button follow is dissapear$")
    public void user_clicks_post_again_and_button_follow_is_dissapear() throws Throwable {

        discoverScreen.clickFirstPost();
        discoverScreen.checkFollowShouldDissapear();
    }

    @When("^User clicks trending hashtag$")
    public void user_clicks_trending_hashtag() throws Throwable {

        discoverScreen.clickFirstHashtag();
    }

    @Then("^User scroll post grid on hashtag detail$")
    public void user_scroll_post_grid_on_hashtag_detail() throws Throwable {

        discoverScreen.scrollOnHashtag();
    }

    @And("^User clicks random post on hashtag detail$")
    public void user_clicks_random_post_on_hashtag_detail() throws Throwable {

        discoverScreen.clickRandomPost();
    }

    @Then("^User scroll post list on hashtag detail$")
    public void user_scroll_post_list_on_hashtag_detail() throws Throwable {

        discoverScreen.scrollPostList();
    }

    @And("^User back to post grid screen$")
    public void user_back_to_post_grid_screen() throws Throwable {

        discoverScreen.clickBack();
    }

}
