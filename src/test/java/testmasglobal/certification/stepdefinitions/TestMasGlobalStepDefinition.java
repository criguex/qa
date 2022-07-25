package testmasglobal.certification.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testmasglobal.certification.exceptions.SearchException;
import testmasglobal.certification.questions.Result;
import testmasglobal.certification.questions.ResultsPage;
import testmasglobal.certification.tasks.GoTo;
import testmasglobal.certification.utils.divers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static testmasglobal.certification.questions.PatrickPage.banner;
import static testmasglobal.certification.tasks.ClickOn.click;
import static testmasglobal.certification.tasks.SearchOn.search;
import static testmasglobal.certification.utils.constant.ConstantManage.ACTOR;
import static testmasglobal.certification.utils.constant.ConstantManage.URL;

public class TestMasGlobalStepDefinition {

    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I’m on the homepage$")
    public void iMOnTheHomepage()  {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }

    @When("^I type (.*) into the search field$")
    public void iTypeIntoTheSearchField(String search) {
        theActorCalled(ACTOR).wasAbleTo(GoTo.search(search));
    }

    @When("^I click the Google Search button$")
    public void iClickTheGoogleSearchButton() {
        theActorCalled(ACTOR).wasAbleTo(click());
    }

    @Then("^I go to the search results page$")
    public void iGoToTheSearchResultsPage() {
        theActorInTheSpotlight().should(seeThat(ResultsPage.results(), equalTo(true)).orComplainWith(SearchException.class,SearchException.getNotMatchMessage()));
    }

    @Then("^the first result is (.*) - (.*)$")
    public void theFirstResultIs(String nameBook, String nameAuthor)  {
        theActorInTheSpotlight().should(seeThat(Result.ofSearch(nameBook,nameAuthor), equalTo(true)).orComplainWith(SearchException.class,SearchException.getNotMatchMessage()));
    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() {
        theActorCalled(ACTOR).wasAbleTo(click());
    }

    @Then("^I go to the The Books - Patrick Rothfuss page$")
    public void iGoToThePatrickRothfussTheBooksPage()  {
        theActorInTheSpotlight().should(seeThat(banner(), equalTo(true)).orComplainWith(SearchException.class,SearchException.getNotMatchMessage()));
    }

    @When("^I click on the first suggestion in the list$")
    public void iClickOnTheFirstSuggestionInTheList()  {
        theActorInTheSpotlight().attemptsTo(search());
    }

}