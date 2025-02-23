package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class CommonPage extends BasePage {

    public CommonPage() {
        super();
    }

    public static void clickWorkSpaceBtn() {
        click.waitAndClick(By.cssSelector("a#testing.navbar-item"));
    }

}
