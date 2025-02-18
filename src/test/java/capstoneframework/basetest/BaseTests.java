package capstoneframework.basetest;

import capstonefactory.base.BasePage;
import capstonefactory.driver.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTests extends WebDriverFactory {

    @BeforeMethod
    public void launchApplication() throws IOException {
        driver = initializeDriver();
        BasePage.setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }

}
