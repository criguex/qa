package testmasglobal.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageGoogle {
    public static final Target TXT_SEARCH=Target.the("textbox search").located(By.name("q"));
    public static final Target BTN_SEARCH=Target.the("Button search").located(By.name("btnK"));
    public static final Target LST_SEARCH=Target.the("item of the list search").locatedBy("//ul[@role='listbox']//li[1]");
    public static final Target LIST =Target.the("list search").locatedBy("//ul[@role='listbox']");

    private HomePageGoogle() {
    }
}
