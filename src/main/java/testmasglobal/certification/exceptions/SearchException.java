package testmasglobal.certification.exceptions;

public class SearchException extends AssertionError{


    public SearchException(String message, Throwable cause) {
            super(message, cause);
        }

        public static String getNotMatchMessage(){
            return ("the searching not get values");
        }
}
