package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class DialogPage extends BasePage {

    public DialogPage() {
        super();
    }

    public DialogPage clickSimpleAlertBtn() {
        click.waitAndClick(By.cssSelector("#accept.button.is-link"));
        return this;
    }

    public DialogPage acceptSimpleAlertBtn() {
        alerts.acceptAlerts();
        return this;
    }

    public DialogPage clickConfirmAlertBtn() {
        click.waitAndClick(By.className("button is-link is-outlined"));
        return this;
    }

    public DialogPage dismissConfirmAlertBtn() {
        alerts.dismissAlerts();
        return this;
    }

    public DialogPage clickPromptAlertBtn() {
        click.waitAndClick(By.xpath("//button[@id='prompt']"));
        return this;
    }

    public DialogPage fillOutPromptAlert() {
        alerts.promptAlerts("Craig Schmitt");
        return this;
    }

    public DialogPage acceptPromptAlert() {
        alerts.acceptAlerts();
        return this;
    }

    public DialogPage clickModernAlertBtn() {
        click.waitAndClick(By.cssSelector("#modern.button.is-success"));
        return this;
    }

    public void dismissModernAlert() {
        click.waitAndClick(By.xpath("//button[@aria-label='close']"));
    }

}
