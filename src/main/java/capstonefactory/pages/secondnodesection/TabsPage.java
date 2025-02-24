package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class TabsPage extends BasePage {

    public TabsPage() {
        super();
    }

    public TabsPage clickHomeBtn() throws InterruptedException {
        click.waitAndClick(By.id("home"));
        waits.sleep();
        return this;
    }

    public TabsPage printTitleNewTab() throws InterruptedException {
        isDisplayed.isElementDisplayed(By.cssSelector("img[alt='letcode']"));
        Thread.sleep(3000);
        return this;
    }

    public TabsPage switchToParentWindow() throws InterruptedException {
        windowUtil.switchToActiveTab(0);
        Thread.sleep(3000);
        return this;
    }

    public TabsPage closeParentWindow() {
        driver.close();
        return this;
    }

}
