package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    public LandingPage() {
        super();
    }

    public LandingPage openLetCodePage() {
        driver.get("https://letcode.in/test");
        return this;
    }

}
