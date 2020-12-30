package packt.selenium.chap3_9.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/19/2015.
 */
public class GoogleSearchPage {
    private WebDriver driver;
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getTitle());
        if (!driver.getTitle().equals("Mastering Selenium Testing Tools - Google Search")){
            throw new WrongPageException("Incorrect page for Google Search page");
        }
    }
    public String getNumberOfResults(){
        String numberOfResults = driver.findElement(By.id("resultStats")).getText();
        System.out.println(numberOfResults);
        return  numberOfResults;
    }
}