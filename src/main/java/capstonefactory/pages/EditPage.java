package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
        driver.findElement(fullName).sendKeys(Keys.TAB);
        By appendText = By.cssSelector("#join.input");
        driver.findElement(appendText).sendKeys(Keys.ARROW_RIGHT);
        uiHelper.sendKeys(appendText, text);
        driver.findElement(appendText).sendKeys(Keys.TAB);
        By attributeLocator = By.id("getMe");
        String domAttribute = driver.findElement(attributeLocator).getDomAttribute("placeholder");
        System.out.println("Attribute of locator is: " + domAttribute);
        driver.findElement(attributeLocator).sendKeys(Keys.TAB);
        By clearText = By.id("clearMe");
        driver.findElement(clearText).clear();
        driver.findElement(clearText).sendKeys(Keys.TAB);
    }

}
