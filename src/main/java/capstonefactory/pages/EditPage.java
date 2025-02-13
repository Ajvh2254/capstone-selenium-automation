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
        String domAttribute = driver.findElement(attributeLocator).getDomAttribute("placeholder");
        System.out.println("Attribute of locator is: " + domAttribute);
        uiHelper.sendKeysTAB(attributeLocator);
        By clearText = By.id("clearMe");
        driver.findElement(clearText).clear();
        uiHelper.sendKeysTAB(clearText);
        By enabledElement = By.id("noEdit");
        boolean isElementEnabled = driver.findElement(enabledElement).isEnabled();
        Assert.assertTrue(isElementEnabled, "The element is disabled");
        uiHelper.sendKeysTAB(enabledElement);
        WebElement readOnly = driver.findElement(By.id("dontwrite"));
        Assert.assertTrue(readOnly.getDomAttribute("readonly").equals("true"), "Element is readonly");
        return this;
    }

    public void clickWorkSpaceBtn() {
        CommonPage.workSpaceBtn();
    }

}
