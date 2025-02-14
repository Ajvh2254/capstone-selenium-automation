package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class IsEnabled extends BasePage {

    public IsEnabled() {
        super();
    }

    public void isEnabled(By locator) {
        System.out.println("Checking if element is enabled");
        boolean isElementEnabled = driver.findElement(locator).isEnabled();
        Assert.assertTrue(isElementEnabled, "Element is disabled");
    }

    public void isDisabled(By locator) {
        System.out.println("Checking if element is disabled");
        boolean isElementDisabled = driver.findElement(locator).isEnabled();
        Assert.assertFalse(isElementDisabled, "Element is enabled");
    }

}
