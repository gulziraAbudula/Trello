package base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;

    @Before
    public void beforeTest() {
        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers_exe\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp() throws InterruptedException {
        Thread.sleep(2000);
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
