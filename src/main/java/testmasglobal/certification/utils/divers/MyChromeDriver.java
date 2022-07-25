package testmasglobal.certification.utils.divers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyChromeDriver {

    private static WebDriver chromeDriver;

    public static MyChromeDriver chromeHisBrowserWeb() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        chromeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }


    public WebDriver onTheUrl(String url){
        chromeDriver.get(url);
        return chromeDriver;
    }

}
