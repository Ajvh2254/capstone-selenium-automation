package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll extends BasePage {

    public Scroll() {
        super();
    }

    public void scroll(int x, int y) {
        System.out.println("Scrolling on page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + ", " + y + ")");
    }

    public void scrollIntoView(By locator) {
        System.out.println("Scrolling " + locator + " into view");
        WebElement scrollLink = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollLink);
    }

    public void scrollWithActions(By locator) {
        System.out.println("Scrolling to " + locator + " with actions");
        WebElement scrollWithActions = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollWithActions).perform();
    }

}
