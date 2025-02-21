package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;

public class Alerts extends BasePage {

    public Alerts() {
        super();
    }

    public void acceptAlerts() {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    public void dismissAlerts() {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }

    public void promptAlerts(String text) {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys(text);
    }

}
