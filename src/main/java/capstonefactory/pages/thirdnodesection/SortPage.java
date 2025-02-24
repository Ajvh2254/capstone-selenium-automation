package capstonefactory.pages.thirdnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class SortPage extends BasePage {

    public SortPage() {
        super();
    }

    public void moveTODOElementsToDone() {
        By parentContainer = By.xpath("(//div[@class='cdk-drop-list example-list'])[2]");
        By getToWork = By.xpath("(//div[@class='cdk-drop-list example-list'])[1]//div[1]");
        dragAndDrop.slideFromAndTo(getToWork, parentContainer);
        By pickUpGroceries = By.xpath("(//div[@class='cdk-drop-list example-list'])[1]//div[2]");
        dragAndDrop.slideFromAndTo(pickUpGroceries, parentContainer);
        By goHome = By.xpath("(//div[@class='cdk-drop-list example-list'])[1]//div[3]");
        dragAndDrop.slideFromAndTo(goHome, parentContainer);
        By fallAsleep = By.xpath("(//div[@class='cdk-drop-list example-list'])[1]//div[4]");
        dragAndDrop.slideFromAndTo(fallAsleep, parentContainer);
    }

}
