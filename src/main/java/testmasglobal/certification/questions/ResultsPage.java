package testmasglobal.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static testmasglobal.certification.userinterfaces.ResultsPageGoogle.LINKS_RESULTS;

public class ResultsPage implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LINKS_RESULTS.resolveFor(actor).isVisible();
    }
    public static ResultsPage results() {
        return new ResultsPage();
    }
}
