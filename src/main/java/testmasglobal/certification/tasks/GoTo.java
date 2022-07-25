package testmasglobal.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import testmasglobal.certification.userinterfaces.HomePageGoogle;

public class GoTo implements Task {

    private String  search;

    public GoTo(String search) {
        this.search = search;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(search).into(HomePageGoogle.TXT_SEARCH));

    }
    public static GoTo search (String search){
        return Tasks.instrumented(GoTo.class,search);
    }

}
