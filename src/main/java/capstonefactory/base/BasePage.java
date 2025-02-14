package capstonefactory.base;

import capstonefactory.utilities.utils.UiHelper;
import capstonefactory.utilities.utils.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static WebDriver driver;
    protected static Click click;
    protected static UiHelper uiHelper;
    protected static IsEnabled isEnabled;
    protected static ElementAttributes elementAttributes;
    protected static Scroll scroll;

    static {
        click = new Click();
        uiHelper = new UiHelper();
        isEnabled = new IsEnabled();
        elementAttributes = new ElementAttributes();
        scroll = new Scroll();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

}
