package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BasePage {

    Actions actions = new Actions(driver);

    public DragAndDrop() {
        super();
    }

    public void dragAndDrop(By sourceLocator, By targetLocator, String expectedText) {
        WebElement elementA = driver.findElement(sourceLocator);
        WebElement elementB = driver.findElement(targetLocator);
        actions.dragAndDrop(elementA, elementB).perform();
        String textTo = elementB.getText();
        if (textTo.equals(expectedText)) {
            System.out.println(sourceLocator + " was dropped at: " + targetLocator);
        } else {
            System.out.println(sourceLocator + " was not dropped at: " + targetLocator);
        }
    }

    public void dragAndDropBy(int x, int y, By locator) {
        WebElement element = driver.findElement(locator);
        System.out.println(locator + " dragged and dropped at " + x + " x coordinates and " + y + " y coordinates");
        actions.dragAndDropBy(element, x, y).build().perform();
    }

    public void slideFromAndTo(WebElement sourceLocator, WebElement targetLocator) {
        System.out.println(sourceLocator + " was dropped at " + targetLocator);
        Action dragAndDrop = actions.clickAndHold(sourceLocator)
                .moveToElement(targetLocator)
                .release(targetLocator)
                .build();
        dragAndDrop.perform();
    }

}
