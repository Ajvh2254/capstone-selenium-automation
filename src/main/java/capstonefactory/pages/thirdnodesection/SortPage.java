package capstonefactory.pages.thirdnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class SortPage extends BasePage {

    public SortPage() {
        super();
    }

    public void moveTODOElementsToDone() {
        By parentContainer = By.xpath("(//div[@class='cdk-drop-list example-list'])[2]");
        By childContainer = By.xpath("(//div[@class='cdk-drop-list example-list'])[1]//div[1]");
        dragAndDrop.slideFromAndTo(childContainer, parentContainer);
        dragAndDrop.slideFromAndTo(childContainer, parentContainer);
        dragAndDrop.slideFromAndTo(childContainer, parentContainer);
        dragAndDrop.slideFromAndTo(childContainer, parentContainer);
    }

}
