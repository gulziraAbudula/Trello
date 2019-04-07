package pageObjectClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(xpath = "11111")
    WebElement bannerText;

    public boolean isLandingPageOpen() {
        return bannerText.isDisplayed();
    }
}
