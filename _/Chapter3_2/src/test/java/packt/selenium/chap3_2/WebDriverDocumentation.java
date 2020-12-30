package packt.selenium.chap3_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 5/14/2015.
 */
public class WebDriverDocumentation {
    private WebDriver driver;
    private String baseUrl;

    public WebDriverDocumentation(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverDocumentation navigateToWebDriverDocumentation(){
        return this;
    }
}