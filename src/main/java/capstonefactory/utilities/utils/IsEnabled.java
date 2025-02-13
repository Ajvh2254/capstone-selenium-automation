package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class IsEnabled extends BasePage {

    public IsEnabled() {
        super();
    }

    public void isEnabled(By locator) {
        boolean isElementEnabled = driver.findElement(locator).isEnabled();
        Assert.assertTrue(isElementEnabled, "Element is disabled");
    }

}
