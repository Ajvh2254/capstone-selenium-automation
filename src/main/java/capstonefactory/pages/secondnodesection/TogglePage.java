package capstonefactory.pages.secondnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TogglePage extends BasePage {

    public TogglePage() {
        super();
    }

    public TogglePage clickCheckboxOption() {
        click.waitAndClick(By.cssSelector("input#yes"));
        return this;
    }

    public TogglePage isCheckboxSelected() {
        WebElement selectedCheckbox = driver.findElement(By.cssSelector("#notfoo"));
        Assert.assertTrue(selectedCheckbox.isSelected(), selectedCheckbox + " is not selected");
        System.out.println(selectedCheckbox.isSelected());
        return this;
    }

    public void isCheckboxBtnDisabled() {
        isEnabled.isDisabled(By.cssSelector("#maybe"));
    }

}
