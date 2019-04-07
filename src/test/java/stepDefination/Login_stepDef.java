package stepDefination;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectClass.Application;
import pageObjectClass.HomePage;
import pageObjectClass.LandingPage;
import pageObjectClass.LoginPage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Login_stepDef {

    private Application application = new Application(TestBase.getDriver());
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();
    private LandingPage landingPage = new LandingPage();

    @Given("^User goes to trello\\.com$")
    public void user_goes_to_trello_com() {
        application.openApplication();
    }

    @When("^User enters valid username and password$")
    public void user_enters_valid_username_and_password() {
        homePage.clickOnLoginButton();
        loginPage.signin("Gulzira", "hyhhewd");

    }

    @Then("^user should log in successfully$")
    public void user_should_log_in_successfully() {
     //   assertThat(landingPage.isLandingPageOpen()).isTrue();
    }


}
