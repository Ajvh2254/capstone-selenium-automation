package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ElementAttributes extends BasePage {

    public ElementAttributes() {
        super();
    }

    public void getElementAttributeDOM(By locator, String attribute) {
        WebElement domAttribute = driver.findElement(locator);
        Assert.assertEquals(domAttribute.getDomAttribute(attribute), "true", "Element is readonly");
    }

    public void getDOMAttribute(By locator, String attribute) {
        String domAttribute = driver.findElement(locator).getDomAttribute(attribute);
        System.out.println("Attribute of locator is: " + domAttribute);
    }

}
