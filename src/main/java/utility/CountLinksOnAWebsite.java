package utility;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountLinksOnAWebsite {

    public WebDriver driver;

    public void getTheSizeOfTheLinks() {
        List <WebElement> linkSize = driver.findElements(By.tagName("a"));
        //linkSize.size();

        for(int i=0; i<=linkSize.size(); i++) {
            linkSize.get(i).getText();
        }

    }

    public CountLinksOnAWebsite(WebDriver driver,String url){
        this.driver = driver;
    }
}
