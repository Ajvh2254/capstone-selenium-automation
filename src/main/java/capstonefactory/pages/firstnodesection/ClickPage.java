package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class ClickPage extends BasePage {

    public ClickPage() {
        super();
    }

    public ClickPage clickGoToHomeBtn() {
        click.waitAndClick(By.cssSelector("#home.button.is-link"));
        return this;
    } // X: 166, Y: 416

}
