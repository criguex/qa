package testmasglobal.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsPageGoogle {
    public static final Target LINKS_RESULTS=Target.the("links results").locatedBy("//h3");
    public static final Target LINK_FINAL_RESULTS=Target.the("final link result {0}").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target LINK_PAGE_RESULTS=Target.the("final link result {0}").locatedBy("//h3[contains(text(),'The Books - Patrick Rothfuss')]");

    private ResultsPageGoogle() {
    }
}
