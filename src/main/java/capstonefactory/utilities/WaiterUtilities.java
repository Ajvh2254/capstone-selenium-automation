package capstonefactory.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaiterUtilities {

    public void waitForVisibilityOfElement(WebDriver webDriver, long timeoutInSeconds, By locator) {
        System.out.println("Waiting for element to be visible");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMillis(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForInvisibilityOfElement(WebDriver webDriver, int milliSeconds, By locator) {
        System.out.println("Waiting for element to be invisible");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMillis(milliSeconds));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(WebDriver webDriver, int timeoutInSeconds, By locator) {
        System.out.println("Waiting for element to be clickable");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMillis(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
