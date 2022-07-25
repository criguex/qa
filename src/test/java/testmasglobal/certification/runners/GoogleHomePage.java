package testmasglobal.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (

        features="src/test/resources/features/google/Google_homepage_search.feature",
        glue="testmasglobal.certification.stepdefinitions",
        snippets= SnippetType.CAMELCASE
)
public class    GoogleHomePage {
}
