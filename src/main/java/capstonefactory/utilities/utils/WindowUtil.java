package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;

import static org.openqa.selenium.WindowType.*;

public class WindowUtil extends BasePage {

    public WindowUtil() {
        super();
    }

    public void openNewWindow() {
        System.out.println("Switch to new tab");
        driver.switchTo().newWindow(TAB);
    }

    public void getWindowSize() {
        System.out.println("Getting window size");
        driver.manage().window().getSize();
    }

    public void switchToActiveTab(int tabNumber) {
        System.out.println("Switching to tab: " + tabNumber);
        driver.switchTo().window(driver.getWindowHandles().toArray()[tabNumber].toString());
    }

    public void switchToOriginalTab(int tabNumber) {
        driver.close();
        System.out.println("Switch to original tab: " + tabNumber);
        switchToActiveTab(tabNumber);
    }

    public void openNewTabURL(String url) {
        System.out.println("Opening new tab by url");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('" + url + "')");
    }

}
