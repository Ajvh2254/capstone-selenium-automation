package capstonefactory.base;

import capstonefactory.utilities.WaiterUtilities;
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
    protected static WaiterUtilities waiterUtilities;
    protected static Alerts alerts;
    protected static IsDisplayed isDisplayed;
    protected static DragAndDrop dragAndDrop;
    protected static WindowUtil windowUtil;

    static {
        click = new Click();
        uiHelper = new UiHelper();
        isEnabled = new IsEnabled();
        elementAttributes = new ElementAttributes();
        scroll = new Scroll();
        waiterUtilities = new WaiterUtilities();
        alerts = new Alerts();
        isDisplayed = new IsDisplayed();
        dragAndDrop = new DragAndDrop();
        windowUtil = new WindowUtil();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

}
