package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;

public class Alerts extends BasePage {

    public Alerts() {
        super();
    }

    public void switchToAlert() {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

}
