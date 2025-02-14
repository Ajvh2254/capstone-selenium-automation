package capstonefactory.pages;

import capstonefactory.base.BasePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    public HomePage openLetCodePage() {
        driver.get("https://letcode.in/test");
        return this;
    }

    private By parentSectionContainer(NodeMenuEnums btnSelection) {
        return By.xpath(String.format("(//section)[2]//app-menu//footer//a[contains(text(), '%s')]", btnSelection.getText()));
    }

    public void selectTestSection(NodeMenuEnums btnSelection) {
        By parentSection = parentSectionContainer(btnSelection);
        click.waitAndClick(parentSection);
    }

}
