package capstonefactory.base;

import capstonefactory.utilities.UiHelper;
import capstonefactory.utilities.utils.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static WebDriver driver;
    protected static Click click;
    protected static UiHelper uiHelper;

    static {
        click = new Click();
        uiHelper = new UiHelper();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

}
