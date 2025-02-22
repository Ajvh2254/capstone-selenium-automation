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
            System.out.println("Element was dropped at: " + targetLocator);
        } else {
            System.out.println("Element was not dropped at location");
        }
    }

    public void dragAndDropBy(int x, int y, By locator) {
        WebElement element = driver.findElement(locator);
        actions.dragAndDropBy(element, x, y).build().perform();
    }

    public void slideFromAndTo(WebElement sourceLocator, WebElement targetLocator) {
        Action dragAndDrop = actions.clickAndHold(sourceLocator)
                .moveToElement(targetLocator)
                .release(targetLocator)
                .build();
        dragAndDrop.perform();
    }

}
