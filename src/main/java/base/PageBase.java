package base;

import org.openqa.selenium.WebDriver;

public class PageBase {

    private WebDriver driver;

    public PageBase(WebDriver inputDriver) {
        this.driver = inputDriver;
    }


    protected WebDriver getDriver() {
        return driver;
    }


    public void wait(int second) {
        try {
            Thread.sleep(second, 10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
