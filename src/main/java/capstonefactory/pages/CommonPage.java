package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class CommonPage extends BasePage {

    public CommonPage() {
        super();
    }

    public static void workSpaceBtn() {
        By pageObject = By.cssSelector("a#testing.navbar-item.is-tab");
        click.waitAndClick(pageObject, 3000);
    }

}
