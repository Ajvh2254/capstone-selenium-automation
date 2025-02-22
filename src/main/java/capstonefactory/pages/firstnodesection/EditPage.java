package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditPage extends BasePage {

    By fullName = By.id("fullName");

    public EditPage() {
        super();
    }

    public EditPage isInputHeaderDisplayed() {
        isDisplayed.waitAndIsDisplayed(By.xpath("//div[@class='hero-body']//h1"));
        return this;
    }

    public EditPage clickFullNameTextBox() {
        click.waitAndClick(fullName);
        return this;
    }

    public void editApplication(String fullNames, String text) {
        uiHelper.sendKeys(fullName, fullNames);
        uiHelper.sendKeysTAB(fullName);

        By appendText = By.cssSelector("#join.input");
        driver.findElement(appendText).sendKeys(Keys.ARROW_RIGHT);
        uiHelper.sendKeys(appendText, text);
        uiHelper.sendKeysTAB(appendText);

        By attributeLocator = By.id("getMe");
        elementAttributes.getDOMAttribute(attributeLocator, "placeholder");
        uiHelper.sendKeysTAB(attributeLocator);

        By clearText = By.id("clearMe");
        driver.findElement(clearText).clear();
        uiHelper.sendKeysTAB(clearText);

        isEnabled.isDisabled(By.id("noEdit"));

        By readonly = By.id("dontwrite");
        click.waitAndClick(readonly);
        elementAttributes.getElementAttributeDOM(readonly, "readonly");
    }

}
