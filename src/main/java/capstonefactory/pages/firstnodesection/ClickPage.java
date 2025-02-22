package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

public class ClickPage extends BasePage {

    public ClickPage() {
        super();
    }

    public ClickPage isButtonHeaderDisplayed() {
        isDisplayed.waitAndIsDisplayed(By.linkText(" Button"));
        return this;
    }

    public ClickPage getCoordinates() {
        Point location = driver.findElement(By.id("position")).getLocation();
        System.out.println("Location of X: " + location.getX() + "," + "Location of Y: " + location.getY());
        return this;
    }

    public ClickPage getColor() {
        String btnColor = driver.findElement(By.id("color")).getCssValue("background-color");
        System.out.println("Button color is: " + btnColor);
        return this;
    }

    public ClickPage getSize() {
        Dimension size = driver.findElement(By.cssSelector("#property.button.is-success")).getSize();
        System.out.println("Width of button: " + size.getWidth() + "," + "Height of button: " + size.getHeight());
        return this;
    }

    public ClickPage isBtnDisabled() {
        isEnabled.isDisabled(By.xpath("//button[@title='Disabled button']"));
        return this;
    }

    public void clickAndHoldBtn() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//h2[contains(text(), ' Button Hold!')]"))).build().perform();
    }

}
