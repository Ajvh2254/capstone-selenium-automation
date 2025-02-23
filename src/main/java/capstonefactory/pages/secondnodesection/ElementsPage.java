package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class ElementsPage extends BasePage {

    private final By searchBar = By.xpath("//input[@type='text']");

    public ElementsPage() {
        super();
    }

    public ElementsPage clickSearchBar() {
        click.waitAndClick(searchBar);
        return this;
    }

    public ElementsPage sendKeysToSearchbar(String username) {
        sendKeys.sendKeys(searchBar, username);
        sendKeys.sendKeysReturn(searchBar);
        return this;
    }

    public ElementsPage isImageDisplayed() {
        isDisplayed.isElementDisplayed(By.cssSelector("img.is-rounded"));
        return this;
    }

    public void printSearchInfo() {
        System.out.println(driver.findElement(By.xpath("//span[contains(text(), 'Public Repos')]")));
        System.out.println(driver.findElement(By.xpath("//span[contains(text(), 'Public Gist')]")));
        System.out.println(driver.findElement(By.xpath("//span[contains(text(), 'Followers')]")));
    }

}
