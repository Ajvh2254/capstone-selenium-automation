package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    public HomePage openLetCodePage() {
        driver.get("https://letcode.in/test");
        return this;
    }

    private void parentSectionContainer(String nodeMenuEnums, String nodeSelection) {
        WebElement parentElement = driver.findElement(By.xpath("//div[@class='column is-3-desktop is-6-tablet'][%s]"));
        for (int i = 0; i < nodeSelection.length(); i++) {
        }
    }

}
