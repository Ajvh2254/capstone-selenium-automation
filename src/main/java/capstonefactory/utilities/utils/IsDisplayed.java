package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class IsDisplayed extends BasePage {

    public IsDisplayed() {
        super();
    }

    public void waitAndIsDisplayed(By locator) {
        waiterUtilities.waitForVisibilityOfElement(driver, 3000, locator);
        WebElement element = driver.findElement(locator);
        if (element.isDisplayed()) {
            System.out.println(locator + " is visible");
        }
    }

    public void waitAndIsNotDisplayed(By locator) {
        try {
            waiterUtilities.waitForInvisibilityOfElement(driver, 3000, locator);
            System.out.println(locator + " is not visible");
        } catch (NoSuchElementException e) {
            System.out.println(locator + " not found, treating as not visible");
        }
    }

    public boolean isElementDisplayed(By locator) {
        try {
            waiterUtilities.waitForVisibilityOfElement(driver, 3000, locator);
            System.out.println(locator + " is visible");
            return true;
        } catch (Exception e) {
            System.out.println(locator + " is not visible");
            return false;
        }
    }

    public boolean isElementNotDisplayed(By locator) {
        try {
            waiterUtilities.waitForInvisibilityOfElement(driver, 3000, locator);
            System.out.println(locator + " is not visible");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(locator + " not found, treating as not visible");
            return true;
        } catch (Exception e) {
            System.out.println(locator + " is visible");
            return false;
        }
    }

}
