package capstonefactory.pages.fourthnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormsPage extends BasePage {

    public FormsPage() {
        super();
    }

    public void fillOutForm() {
        By firstName = By.id("firstname");
        click.waitAndClick(firstName);
        sendKeys.sendKeys(firstName, "Crunk");
        sendKeys.sendKeysTAB(firstName);

        By lastName = By.id("lasttname");
        sendKeys.sendKeys(lastName, "Beck-Davis");
        sendKeys.sendKeysTAB(lastName);

        By email = By.cssSelector("#email.input");
        sendKeys.sendKeysRIGHT(email);
        sendKeys.sendKeys(email, "yahoo.net");
        sendKeys.sendKeysTAB(email);

        By areaCode = By.xpath("(//div[@class='select'])[1]//select");
        Select select = new Select(driver.findElement(areaCode));
        select.selectByVisibleText("Argentina (+54)");
        System.out.println(select.getFirstSelectedOption().getText());
        sendKeys.sendKeysTAB(areaCode);

        By phoneNumber = By.cssSelector("#Phno.input");
        sendKeys.sendKeys(phoneNumber, "3893645098");
        sendKeys.sendKeysTAB(phoneNumber);

        By address = By.cssSelector("#Addl1.input");
        sendKeys.sendKeys(address, "3602 51st St");
        sendKeys.sendKeysTAB(address);

        By address2 = By.cssSelector("#Addl2.input");
        sendKeys.sendKeys(address2, "n/a");
        sendKeys.sendKeysTAB(address2);

        By state = By.id("state");
        sendKeys.sendKeys(state, "CA");
        sendKeys.sendKeysTAB(state);

        By postalCode = By.xpath("//input[@placeholder='Postal-Code']");
        sendKeys.sendKeys(postalCode, "47567");
        sendKeys.sendKeysTAB(postalCode);

        By country = By.xpath("(//div[@class='select'])[2]//select");
        Select select1 = new Select(driver.findElement(country));
        select1.selectByVisibleText("Andorra");
        System.out.println(select1.getFirstSelectedOption().getText());
        sendKeys.sendKeysTAB(country);

        By calendar = By.cssSelector("#Date.input");
        click.waitAndClick(calendar);
        sendKeys.sendKeys(calendar, "02251994");
        sendKeys.sendKeysTAB(calendar);

        By gender = By.cssSelector("#female");
        click.waitAndClick(gender);
        sendKeys.sendKeysTAB(gender);

        click.waitAndClick(By.xpath("//input[@type='checkbox']"));

        click.waitAndClick(By.cssSelector("input.button.is-primary"));
    }

}
