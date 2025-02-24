package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class TabsPage extends BasePage {

    public TabsPage() {
        super();
    }

    public TabsPage clickHomeBtn() throws InterruptedException {
        click.waitAndClick(By.id("home"));
        return this;
    }

    public TabsPage printTitleNewTab() throws InterruptedException {
        isDisplayed.isElementDisplayed(By.cssSelector("img[alt='letcode']"));
        return this;
    }

    public TabsPage switchToChildWindow(){
        windowUtil.switchToActiveTab(1);
        return this;
    }

    public TabsPage closeChildWindow() {
        windowUtil.switchToOriginalTab(0);
        return this;
    }

    public TabsPage clickMultipleWindowsBtn() {
        click.waitAndClick(By.xpath("//button[@id='multi']"));
        return this;
    }

    public TabsPage printWindowTitle() {
        isDisplayed.isElementDisplayed(By.cssSelector("img[alt='letcode']"));
        return this;
    }

    public TabsPage switchToDropdownPage() {
        windowUtil.switchToActiveTab(1);
        return this;
    }

    public TabsPage closeDropdownPage() {
        windowUtil.switchToOriginalTab(1);
        return this;
    }

    public void closeAlertPage() {
        windowUtil.switchToOriginalTab(0);
    }

}
