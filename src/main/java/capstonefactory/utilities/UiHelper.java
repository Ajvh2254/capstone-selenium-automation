package capstonefactory.utilities;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UiHelper extends BasePage {

    public UiHelper() {
        super();
    }

    public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        System.out.println("Sends string text");
        element.sendKeys(text);
    }

    public void sendKeysTAB(By locator) {
        System.out.println("Tabs over to next box");
        driver.findElement(locator).sendKeys(Keys.TAB);
    }

}
