package capstonefactory.pages.thirdnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class DropPage extends BasePage {

    public DropPage() {
        super();
    }

    public void dropAtTargetLocation() {
        dragAndDrop.dragAndDrop(By.cssSelector("#draggable.cdk-drag.drag-box"), By.id("droppable"), "Drop here");
    }

}
