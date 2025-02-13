package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EditPage extends BasePage {

    By fullName = By.id("fullName");

    public EditPage() {
        super();
    }

    public EditPage clickFullNameTextBox() {
        click.waitAndClick(fullName);
        return this;
    }

    public EditPage editApplication(String fullNames, String text) {
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

        By enabledElement = By.id("noEdit");
        isEnabled.isEnabled(enabledElement);
        uiHelper.sendKeysTAB(enabledElement);

        elementAttributes.getElementAttributeDOM(By.id("dontwrite"), "readonly");
        return this;
    }

    public void clickWorkSpaceBtn() {
        CommonPage.workSpaceBtn();
    }

}
