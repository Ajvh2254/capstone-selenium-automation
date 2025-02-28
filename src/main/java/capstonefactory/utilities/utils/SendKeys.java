package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SendKeys extends BasePage {

    public SendKeys() {
        super();
    }

    public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        System.out.println("Sends string text: " + text);
        element.sendKeys(text);
    }

    public void sendKeysTAB(By locator) {
        System.out.println("Tabs over to: " + locator);
        driver.findElement(locator).sendKeys(Keys.TAB);
    }

    public void sendKeysRETURN(By locator) {
        System.out.println("Sends RETURN Key to: " + locator);
        driver.findElement(locator).sendKeys(Keys.RETURN);
    }

    public void sendKeysRIGHT(By locator) {
        System.out.println("Sends right arrow key to: " + locator);
        driver.findElement(locator).sendKeys(Keys.RIGHT);
    }

}
