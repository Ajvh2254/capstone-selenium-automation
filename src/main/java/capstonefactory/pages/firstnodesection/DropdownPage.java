package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BasePage {

    public DropdownPage() {
        super();
    }

    public DropdownPage selectFruitByVisibleText() {
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByVisibleText("Orange");
        return this;
    }

    public DropdownPage selectSuperHeroes() {
        Select select = new Select(driver.findElement(By.id("superheros")));
        List<WebElement> superHeroes = select.getOptions();
        return this;
    }

}
