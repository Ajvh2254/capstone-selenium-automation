package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage { // //div[@id=’parentContainer’]/childElement[@name=’Edit’]

    public LandingPage() {
        super();
    }

    public LandingPage openLetCodePage() {
        driver.get("https://letcode.in/test");
        return this;
    }

}
