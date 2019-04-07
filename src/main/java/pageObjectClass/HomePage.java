package pageObjectClass;

import base.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

    @FindBy(xpath = "//a[text() = 'Log In']")
    WebElement logInBtn;

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    public void clickOnLoginButton() {
        logInBtn.click();
    }
}
