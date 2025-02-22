package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class TogglePage extends BasePage {

    public TogglePage() {
        super();
    }

    public TogglePage isRadioHeaderDisplayed() {
        isDisplayed.waitAndIsDisplayed(By.xpath("//h1[contains(text(), ' Radio & Checkbox')]"));
        return this;
    }

    public TogglePage clickCheckboxOption() {
        click.waitAndClick(By.cssSelector("input#yes"));
        return this;
    }

}
