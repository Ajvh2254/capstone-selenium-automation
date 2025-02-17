package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider extends BasePage {

    public Slider() {
        super();
    }

    public void slideFromAndTo(WebElement sourceLocator, WebElement targetLocator) {
        Actions actions = new Actions(driver);
        Action dragAndDrop = actions.clickAndHold(sourceLocator)
                .moveToElement(targetLocator)
                .release(targetLocator)
                .build();
        dragAndDrop.perform();
    }

}
