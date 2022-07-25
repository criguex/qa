package testmasglobal.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static testmasglobal.certification.userinterfaces.ResultsPageGoogle.LINK_FINAL_RESULTS;

public class Result implements Question <Boolean> {
    private String nameBook;
    private String  nameAuthor;

    public Result(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LINK_FINAL_RESULTS.of(nameBook).resolveFor(actor).isPresent() && LINK_FINAL_RESULTS.of(nameAuthor).resolveFor(actor).isPresent() ;
    }
    public static Result ofSearch(String nameBook, String nameAuthor) {
        return new Result(nameBook,nameAuthor);
    }
}
