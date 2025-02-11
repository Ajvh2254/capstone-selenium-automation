package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class EditPage extends BasePage {

    By fullName = By.id("fullName");

    public EditPage() {
        super();
    }

    public EditPage openEditPage() {
        driver.get("https://letcode.in/edit");
        return this;
    }

    public EditPage clickFullNameLink() {
        click.waitAndClick(fullName);
        return this;
    }

    public void editApplication(String fullNames, String text) {
        uiHelper.sendKeys(fullName, fullNames);
        uiHelper.sendKeysTabs(fullName);
        By appendText = By.cssSelector("#join.input");
        uiHelper.sendKeysRight(appendText);
        uiHelper.sendKeys(appendText, text);
        uiHelper.sendKeysTabs(appendText);
        By attributeLocator = By.id("getMe");
        String domAttribute = driver.findElement(attributeLocator).getDomAttribute("placeholder");
        System.out.println("Attribute of locator is: " + domAttribute);
        uiHelper.sendKeysTabs(attributeLocator);
        By clearText = By.id("clearMe");
        driver.findElement(clearText).clear();
        uiHelper.sendKeysTabs(clearText);
    }

}
