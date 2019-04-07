package pageObjectClass;

import base.PageBase;
import org.openqa.selenium.WebDriver;

public class Application extends PageBase {

    public Application(WebDriver incomingDriver) {
        super(incomingDriver);
    }

    public void openApplication() {
        getDriver().get("http://www.trello.com");
    }
}
