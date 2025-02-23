package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditPage extends BasePage {

    By fullName = By.id("fullName");

    public EditPage() {
        super();
    }

    public EditPage clickFullNameTextBox() {
        click.waitAndClick(fullName);
        return this;
    }

    public void editApplication(String fullNames, String text) {
        sendKeys.sendKeys(fullName, fullNames);
        sendKeys.sendKeysTAB(fullName);

        By appendText = By.cssSelector("#join.input");
        driver.findElement(appendText).sendKeys(Keys.ARROW_RIGHT);
        sendKeys.sendKeys(appendText, text);
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
