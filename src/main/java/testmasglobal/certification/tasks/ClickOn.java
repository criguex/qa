package testmasglobal.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import testmasglobal.certification.userinterfaces.HomePageGoogle;
import testmasglobal.certification.userinterfaces.ResultsPageGoogle;

public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(HomePageGoogle.BTN_SEARCH.resolveFor(actor).isVisible()).andIfSo(
                Click.on(HomePageGoogle.BTN_SEARCH)).otherwise(Scroll.to(ResultsPageGoogle.LINK_PAGE_RESULTS).andAlignToBottom()
                ,Click.on(ResultsPageGoogle.LINK_PAGE_RESULTS)));
    }

    public static ClickOn click (){
        return Tasks.instrumented(ClickOn.class);
    }



}
