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

        discoverScreen.clickRandomPost();
        discoverScreen.checkFollowShouldDissapear();
    }

    @When("^User clicks trending hashtag$")
    public void user_clicks_trending_hashtag() throws Throwable {

        discoverScreen.clickFirstHashtag();
    }

    @When("^User clicks search hashtag and input \"([^\"]*)\"$")
    public void user_clicks_search_hashtag_and_input_something(String hashtag) throws Throwable {

        discoverScreen.inputKeywordHashtag(hashtag);
    }

    @Then("^User scroll post grid on hashtag detail$")
    public void user_scroll_post_grid_on_hashtag_detail() throws Throwable {

        discoverScreen.scrollOnHashtag();
    }

    @And("^User clicks random post on hashtag detail$")
    public void user_clicks_random_post_on_hashtag_detail() throws Throwable {

        discoverScreen.clickRandomPost();
    }

    @When("^User clicks most top hashtag of hashtag result$")
    public void user_clicks_most_top_hashtag_of_hashtag_result() throws Throwable {

        discoverScreen.clickFirstHashtagAfterSearch();
    }

    @Then("^User scroll post list on hashtag detail$")
    public void user_scroll_post_list_on_hashtag_detail() throws Throwable {

        discoverScreen.scrollPostList();
    }

    @And("^User back to post grid screen$")
    public void user_back_to_post_grid_screen() throws Throwable {

        discoverScreen.clickBack();
    }

    @Then("^User back to search hashtag screen$")
    public void user_back_to_search_hashtag_screen() throws Throwable {

        discoverScreen.backToSearchHashtagScreen();
    }

    @When("^User clicks search hashtag and click trending hashtag$")
    public void user_clicks_search_hashtag_and_click_trending_hashtag() throws Throwable {

        discoverScreen.clickSearchIcon();
        discoverScreen.clickFirstHashtagOnSearch();
    }

    @Then("^User will directed to hashtag detail$")
    public void user_will_directed_to_hashtag_detail() throws Throwable {

        discoverScreen.checkHashtagDetail();
    }

    @Then("^User scroll hashtag list on search result hashtag$")
    public void user_scroll_hashtag_list_on_search_result_hashtag() throws Throwable {

        discoverScreen.scrollHashtagResult();
    }

}
