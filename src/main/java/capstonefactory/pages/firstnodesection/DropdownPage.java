package capstonefactory.pages.firstnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BasePage {

    private final WebElement programLanguage = driver.findElement(By.id("lang"));

    public DropdownPage() {
        super();
    }

    public DropdownPage selectFruitByVisibleText() {
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByVisibleText("Orange");
        System.out.println(select.getFirstSelectedOption().getText());
        return this;
    }

    public DropdownPage selectMultipleSuperHeroes(String [] listItems) {
        Select select = new Select(driver.findElement(By.id("superheros")));
       for (String listItem : listItems) {
           try {
               select.selectByVisibleText(listItem);
           } catch (NoSuchElementException e) {
               System.out.println(listItem + " is not available");
               e.printStackTrace();
           }
       }
        return this;
    }

    public DropdownPage selectProgramLanguage() {
        Select select = new Select(programLanguage);
        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        return this;
    }

    public DropdownPage getLanguageOptions() {
        Select select = new Select(programLanguage);
        List<WebElement> programLang = select.getOptions();
        for (int j = 0; j < programLang.size(); j++) {
            System.out.println(programLang.get(j).getText());
        }
        return this;
    }

    public void selectCountryByValue() {
        Select select = new Select(driver.findElement(By.id("country")));
        select.selectByValue("India");
        System.out.println(select.getFirstSelectedOption().getText());
    }

}
