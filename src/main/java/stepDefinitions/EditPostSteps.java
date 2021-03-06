package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class EditPostSteps extends DriverFactory {

    @When("^User clicks edit post from feed menu$")
    public void user_clicks_edit_post_from_feed_menu() throws Throwable {

        homeScreen.clickFeedMenu();
        feedScreen.clickReadMorePost();
        feedScreen.clickEditPost();
    }

    @When("^User clicks edit post from profile menu$")
    public void user_clicks_edit_post_from_profile_menu() throws Throwable {

        homeScreen.clickProfileHomeMenu();
        profileScreen.clickFirstPostProfile();
        feedScreen.checkIsonOwnFeeds();
        feedScreen.clickReadMorePost();
        feedScreen.clickEditPost();
    }

    @Then("^User enters caption of post contains hashtag \"([^\"]*)\"$")
    public void user_enters_caption_of_post_contains_hashtag_something(String hashtag) {

        addPostScreen.fillCaptionWithHashtag(hashtag);
    }

    @Then("^User takeout tagged product$")
    public void user_takeout_tagged_product() throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.waitProductList();

        addPostScreen.removeTaggedProduct();

        addPostScreen.checkNumRevShouldNull();
    }

    @And("^User remove multiple product from tag$")
    public void user_remove_multiple_product_from_tag() throws Throwable {

        addPostScreen.clickTagProduct();
        addPostScreen.waitProductList();

        addPostScreen.removeTaggedProduct();
        addPostScreen.checkNumProd();
        addPostScreen.checkNumRev();
    }

    @When("^User clicks submit edit post$")
    public void user_clicks_submit_edit_post() throws Throwable {

        addPostScreen.clickSubmitPost();
    }

    @When("^User clicks submit edit post without tag$")
    public void user_clicks_submit_edit_post_without_tag() throws Throwable {

        addPostScreen.clickSubmitPost();
        addPostScreen.clickSkipTag();
    }


    @Then("^User directed to feed and see post updated with \"([^\"]*)\"$")
    public void user_directed_to_feed_and_see_post_updated_with_something(String hashtag) throws Throwable {

        feedScreen.checkIsOnFeedAfterPost();
        feedScreen.checkCaptionEditedWithHashtag(hashtag);
    }

    @Then("^User directed to own user feed and see post updated with \"([^\"]*)\"$")
    public void user_directed_to_own_user_feed_and_see_post_updated_with_something(String hashtag) throws Throwable {

        feedScreen.checkIsonOwnFeeds();
        feedScreen.checkCaptionEditedWithHashtag(hashtag);
    }

    @Then("^User directed to feed and see post updated without tagged product$")
    public void user_directed_to_feed_and_see_post_updated_without_tagged_product() throws Throwable {

        feedScreen.checkIsOnFeedAfterPost();
        feedScreen.checkNoTaggedProductLeftFeed();
    }

    @Then("^User directed to own user feed and see post updated without tagged product$")
    public void user_directed_to_own_user_feed_and_see_post_updated_without_tagged_product() throws Throwable {

        feedScreen.checkIsonOwnFeeds();
        feedScreen.checkNoTaggedProductLeftOwnFeed();
    }

    @Then("^User will see confirm modal to cancel edit post$")
    public void user_will_see_confirm_modal_to_cancel_edit_post() throws Throwable {

        addPostScreen.getTextModalEditPost();
        addPostScreen.yesCancelPost();
    }

    @Then("^User will direct to feed$")
    public void user_will_direct_to_feed() throws Throwable {

        feedScreen.checkIsOnFeedAfterPost();
    }

    @Then("^User will see button to add post appear$")
    public void user_will_see_button_to_add_post_appear() {

        profileScreen.isButtonAddPostReviewAppear();
    }

}
