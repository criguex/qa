package testmasglobal.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static testmasglobal.certification.userinterfaces.PatrickPage.IMG_PAGE_PATRICK;



public class PatrickPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor)
    {
        return IMG_PAGE_PATRICK.resolveFor(actor).isVisible();
    }
    public static PatrickPage banner() {
        return new PatrickPage();
    }
}
