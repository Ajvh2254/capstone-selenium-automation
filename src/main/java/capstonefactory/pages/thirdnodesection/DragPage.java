package capstonefactory.pages.thirdnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class DragPage extends BasePage {

    public DragPage() {
        super();
    }

    public void dragAndDropBox() {
        dragAndDrop.dragAndDropBy(400, 200, By.id("sample-box"));
    }

}
