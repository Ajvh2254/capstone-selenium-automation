package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class CommonPage extends BasePage {

    public CommonPage() {
        super();
    }

    public static void clickWorkSpaceBtn() {
        By workSpaceBtn = By.cssSelector("a#testing.navbar-item");
        click.waitAndClick(workSpaceBtn, 3000);
    }

}
