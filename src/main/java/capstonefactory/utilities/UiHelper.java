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
        element.sendKeys(text);
    }

    public void sendKeysTabs(By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.TAB);
    }

}
