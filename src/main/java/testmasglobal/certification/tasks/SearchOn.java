package testmasglobal.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static testmasglobal.certification.userinterfaces.HomePageGoogle.LIST;
import static testmasglobal.certification.userinterfaces.HomePageGoogle.LST_SEARCH;


public class SearchOn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(LIST.resolveFor(actor).isVisible()).andIfSo(
                Click.on(LST_SEARCH)));
    }
    public static SearchOn search(){
        return Tasks.instrumented(SearchOn.class);
    }

}

