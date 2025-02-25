package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class EditPage extends BasePage {

    By fullName = By.id("fullName");

    public EditPage() {
        super();
    }

    public EditPage clickFullNameTextBox() {
        click.waitAndClick(fullName);
        return this;
    }

    public void editApplication() {
        sendKeys.sendKeys(fullName, "Darryn Valentino");
        sendKeys.sendKeysTAB(fullName);

        By appendText = By.cssSelector("#join.input");
        sendKeys.sendKeysRIGHT(appendText);
        sendKeys.sendKeys(appendText, " at coding");
        sendKeys.sendKeysTAB(appendText);

        By attributeLocator = By.id("getMe");
        elementAttributes.getDOMAttribute(attributeLocator, "placeholder");
        sendKeys.sendKeysTAB(attributeLocator);

        By clearText = By.id("clearMe");
        driver.findElement(clearText).clear();
        sendKeys.sendKeysTAB(clearText);

        isEnabled.isDisabled(By.id("noEdit"));

        By readonly = By.id("dontwrite");
        click.waitAndClick(readonly);
        elementAttributes.getElementAttributeDOM(readonly, "readonly");
    }

}
