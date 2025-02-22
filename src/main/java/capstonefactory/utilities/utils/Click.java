package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Click extends BasePage {

    public Click() {
        super();
    }

    public void click(By locator) {
        System.out.println("Clicking on element: " + locator);
        try {
            waiterUtilities.waitForElementToBeClickable(driver, 5, locator);
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void waitAndClick(By locator) {
        waiterUtilities.waitForVisibilityOfElement(driver, 2000, locator);
        click(locator);
    }

    public void clickAndHold(By locator) {
        Actions actions = new Actions(driver);
        System.out.println("Clicks and holds " + locator + " with Actions");
        actions.clickAndHold(driver.findElement(locator)).build().perform();
    }

}
