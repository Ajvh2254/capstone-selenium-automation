package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import capstonefactory.utilities.WaiterUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Click extends BasePage {

    WaiterUtilities waiterUtilities = new WaiterUtilities();

    public Click() {
        super();
    }

    public void click(By locator) {
        System.out.println("Clicking on element using JavaScript: " + locator);
        try {
            waiterUtilities.waitForElementToBeClickable(driver, 5, locator);
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            System.out.println("Failed to click on element using JavaScript: " + locator);
            e.printStackTrace();
        }
    }

    public void waitAndClick(By locator, long milliseconds) {
        System.out.println("Waiting for element to be visible: " + locator);
        waiterUtilities.waitForVisibilityOfElement(driver, milliseconds, locator);
        click(locator);
        System.out.println("Clicked on element: " + locator);
    }

    public void waitAndClick(By locator) {
        waitAndClick(locator, 2000);
    }

}
