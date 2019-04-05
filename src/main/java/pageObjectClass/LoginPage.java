package pageObjectClass;

import base.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {


    // =======property ==========
    @FindBy(how = How.XPATH, using = "h1")
    private WebElement bannerText;

    @FindBy(how = How.ID, using = "user")
    private WebElement usernameInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "login")
    private WebElement loginButton;

    // ==========Constructor========
    public LoginPage(WebDriver injectedDriver) {
        super(injectedDriver);
        getDriver().get("https://trello.com/login?returnUrl=%2F");
        PageFactory.initElements(getDriver(), this);
    }

    // =========Behavior============
    public void signin(String username, String pass) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(pass);
        loginButton.click();

    }

    public String getCurretBannerText() {
        String textContent = bannerText.getText();
        return textContent;
    }
}
