package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class TabsPage extends BasePage {

    public TabsPage() {
        super();
    }

    public TabsPage clickHomeBtn() throws InterruptedException {
        click.waitAndClick(By.id("home"));
        Thread.sleep(3000);
        return this;
    }

    public TabsPage printTitleNewTab() throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("//h1[@class='title has-text-centered']")));
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

    public TabsPage openWindowsPage() {
        driver.get("https://letcode.in/windows");
        return this;
    }

}
