package capstonefactory.pages.fourthnodesection;

import capstonefactory.base.BasePage;
import capstonefactory.utilities.utils.Waits;
import org.openqa.selenium.By;

public class WaitsPage extends BasePage {

    public WaitsPage() {
        super();
    }

    public WaitsPage clickSimpleAlert() {
        click.waitAndClick(By.cssSelector("#accept.button.is-link"));
        return this;
    }

    public void waitAndAcceptAlert() {
        Waits.waitAndSleep();
        alerts.acceptAlerts();
    }

}
